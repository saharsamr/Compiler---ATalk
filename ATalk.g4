lexer grammar ATalk;


fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGITS: [0-9];



ID:        [a-zA-Z_][a-zA-Z0-9_]*;

WS:        [ \r\t\n]+ -> skip;
