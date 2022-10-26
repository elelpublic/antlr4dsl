package com.infodesire.bsml.model;

public enum Comparator {

  LESS( "<" ),
  LESS_OR_EQUAL( "<=" ),
  EQUAL( "=" ),
  NOT_EQUAL( "!=" ),
  GREATER( ">" ),
  GREATER_OR_EQUAL( ">= "),
  STARTS_WITH( "STARTS_WITH" ),
  ENDS_WITH( "ENDS_WITH" ),
  LIKE( "LIKE" ),
  CONTAINS( "CONTAINS" );


  private final String token;

  private Comparator( String token ) {
    this.token = token;
  }

  public static Comparator fromToken( String text ) throws ClassNotFoundException {
    for( Comparator comparator : values() ) {
      if( comparator.token.equals( text ) ) {
        return comparator;
      }
    }
    throw new ClassNotFoundException( "Unknown comparator: '" + text + "'" );
  }

}
