package com.infodesire.bsml.model;

import java.util.ArrayList;
import java.util.List;

public class QueryExpression {

  public final ExpressionType type;
  public Comparator comparator;
  public FieldPath fieldPath;
  public String value;
  public BooleanOperator operator;
  public List<QueryExpression> subExpressions = new ArrayList<>();

  public static enum ExpressionType { SIMPLE, BOOLEAN };

  public QueryExpression( FieldPath fieldPath, Comparator comparator, String value ) {
    this.type = ExpressionType.SIMPLE;
    this.fieldPath = fieldPath;
    this.comparator = comparator;
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
