package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.model.Expression;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Interpreter {


  public Expression visit( ParseTree tree ) {

    if( tree.getChildCount() == 1 ) {
      return new Expression( Integer.parseInt( ((TerminalNode) tree.getChild( 0 )).getSymbol().getText() ) );
    }
    else if( tree.getChildCount() == 3 ) {
      if( tree.getChild( 1 ) instanceof TerminalNode ) {
        // BINARY
        String operatorString = ((TerminalNode) tree.getChild( 1 )).getText();
        return new Expression( visit( tree.getChild( 0 ) ), visit( tree.getChild( 2 ) ),
          Expression.Operator.forToken( operatorString ) );
      }
      else {
        // ( expr )
        return visit( tree.getChild( 1 ) );
      }
    }

    throw new RuntimeException( "Unknown rule" );

  }


}


