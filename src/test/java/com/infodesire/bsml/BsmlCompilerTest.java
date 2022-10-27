package com.infodesire.bsml;

import com.infodesire.bsml.model.ProgramLine;
import com.infodesire.bsml.model.Query;
import com.infodesire.bsml.model.QueryExpression;
import com.infodesire.bsml.model.Where;
import org.junit.Test;

import static com.infodesire.bsml.model.BooleanOperator.*;
import static com.infodesire.bsml.model.Comparator.LIKE;
import static com.infodesire.bsml.model.Comparator.STARTS_WITH;
import static com.infodesire.bsml.model.QueryExpression.ExpressionType.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class BsmlCompilerTest {


  @Test
  public void simpleQuery() throws IOException {

    File file = new File( "src/test/samples/simple_query.bsml" );
    BsmlCompiler compiler = new BsmlCompiler();

    List<ProgramLine> programLines = compiler.compile( file, Charset.forName( "UTF-8" ) );

    assertEquals( 1, programLines.size() );
    assertTrue( programLines.get( 0 ) instanceof Query );

  }


  @Test
  public void query() throws IOException {

    File file = new File( "src/test/samples/query.bsml" );
    BsmlCompiler compiler = new BsmlCompiler();

    List<ProgramLine> programLines = compiler.compile( file, Charset.forName( "UTF-8" ) );

    assertEquals( 1, programLines.size() );
    assertTrue( programLines.get( 0 ) instanceof Query );

  }


  @Test
  public void complexQuery() throws IOException {

    File file = new File( "src/test/samples/complex_query.bsml" );
    BsmlCompiler compiler = new BsmlCompiler();

    List<ProgramLine> programLines = compiler.compile( file, Charset.forName( "UTF-8" ) );

    assertEquals( 1, programLines.size() );
    assertTrue( programLines.get( 0 ) instanceof Query );

    Query query = (Query) programLines.get( 0 );
    assertEquals( "Interne Projekte", query.name );
    assertEquals( "Projekt", query.type );
    assertEquals( "German", query.language );

    Where where = query.where;
    assertEquals( 3, where.expressions.size() );

    QueryExpression expression = where.expressions.get( 0 );
    assertEquals( SIMPLE, expression.type );
    assertEquals( "Bezeichnung", expression.fieldPath.names.get( 0 ) );

    expression = where.expressions.get( 1 );
    assertEquals( BOOLEAN, expression.type );
    assertEquals( OR, expression.operator );
    assertEquals( 2, expression.subExpressions.size() );

    expression = where.expressions.get( 2 );
    assertEquals( BOOLEAN, expression.type );
    assertEquals( NOT, expression.operator );
    assertEquals( 2, expression.subExpressions.size() );

    QueryExpression subExpression = expression.subExpressions.get( 0 );
    assertEquals( SIMPLE, subExpression.type );

    subExpression = expression.subExpressions.get( 1 );
    assertEquals( BOOLEAN, subExpression.type );
    assertEquals( AND, subExpression.operator );
    assertEquals( 1, subExpression.subExpressions.size() );

    QueryExpression subSubExpression = subExpression.subExpressions.get( 0 );
    assertEquals( BOOLEAN, subSubExpression.type );
    assertEquals( OR, subSubExpression.operator );
    assertEquals( 2, subSubExpression.subExpressions.size() );

    QueryExpression subSubSubExpression = subSubExpression.subExpressions.get( 0 );
    assertEquals( SIMPLE, subSubSubExpression.type );
    assertEquals( LIKE, subSubSubExpression.comparator );
    assertEquals( "Kunde", subSubSubExpression.fieldPath.names.get( 0 ) );
    assertEquals( "Name", subSubSubExpression.fieldPath.names.get( 1 ) );
    assertEquals( "IBM", subSubSubExpression.value );

    subSubSubExpression = subSubExpression.subExpressions.get( 1 );
    assertEquals( SIMPLE, subSubSubExpression.type );
    assertEquals( STARTS_WITH, subSubSubExpression.comparator );
    assertEquals( "Kunde", subSubSubExpression.fieldPath.names.get( 0 ) );
    assertEquals( "Name", subSubSubExpression.fieldPath.names.get( 1 ) );
    assertEquals( "Über", subSubSubExpression.value );

  }


}

