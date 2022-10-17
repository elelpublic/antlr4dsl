package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.model.BsmlElement;
import com.infodesire.poc.antlr4dsl.model.Expression;
import com.infodesire.poc.antlr4dsl.parser.BSMLLexer;
import com.infodesire.poc.antlr4dsl.parser.BSMLParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Compiler {


  public BsmlElement visit( ParseTree tree ) {

    if( tree instanceof BSMLParser.ProgContext  ) {
      return visit( tree.getChild( 0 ) );
    }

//    if( tree instanceof ExprParser.QueryContext ) {
//      return new Query();
//    }

    if( tree.getChildCount() == 1 ) {
      return new Expression( Integer.parseInt( ((TerminalNode) tree.getChild( 0 )).getSymbol().getText() ) );
    }
    else if( tree.getChildCount() == 3 ) {
      if( tree.getChild( 1 ) instanceof TerminalNode ) {
        // BINARY
        String operatorString = ((TerminalNode) tree.getChild( 1 )).getText();
        return new Expression( (Expression) visit( tree.getChild( 0 ) ), (Expression) visit( tree.getChild( 2 ) ),
          Expression.Operator.forToken( operatorString ) );
      }
      else {
        // ( expr )
        return visit( tree.getChild( 1 ) );
      }
    }

    throw new RuntimeException( "Unknown rule" );

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
    return new Compiler().visit( tree );

  }


  class ErrorListener extends BaseErrorListener {

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
      String msg, RecognitionException e ) {
      throw new BsmlException( recognizer, msg, offendingSymbol, line, charPositionInLine, e );
    }

  }


}


