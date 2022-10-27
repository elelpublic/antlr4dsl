parser grammar BSMLParser;

// Read this: https://groups.google.com/g/antlr-discussion/c/t4vo3IVLZe4

options {
    tokenVocab=BSMLLexer;
}

prog
    : programLine*
    ;

programLine
    : query
    | action
    ;

action
    : ACTION LCURLY RCURLY
    ;

query
    : QUERY LCURLY
        queryPropertyLine*
        where?
      RCURLY
    ;

where
    : WHERE LCURLY
        queryExpression*
      RCURLY
    ;

queryExpression
    : fieldPath comparator value
    | booleanExpression
    | emptyLine
    ;

booleanExpression
    : booleanOperator LCURLY
        queryExpression*
      RCURLY
    ;

booleanOperator
    : AND
    | OR
    | NOT
    ;

comparator
    : LESS
    | LESS_OR_EQUAL
    | EQUAL
    | NOT_EQUAL
    | GREATER
    | GREATER_OR_EQUAL
    | STARTS_WITH
    | ENDS_WITH
    | LIKE
    | CONTAINS
    ;

fieldPath
    : field ( DOT field )*
    ;

field
    : FIELD
    ;

queryPropertyLine
    : queryProperty
    | emptyLine
    ;

emptyLine
    : WHITESPACE* NEWLINE
    ;

queryProperty
    : field COLON value
    ;

value
    : VALUE
    ;
