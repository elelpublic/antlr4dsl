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
    : field comparator value
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

field
    : IDENTIFIER
    ;

queryPropertyLine
    : queryProperty
    | emptyLine
    ;

emptyLine
    : WHITESPACE* NEWLINE
    ;

queryProperty
    : name COLON value
    ;

name
    : IDENTIFIER
    ;

value
    : VALUE
    ;
