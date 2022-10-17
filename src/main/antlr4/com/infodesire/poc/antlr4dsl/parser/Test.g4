grammar Test;

test
    : block EOF
    ;

block
    : commandLine
    | commandLine NEWLINE block
    ;

commandLine
    : command ':' parameter
    ;

command
    : LS
    | PS
    ;

LS  : 'ls'
    ;

PS  : 'ps'
    ;

parameter
    : IDENTIFIER
    ;

IDENTIFIER
    : [a-z]+
    ;

WHITESPACE
    : [ \t] -> skip
    ;

NEWLINE
    : [\r\n]
    ;