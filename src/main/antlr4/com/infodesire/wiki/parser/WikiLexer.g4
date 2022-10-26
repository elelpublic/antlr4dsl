lexer grammar WikiLexer;


// LEXER ---------------------------------------------

WIKI
    : 'wiki'
    ;

WHITESPACE
    : [ \t] -> skip
    ;

NEWLINE
    : [\r\n] -> skip
    ;
