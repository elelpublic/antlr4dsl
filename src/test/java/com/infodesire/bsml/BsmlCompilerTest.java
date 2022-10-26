package com.infodesire.bsml;

import com.infodesire.bsml.model.ProgramLine;
import com.infodesire.bsml.model.Query;
import org.junit.Test;

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

  }


}

