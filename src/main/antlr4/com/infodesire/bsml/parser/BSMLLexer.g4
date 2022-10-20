lexer grammar BSMLLexer;


// LEXER ---------------------------------------------

// keywords

QUERY: 'query';
WHERE: 'where';
OR: 'or';

// query operators
LESS: '<'  -> pushMode( UNTIL_EOL );
LESS_OR_EQUAL: '<='  -> pushMode( UNTIL_EOL );
EQUAL: '='  -> pushMode( UNTIL_EOL );
NOT_EQUAL: '!='  -> pushMode( UNTIL_EOL );
GREATER: '>'  -> pushMode( UNTIL_EOL );
GREATER_OR_EQUAL: '>='  -> pushMode( UNTIL_EOL );

// language elements
LCURLY
    : '{'
    ;

RCURLY
    : '}'
    ;

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9]*
    ;

COLON
    : ':' -> pushMode( UNTIL_EOL )
    ;

NEWLINE
    : [\r\n] -> skip
    ;

WHITESPACE
    : [ \t] -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

// parse a value until end of line EOL
mode UNTIL_EOL;

VALUE
    : .*? EOL -> popMode
    ;

EOL
    : [\r\n]
    ;
