package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.model.Expression;
import com.infodesire.poc.antlr4dsl.parser.ExprLexer;
import com.infodesire.poc.antlr4dsl.parser.ExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class InterpreterTest {

  @Test
  public void simpleBinaryExpression() {

    Expression expression = parse( "1 + 2" );

    assertEquals( Expression.Type.BINARY, expression.getType() );
    assertEquals( Expression.Type.NUMBER, expression.getLeft().getType() );
    assertEquals( Expression.Type.NUMBER, expression.getRight().getType() );
    assertEquals( Expression.Operator.ADD, expression.getOperator() );

    assertEquals( 1, expression.getLeft().getNumber() );
    assertEquals( 2, expression.getRight().getNumber() );

  }

  private Expression parse( String code ) {
    CharStream input = CharStreams.fromString( code );
    ExprLexer lexer = new ExprLexer( input );
    ExprParser parser = new ExprParser( new CommonTokenStream( lexer ) );
    ParseTree tree = parser.expr();
    return new Interpreter().visit( tree );
  }

}