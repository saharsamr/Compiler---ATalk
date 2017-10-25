grammar ATalk;

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NATURALDIGIT: [1-9];
fragment ARITHDIGIT: [0-9];

@members{
    void print(String str){
        System.out.println(str);
    }
}

code: (actor)*
        {print("code");}
;

actor: 'actor' ID '<' NATURALNUM '>' '\n' (action_block) 'end' '\n'
        {print("actor");}
;

action_block: (reciever | initialization)*
        {print("action block");}
;

reciever :  'receiver' ID '(' (arguments) ')' '\n' (reciever_block) 'end' '\n'
        {print("reciever block");}
;

arguments : (TYPE ID(',' TYPE ID)* );//type int char array
