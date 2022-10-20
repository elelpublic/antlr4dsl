parser grammar BSMLParser;

// Read this: https://groups.google.com/g/antlr-discussion/c/t4vo3IVLZe4

options {
    tokenVocab=BSMLLexer;
}

prog
    : EOF
    | query EOF
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
    : field comparator VALUE
    | orExpression
    ;

orExpression
    : OR LCURLY
        queryExpression*
      RCURLY
    ;

comparator
    : LESS
    | LESS_OR_EQUAL
    | EQUAL
    | NOT_EQUAL
    | GREATER
    | GREATER_OR_EQUAL
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
