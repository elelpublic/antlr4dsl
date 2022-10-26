package com.infodesire.bsml;

import com.infodesire.bsml.model.BsmlElement;
import com.infodesire.bsml.model.Query;
import com.infodesire.bsml.parser.BSMLLexer;
import com.infodesire.bsml.parser.BSMLParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class BsmlCompiler {


  public BsmlElement visit( ParseTree node, Parser parser ) {

    if( node instanceof BSMLParser.ProgContext  ) {
      return visit( node.getChild( 0 ), parser );
    }

    if( node instanceof com.infodesire.bsml.parser.BSMLParser.QueryPropertiesContext ) {
      return visitLines( ( BSMLParser.QueryPropertiesContext ) node, parser );
    }

    if( node instanceof BSMLParser.QueryContext ) {
      return visitQuery( (BSMLParser.QueryContext) node );
    }

    throw new BsmlVersionException( node, parser );

  }

  private BsmlElement visitQuery( BSMLParser.QueryContext node ) {
    return new Query();
  }

  private BsmlElement visitLines( BSMLParser.QueryPropertiesContext properties, Parser parser ) {
    for( ParseTree child : properties.children ) {
      if( child instanceof BSMLParser.QueryPropertyContext ) {
        visitLine( ( BSMLParser.QueryPropertyContext) child, parser );
      }
      else if( child instanceof BSMLParser.QueryPropertiesContext ) {
        visitLines( (BSMLParser.QueryPropertiesContext) child, parser );
      }
      else {
        throw new BsmlVersionException( child, parser );
      }
    }
    return null;
  }

  private void visitLine( BSMLParser.QueryPropertyContext property, Parser parser ) {
    if( property.children.get( 0 ) instanceof BSMLParser.NameContext ) {
      BSMLParser.NameContext nameContext = (BSMLParser.NameContext) property.children.get( 0 );
      String name = nameContext.IDENTIFIER().getSymbol().getText();
      String value = null;
      if( property.children.get( 1 ) instanceof BSMLParser.ValueContext ) {
        BSMLParser.ValueContext valueContext = (BSMLParser.ValueContext) property.children.get( 1 );
        value = valueContext.VALUE().getText();
      }
      System.out.println( "NAME: " + name + " VALUE: " + value );
    }
  }


  public BsmlElement compile( String code ) {

    CharStream input = CharStreams.fromString( code );
    return compile( input );

  }


  public BsmlElement compile( File file, Charset encoding ) throws IOException {

    Reader reader = new InputStreamReader( new FileInputStream( file ), encoding );
    CharStream input = CharStreams.fromReader( reader );
    return compile( input );

  }

  private BsmlElement compile( CharStream input ) {

    ANTLRErrorListener listener = new ErrorListener();

    BSMLLexer lexer = new BSMLLexer( input );
    lexer.removeErrorListeners();
    lexer.addErrorListener( listener );

    BSMLParser parser = new BSMLParser( new CommonTokenStream( lexer ) );
    parser.removeErrorListeners();
    parser.addErrorListener( listener );

    ParseTree tree = parser.prog();
    return new BsmlCompiler().visit( tree, parser );

  }


  class ErrorListener extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
      String msg, RecognitionException e ) {
      throw new BsmlException( recognizer, msg, offendingSymbol, line, charPositionInLine, e );
    }

  }


}

