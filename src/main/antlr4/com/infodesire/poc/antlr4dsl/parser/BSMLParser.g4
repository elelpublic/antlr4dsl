parser grammar BSMLParser;

// Read this: https://groups.google.com/g/antlr-discussion/c/t4vo3IVLZe4

options {
    tokenVocab=BSMLLexer;
}

prog
    : EOF
    | lines EOF
    ;

lines
    : line
    | lines line
    ;

line
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


