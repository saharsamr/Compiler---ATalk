// Generated from ATalkPass1.g4 by ANTLR 4.7

      import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ATalkPass1Parser}.
 */
public interface ATalkPass1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ATalkPass1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ATalkPass1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(ATalkPass1Parser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(ATalkPass1Parser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ATalkPass1Parser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ATalkPass1Parser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(ATalkPass1Parser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(ATalkPass1Parser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ATalkPass1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ATalkPass1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ATalkPass1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ATalkPass1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ATalkPass1Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ATalkPass1Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ATalkPass1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ATalkPass1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void enterStm_vardef(ATalkPass1Parser.Stm_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void exitStm_vardef(ATalkPass1Parser.Stm_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void enterStm_tell(ATalkPass1Parser.Stm_tellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void exitStm_tell(ATalkPass1Parser.Stm_tellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_write}.
	 * @param ctx the parse tree
	 */
	void enterStm_write(ATalkPass1Parser.Stm_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_write}.
	 * @param ctx the parse tree
	 */
	void exitStm_write(ATalkPass1Parser.Stm_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void enterStm_if_elseif_else(ATalkPass1Parser.Stm_if_elseif_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void exitStm_if_elseif_else(ATalkPass1Parser.Stm_if_elseif_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void enterStm_foreach(ATalkPass1Parser.Stm_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void exitStm_foreach(ATalkPass1Parser.Stm_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void enterStm_quit(ATalkPass1Parser.Stm_quitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void exitStm_quit(ATalkPass1Parser.Stm_quitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_break}.
	 * @param ctx the parse tree
	 */
	void enterStm_break(ATalkPass1Parser.Stm_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_break}.
	 * @param ctx the parse tree
	 */
	void exitStm_break(ATalkPass1Parser.Stm_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStm_assignment(ATalkPass1Parser.Stm_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStm_assignment(ATalkPass1Parser.Stm_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ATalkPass1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ATalkPass1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(ATalkPass1Parser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(ATalkPass1Parser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(ATalkPass1Parser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(ATalkPass1Parser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_tmp(ATalkPass1Parser.Expr_or_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_tmp(ATalkPass1Parser.Expr_or_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(ATalkPass1Parser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(ATalkPass1Parser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_tmp(ATalkPass1Parser.Expr_and_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_tmp(ATalkPass1Parser.Expr_and_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(ATalkPass1Parser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(ATalkPass1Parser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_tmp(ATalkPass1Parser.Expr_eq_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_tmp(ATalkPass1Parser.Expr_eq_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(ATalkPass1Parser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(ATalkPass1Parser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_tmp(ATalkPass1Parser.Expr_cmp_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_tmp(ATalkPass1Parser.Expr_cmp_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(ATalkPass1Parser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(ATalkPass1Parser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(ATalkPass1Parser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(ATalkPass1Parser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(ATalkPass1Parser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(ATalkPass1Parser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(ATalkPass1Parser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(ATalkPass1Parser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_un}.
	 * @param ctx the parse tree
	 */
	void enterExpr_un(ATalkPass1Parser.Expr_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_un}.
	 * @param ctx the parse tree
	 */
	void exitExpr_un(ATalkPass1Parser.Expr_unContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem(ATalkPass1Parser.Expr_memContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem(ATalkPass1Parser.Expr_memContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem_tmp(ATalkPass1Parser.Expr_mem_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem_tmp(ATalkPass1Parser.Expr_mem_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkPass1Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(ATalkPass1Parser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkPass1Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(ATalkPass1Parser.Expr_otherContext ctx);
}