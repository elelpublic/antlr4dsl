package com.infodesire.poc.antlr4dsl;

import com.infodesire.poc.antlr4dsl.parser.ExprBaseVisitor;
import com.infodesire.poc.antlr4dsl.parser.ExprParser;

public class Interpreter extends ExprBaseVisitor<String> {


  public String visitExpr( ExprParser.ExprContext ctx ) {

    visitChildren( ctx );
    if( ctx.getChildCount() == 1 ) {
      System.out.println( "Integer: " + ctx.getText() );
    }
    return null;

  }


}


