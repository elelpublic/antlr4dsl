package com.infodesire.bsml.model;

public enum BooleanOperator {

  AND( "AND" ),
  OR( "OR" ),
  NOT( "NOT" );


  private final String token;

  private BooleanOperator( String token ) {
    this.token = token;
  }

  public static BooleanOperator fromToken( String text ) throws ClassNotFoundException {
    for( BooleanOperator operator : values() ) {
      if( operator.token.equals( text ) ) {
        return operator;
      }
    }
    throw new ClassNotFoundException( "Unknwon boolean operator: '" + text + "'" );
  }

}
