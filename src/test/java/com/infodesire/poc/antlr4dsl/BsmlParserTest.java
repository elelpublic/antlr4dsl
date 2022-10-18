package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.model.Expression;
import com.infodesire.poc.antlr4dsl.model.Query;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public class BsmlParserTest {

  //@Test
  public void simpleBinaryExpression() throws IOException {

    File file = new File( "src/test/samples/test1.bsml" );
    Compiler compiler = new Compiler();

    Expression expression = (Expression) compiler.compile( file, Charset.forName( "UTF-8" ) );

    assertEquals( Expression.Type.BINARY, expression.getType() );
    assertEquals( Expression.Type.NUMBER, expression.getLeft().getType() );
    assertEquals( Expression.Type.NUMBER, expression.getRight().getType() );
    assertEquals( Expression.Operator.DIV, expression.getOperator() );

    assertEquals( 10, expression.getLeft().getNumber() );
    assertEquals( 2, expression.getRight().getNumber() );

  }


  @Test
  public void simpleQuery() throws IOException {

    File file = new File( "src/test/samples/query_properties.bsml" );
    Compiler compiler = new Compiler();

    Query query = (Query) compiler.compile( file, Charset.forName( "UTF-8" ) );

  }


}

