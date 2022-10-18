package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.model.BsmlElement;
import com.infodesire.poc.antlr4dsl.parser.BSMLLexer;
import com.infodesire.poc.antlr4dsl.parser.BSMLParser;
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

public class Compiler {


  public BsmlElement visit( ParseTree node, Parser parser ) {

    if( node instanceof BSMLParser.ProgContext  ) {
      return visit( node.getChild( 0 ), parser );
    }

    if( node instanceof BSMLParser.LinesContext ) {
      return visitLines( ( BSMLParser.LinesContext ) node, parser );
    }

    throw new BsmlVersionException( node, parser );

  }

  private BsmlElement visitLines( BSMLParser.LinesContext lines, Parser parser ) {
    for( ParseTree child : lines.children ) {
      if( child instanceof BSMLParser.LineContext ) {
        visitLine( ( BSMLParser.LineContext) child, parser );
      }
      else if( child instanceof BSMLParser.LinesContext ) {
        visitLines( (BSMLParser.LinesContext) child, parser );
      }
      else {
        throw new BsmlVersionException( child, parser );
      }
    }
    return null;
  }

  private void visitLine( BSMLParser.LineContext line, Parser parser ) {
    if( line.children.get( 0 ) instanceof BSMLParser.NameContext ) {
      BSMLParser.NameContext nameContext = (BSMLParser.NameContext) line.children.get( 0 );
      String name = nameContext.IDENTIFIER().getSymbol().getText();
      String value = null;
      if( line.children.get( 1 ) instanceof BSMLParser.ValueContext ) {
        BSMLParser.ValueContext valueContext = (BSMLParser.ValueContext) line.children.get( 1 );
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
    return new Compiler().visit( tree, parser );

  }


  class ErrorListener extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
      String msg, RecognitionException e ) {
      throw new BsmlException( recognizer, msg, offendingSymbol, line, charPositionInLine, e );
    }

  }


}


