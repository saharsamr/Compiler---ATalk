/**
 * Created by vrasa on 12/26/2016.
 */

import java.util.*;
import java.io.*;

public class Translator {

    private File output;
    private ArrayList <String> instructions;
    private ArrayList <String> initInstructions;

    public Translator(){
        instructions = new ArrayList<String>();
        initInstructions = new ArrayList<String>();
        output = new File("out.asm");
        try {
            output.createNewFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void makeOutput(){
        this.addSystemCall(10);
        try {
            PrintWriter writer = new PrintWriter(output);
            checkEquality();
            checkNonEquality();
            addRecieverToScheduler();
            writer.println("main:");
            writer.println("move $fp, $sp");
            for (int i=0;i<initInstructions.size();i++){
                writer.println(initInstructions.get(i));
            }
            for (int i=0;i<instructions.size();i++){
                writer.println(instructions.get(i));
            }
            writer.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void addToStack(int x){
        instructions.add("# adding a number to stack");
        instructions.add("li $a0, " + x);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding a number to stack");

    }

    public void addLable(String s){
      instructions.add(s+":");
    }

    public void addToStack(String s, int adr){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding variable to stack");
        instructions.add("lw $a0, " + adr + "($fp)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding variable to stack");
    }

    public void addAddressToStack(String s, int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding address to stack");
        instructions.add("addiu $a0, $fp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding address to stack");
    }

    public void addGlobalAddressToStack(String s, int adr){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global address to stack");
        instructions.add("addiu $a0, $gp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global address to stack");
    }

    public void popStack(){
        instructions.add("# pop stack");
        instructions.add("addiu $sp, $sp, 4");
        instructions.add("# end of pop stack");
    }

    public void addSystemCall(int x){
        instructions.add("# start syscall " + x);
        instructions.add("li $v0, " + x);
        instructions.add("syscall");
        instructions.add("# end syscall");
    }

    public void initArrElem(int arrSize){
      instructions.add("# start init elem to array");
      for (int i = 0; i < arrSize ; i++) {
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, " + (arrSize-i)*4 + "($sp)");
        instructions.add("addiu $a1, $a1, " + (arrSize-i-1)*-4);
        instructions.add("sw $a0, 0($a1)");
      }
      popStack();
      instructions.add("# end of init arr elem");
    }

    public void assignCommand(boolean varDef){
        instructions.add("# start of assign");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        if(!varDef)
          instructions.add("sw $a0, 0($a1)");
        else
          instructions.add("sw $a1, 0($a0)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of assign");
    }
    public void unaryOperationCommand(String s){
      instructions.add("# operation " + s);
      if(s.equals("-")){
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("neg $a0, $a0");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
      }
      if(s.equals("not")){
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("not $a0, $a0");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
      }
      instructions.add("# end of operation " + s);
    }
    public void checkEquality(){
      instructions.add("checkEquality:");
      instructions.add("bne $a1, $a0, pushFalse");
      instructions.add("li $a2, 1");
      instructions.add("j setResult");
      instructions.add("pushFalse:");
      instructions.add("li $a2, 0");
      instructions.add("setResult:");
      instructions.add("sw $a2, 0($sp)");
      instructions.add("addiu $sp, $sp, -4");
      instructions.add("jr $ra");
    }
    public void checkNonEquality(){
      instructions.add("checkNonEquality:");
      instructions.add("beq $a1, $a0, pushFalse");
      instructions.add("li $a2, 1");
      instructions.add("j setResult");
    }
    public void compareOperationCommand(String s){
      instructions.add("# start of compare operation "+s);
      if(s.equals("<")){
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("slt $a2, $a1, $a0");
        instructions.add("sw $a2, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
      }
      if(s.equals(">")){
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("slt $a2, $a0, $a1");
        instructions.add("sw $a2, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
      }
      if(s.equals("==") || s.equals("<>")){
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        if(s.equals("=="))
            instructions.add("jal checkEquality");
        if(s.equals("<>"))
          instructions.add("jal checkNonEquality");
      }
      instructions.add("# end of operation " + s);
    }
    public void operationCommand(String s){
        instructions.add("# operation " + s);
        if (s.equals("*")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("mul $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("/")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("div $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("+")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("add $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("-")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("or")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("or $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("and")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("and $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("# end of operation " + s);
    }

    public void write(Type tp){
        instructions.add("# writing");
        int size = tp.size()/4;
        for (int i = 0; i < size ; i++) {
          instructions.add("lw $a0, " + (size-i)*4 + "($sp)");
          if (tp.equals(new IntType()))
            this.addSystemCall(1);
          else
            this.addSystemCall(11);
        }
        instructions.add("addiu $sp, $sp, " + 4*size);

        instructions.add("addi $a0, $zero, 10");//print Enter
        this.addSystemCall(11);
        instructions.add("# end of writing");
    }

    public void readFunc(int size){
        instructions.add("# read");
        for (int i = 0 ;i < size ;i++ ) {
          this.addSystemCall(12);
          instructions.add("sw $v0, 0($sp)");
          instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("addi $a0, $zero, 10");//print Enter
        this.addSystemCall(11);
        instructions.add("# end of reading");
    }

    public void addGlobalToStack(int adr){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global variable to stack");
        instructions.add("lw $a0, " + adr + "($gp)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global variable to stack");
    }

    public void addGlobalVariable(int adr, int x){
//        int adr = table.getAddress(s)*(-1);
        initInstructions.add("# adding a global variable");
        initInstructions.add("li $a0, " + x);
        initInstructions.add("sw $a0, " + adr + "($gp)");
        initInstructions.add("# end of adding a global variable");
    }

    public void jumpToLable(String s){
      instructions.add("j " + s);
    }

    public void addInstruction(String s){
      instructions.add(s);
    }

    public void arrayElementOffset(Type tp, int dim){
      instructions.add("# calculate array element offset");
      instructions.add("li $a0, 0");
      int size = tp.size();
      for (int i = dim - 1 ; i >= 0 ; i--) {
        instructions.add("lw $a1, 4($sp)");//access [1]
        popStack();
        try{
          size = tp.dimensionAccess(i+1).size();
        }catch(UndefinedDemensionsException ex){}
        instructions.add("li $a2, " + size);
        instructions.add("mul $a2, $a1, $a2");
        instructions.add("add $a0, $a0, $a2");
      }
      instructions.add("sw $a0, 0($sp)");
      instructions.add("addiu $sp, $sp, -4");
    }

    public void getElement(Type tp){
      instructions.add("# adding array elements to stack");
      instructions.add("lw $a0, 4($sp)");
      popStack();//elem offset
      int elemNum=tp.size()/4;
      int max=elemNum;
      try{
          if( !(tp instanceof ArrayType && tp.getIterationType() instanceof CharacterType)){
          instructions.add("lw $a1, 0($a0)");
          instructions.add("sw $a1, 0($sp)");
          instructions.add("addiu $sp, $sp, -4");
          }
        }catch(UndefinedDemensionsException ex){}

      for (int i = 0; i < max; i++) {
        instructions.add("lw $a1, " + -4*(i) + "($a0)");//address of elem
        instructions.add("sw $a1, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
      }
      instructions.add("# end of adding array elements to stack");
    }

    public void generateConditionCode(String labelName){
      instructions.add("lw $a0, 4($sp)");
      popStack();
      instructions.add("beqz $a0, " + labelName);
    }

    public void makeScheduler(ArrayList <SymbolTableItemActor> actorsList){
      for (int i = 0; i < actorsList.size(); i++)
        actorsList.get(i).addInitRecieverToQueue();
      int index = 0;
      for(;;){
        boolean emptyLists = true;
        for ( index = 0; index <actorsList.size(); index++){
          SymbolTableItemActor actr = actorsList.get(index);
          try{
            String recvrKey = actr.getNextMessage();
            emptyLists = false;
            jumpToLable(recvrKey);
            instructions.add("end_" + recvrKey);
          }catch(NoSuchElementException  ex){}
        }
        if (emptyLists)
          break;
      }
    }

    public void jalToAddToRecieverScheduler(int actorCounter){
      instructions.add("li $t5, " + actorCounter); //shomareye actor ro mirize tu t5.
      instructions.add("jal addRecieverToScheduler");
    }

    public void addRecieverToScheduler(){
      instructions.add("addRecieverToScheduler:");
      instructions.add("lw $t5, 4($t4)");  //shomareye actore ro mirize tu khuneye khalie badie queue.
      instructions.add("addiu $t4, $t4, 4"); //tahe queue ro yeki mibare jolo.
      instructions.add("jr $ra");
    }
}
