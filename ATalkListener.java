// Generated from ATalk.g4 by ANTLR 4.7

      import java.util.ArrayList;

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
	 * Enter a parse tree produced by {@link ATalkParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ATalkParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ATalkParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(ATalkParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(ATalkParser.ReceiverContext ctx);
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
	 * Enter a parse tree produced by {@link ATalkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ATalkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ATalkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ATalkParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ATalkParser.StatementsContext ctx);
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
	 * Enter a parse tree produced by {@link ATalkParser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void enterStm_vardef(ATalkParser.Stm_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void exitStm_vardef(ATalkParser.Stm_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void enterStm_tell(ATalkParser.Stm_tellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void exitStm_tell(ATalkParser.Stm_tellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_write}.
	 * @param ctx the parse tree
	 */
	void enterStm_write(ATalkParser.Stm_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_write}.
	 * @param ctx the parse tree
	 */
	void exitStm_write(ATalkParser.Stm_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void enterStm_if_elseif_else(ATalkParser.Stm_if_elseif_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void exitStm_if_elseif_else(ATalkParser.Stm_if_elseif_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void enterStm_foreach(ATalkParser.Stm_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void exitStm_foreach(ATalkParser.Stm_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void enterStm_quit(ATalkParser.Stm_quitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void exitStm_quit(ATalkParser.Stm_quitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_break}.
	 * @param ctx the parse tree
	 */
	void enterStm_break(ATalkParser.Stm_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_break}.
	 * @param ctx the parse tree
	 */
	void exitStm_break(ATalkParser.Stm_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStm_assignment(ATalkParser.Stm_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStm_assignment(ATalkParser.Stm_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ATalkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ATalkParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(ATalkParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(ATalkParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(ATalkParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(ATalkParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_tmp(ATalkParser.Expr_or_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_tmp(ATalkParser.Expr_or_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(ATalkParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(ATalkParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_tmp(ATalkParser.Expr_and_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_tmp(ATalkParser.Expr_and_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(ATalkParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(ATalkParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_tmp(ATalkParser.Expr_eq_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_tmp(ATalkParser.Expr_eq_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(ATalkParser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(ATalkParser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_tmp(ATalkParser.Expr_cmp_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_tmp(ATalkParser.Expr_cmp_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(ATalkParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(ATalkParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(ATalkParser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(ATalkParser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(ATalkParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(ATalkParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(ATalkParser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(ATalkParser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void enterExpr_un(ATalkParser.Expr_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void exitExpr_un(ATalkParser.Expr_unContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem(ATalkParser.Expr_memContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem(ATalkParser.Expr_memContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem_tmp(ATalkParser.Expr_mem_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem_tmp(ATalkParser.Expr_mem_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATalkParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(ATalkParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATalkParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(ATalkParser.Expr_otherContext ctx);
}