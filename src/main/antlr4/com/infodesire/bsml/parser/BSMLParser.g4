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
    : QUERY OPEN (
        queryProperties )*
      CLOSE
    ;

queryProperties
    : queryProperty
    | queryProperties queryProperty
    ;

queryProperty
    : name EOL
    | name EOF
    | name value
    | WHITESPACE* NEWLINE
    ;

name
    : IDENTIFIER WHITESPACE* COLON
    ;

value
    : VALUE EOL
    | VALUE EOF
    ;


