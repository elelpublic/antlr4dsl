package com.infodesire.bsml.model;

import java.util.ArrayList;
import java.util.List;

public class QueryExpression {

  final ExpressionType type;
  String field;
  String value;
  BooleanOperator operator;
  List<QueryExpression> subExpressions = new ArrayList<>();

  public static enum ExpressionType { SIMPLE, BOOLEAN };

  public QueryExpression( String field, Comparator comparator, String value ) {
    this.type = ExpressionType.SIMPLE;
    this.field = field;
    this.value = value;
  }

  public QueryExpression( BooleanOperator operator ) {
    this.type = ExpressionType.BOOLEAN;
    this.operator = operator;
  }

  public void add( QueryExpression subExpression ) {
    subExpressions.add( subExpression );
  }

}
