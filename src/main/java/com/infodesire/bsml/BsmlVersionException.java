package com.infodesire.bsml;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * The version of the syntax used is not compatible with the compiler.
 *
 */
public class BsmlVersionException extends RuntimeException{


  public BsmlVersionException( ParseTree node, Parser parser ) {
    this( node, parser, null );
  }

  public BsmlVersionException( ParseTree node, Parser parser, String message ) {
    super( "The compiler is incompatible with the syntax. Unable to process node: " + explain( node, parser )
      + ( message == null ? "" : "\nMessage: " + message ) ) ;
  }

  private static String explain( ParseTree node, Parser parser ) {

    String className = node.getClass().getSimpleName();
    if( className.endsWith( "Context" ) ) {
      className = className.substring( 0, className.length() - "Context".length() ).toLowerCase();
    }

    return className + ", text of node: '" + node.getText() + "', rule: " + node.toStringTree( parser );

  }


}


