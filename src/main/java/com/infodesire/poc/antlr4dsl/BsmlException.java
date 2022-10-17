package com.infodesire.poc.antlr4dsl;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Exception while parsing Bsml code
 *
 */
public class BsmlException extends RuntimeException {


  public BsmlException( Recognizer<?, ?> recognizer, String msg, Object offendingSymbol, int line,
                        int charPositionInLine, RecognitionException ex ) {

    super( componentName( recognizer )
      + ": " + msg
      + "\noffending symbol: " + offendingSymbol
      + "\nline:char: " + line + ":" + charPositionInLine
      , ex );

  }

  private static String componentName( Recognizer<?,?> recognizer ) {
    if( Lexer.class.isAssignableFrom( recognizer.getClass() ) ) {
      return "Lexer";
    }
    else if( Parser.class.isAssignableFrom( recognizer.getClass() ) ) {
      return "Parser";
    }
    else {
      return recognizer.getClass().getSimpleName();
    }
  }


}
