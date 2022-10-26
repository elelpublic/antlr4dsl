parser grammar WikiParser;

// Read this: https://groups.google.com/g/antlr-discussion/c/t4vo3IVLZe4

options {
    tokenVocab=WikiLexer;
}

page
    : wiki
    ;

wiki
    : WIKI
    ;

