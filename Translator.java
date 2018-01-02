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

    public void assignCommand(){
        instructions.add("# start of assign");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("sw $a0, 0($a1)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        popStack();
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

    public void write(){
        instructions.add("# writing");
        instructions.add("lw $a0, 4($sp)");
        this.addSystemCall(1);
        popStack();
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing");
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
}
