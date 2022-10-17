lexer grammar BSMLLexer;


// LEXER ---------------------------------------------

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9]*
    ;

COLON
    : ':' -> pushMode( UNTIL_EOL )
    ;

WHITESPACE
    : [ \t] -> skip
    ;

NEWLINE
    : [\r\n]
    ;


// ------------------------------------------------------
// values can go as far as EOL
mode UNTIL_EOL;

VALUE
    : ~[\r\n]*
    ;

EOL
    : [\r\n] -> popMode
    ;

