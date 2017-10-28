// Generated from ATalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ATalkParser}.
 */
public interface ATalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ATalkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ATalkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ATalkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(ATalkParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(ATalkParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#actor_block}.
	 * @param ctx the parse tree
	 */
	void enterActor_block(ATalkParser.Actor_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#actor_block}.
	 * @param ctx the parse tree
	 */
	void exitActor_block(ATalkParser.Actor_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#reciever}.
	 * @param ctx the parse tree
	 */
	void enterReciever(ATalkParser.RecieverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#reciever}.
	 * @param ctx the parse tree
	 */
	void exitReciever(ATalkParser.RecieverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#reciever_block}.
	 * @param ctx the parse tree
	 */
	void enterReciever_block(ATalkParser.Reciever_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#reciever_block}.
	 * @param ctx the parse tree
	 */
	void exitReciever_block(ATalkParser.Reciever_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ATalkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ATalkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(ATalkParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(ATalkParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#defenition_arguments}.
	 * @param ctx the parse tree
	 */
	void enterDefenition_arguments(ATalkParser.Defenition_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#defenition_arguments}.
	 * @param ctx the parse tree
	 */
	void exitDefenition_arguments(ATalkParser.Defenition_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#global_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_var_dec(ATalkParser.Global_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#global_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_var_dec(ATalkParser.Global_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCall_arguments(ATalkParser.Call_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCall_arguments(ATalkParser.Call_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(ATalkParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(ATalkParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(ATalkParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(ATalkParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ATalkParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ATalkParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#assignment_multi}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_multi(ATalkParser.Assignment_multiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#assignment_multi}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_multi(ATalkParser.Assignment_multiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ATalkParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ATalkParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#read_function}.
	 * @param ctx the parse tree
	 */
	void enterRead_function(ATalkParser.Read_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#read_function}.
	 * @param ctx the parse tree
	 */
	void exitRead_function(ATalkParser.Read_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#write_function}.
	 * @param ctx the parse tree
	 */
	void enterWrite_function(ATalkParser.Write_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#write_function}.
	 * @param ctx the parse tree
	 */
	void exitWrite_function(ATalkParser.Write_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#send}.
	 * @param ctx the parse tree
	 */
	void enterSend(ATalkParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#send}.
	 * @param ctx the parse tree
	 */
	void exitSend(ATalkParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ATalkParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ATalkParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ATalkParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ATalkParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(ATalkParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(ATalkParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#and_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(ATalkParser.And_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#and_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(ATalkParser.And_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#equality_op}.
	 * @param ctx the parse tree
	 */
	void enterEquality_op(ATalkParser.Equality_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#equality_op}.
	 * @param ctx the parse tree
	 */
	void exitEquality_op(ATalkParser.Equality_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterComparison_op(ATalkParser.Comparison_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitComparison_op(ATalkParser.Comparison_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(ATalkParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(ATalkParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(ATalkParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(ATalkParser.Mult_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#single_operator_op}.
	 * @param ctx the parse tree
	 */
	void enterSingle_operator_op(ATalkParser.Single_operator_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#single_operator_op}.
	 * @param ctx the parse tree
	 */
	void exitSingle_operator_op(ATalkParser.Single_operator_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#operands}.
	 * @param ctx the parse tree
	 */
	void enterOperands(ATalkParser.OperandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#operands}.
	 * @param ctx the parse tree
	 */
	void exitOperands(ATalkParser.OperandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ATalkParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ATalkParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(ATalkParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(ATalkParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(ATalkParser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(ATalkParser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#foreach_block}.
	 * @param ctx the parse tree
	 */
	void enterForeach_block(ATalkParser.Foreach_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#foreach_block}.
	 * @param ctx the parse tree
	 */
	void exitForeach_block(ATalkParser.Foreach_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#array_init}.
	 * @param ctx the parse tree
	 */
	void enterArray_init(ATalkParser.Array_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#array_init}.
	 * @param ctx the parse tree
	 */
	void exitArray_init(ATalkParser.Array_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ATalkParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ATalkParser.ValueContext ctx);
}