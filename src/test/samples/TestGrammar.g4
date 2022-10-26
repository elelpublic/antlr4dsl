grammar TestGrammar;

program:
    programLine*;

programLine
    : expression
    | emptyLine
    ;

emptyLine
    : WS* NL
    ;

expression
    : NAME VALUE
    ;

NAME: 'name';

VALUE: ':' .*? NL;

NL: [\r\n];

WS: [ \t] -> skip;

