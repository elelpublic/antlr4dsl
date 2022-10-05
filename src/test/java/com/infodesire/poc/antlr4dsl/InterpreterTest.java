package com.infodesire.poc.antlr4dsl;

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
  public void visitIntegers() {

    String code = "1+2";

    CharStream input = CharStreams.fromString( code );
    ExprLexer lexer = new ExprLexer( input );
    ExprParser parser = new ExprParser( new CommonTokenStream( lexer ) );
    ParseTree tree = parser.expr();
    new Interpreter().visit( tree );

    assertTrue( false );

  }

}