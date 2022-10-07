package com.infodesire.poc.antlr4dsl.model;

public class Expression {

  public static enum Type { NUMBER, BINARY }

  public static enum Operator { MUL("*"), DIV("/"), ADD("+"), SUB("-");

    private final String operatorString;

    private Operator( String operatorString ) {
      this.operatorString = operatorString;
    }

    public static Operator forToken( String operatorString ) {
      for( Operator operator : Operator.values() ) {
        if( operator.operatorString.equals( operatorString.trim() ) ) {
          return operator;
        }
      }
      throw new RuntimeException( "Unknown operator: \"" + operatorString + "\"" );
    }
  }

  private Type type;

  private int number;

  private Expression left;

  private Expression right;

  private Operator operator;

  public Expression( int number ) {
    this.type = Type.NUMBER;
    this.number = number;
  }

  public Expression( Expression left, Expression right, Operator operator ) {

    this.type = Type.BINARY;
    this.left = left;
    this.right = right;
    this.operator = operator;
  }

  public Type getType() {

    return type;
  }

  public int getNumber() {

    return number;
  }

  public Expression getLeft() {

    return left;
  }

  public Expression getRight() {

    return right;
  }

  public Operator getOperator() {

    return operator;
  }

}
