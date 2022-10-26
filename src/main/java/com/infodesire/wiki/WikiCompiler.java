package com.infodesire.wiki;

import com.infodesire.wiki.WikiException;
import com.infodesire.wiki.parser.WikiLexer;
import com.infodesire.wiki.parser.WikiParser;
import com.infodesire.wiki.model.WikiElement;
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

/**
 * Parse BSM wiki language and compile it to a wiki syntax tree
 */
public class WikiCompiler {


  public WikiElement visit( ParseTree node, Parser parser ) {
    return null;
  }


  public WikiElement compile( File file, Charset encoding ) throws IOException {

    Reader reader = new InputStreamReader( new FileInputStream( file ), encoding );
    CharStream input = CharStreams.fromReader( reader );
    return compile( input );

  }

  private WikiElement compile( CharStream input ) {

    ANTLRErrorListener listener = new ErrorListener();

    WikiLexer lexer = new WikiLexer( input );
    lexer.removeErrorListeners();
    lexer.addErrorListener( listener );

    WikiParser parser = new WikiParser( new CommonTokenStream( lexer ) );
    parser.removeErrorListeners();
    parser.addErrorListener( listener );

    ParseTree tree = parser.page();
    return new WikiCompiler().
      visit( tree, parser );

  }


  class ErrorListener extends BaseErrorListener {

    public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                             String msg, RecognitionException e ) {

      throw new WikiException( recognizer, msg, offendingSymbol, line, charPositionInLine, e );
    }

  }

}



