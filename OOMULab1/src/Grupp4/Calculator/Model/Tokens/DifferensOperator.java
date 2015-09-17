/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

import Grupp4.Calculator.Exeptions.DivideByZeroException;
import Grupp4.Calculator.Model.Istack;

/**
 *
 * @author Lennart
 */
public class DifferensOperator extends Operator{

    public DifferensOperator() {
    }

    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        double r, Right, Left;
        Token tok = new Token();
        Operator Oper = new Operator();
        Operand Op = new Operand();
        
        
        tok = stack.pop();
        if("Char".equals(tok.getType())){
            Oper = new Operator();
            Oper = (Operator)tok.getToken();
            this.right.SetOperand(Oper.Calc(stack));
        }else{
            Op = new Operand();
            Op = (Operand)tok.getToken();
            this.right.SetOperand(Op.Calc(stack));
        }
        tok = new Token();
        tok = stack.pop();
        if("Char".equals(tok.getType())){
            Oper = new Operator();
            Oper = (Operator)tok.getToken();
            this.left.SetOperand(Oper.Calc(stack));
        }else{
            Op = new Operand();
            Op = (Operand)tok.getToken();
            this.left.SetOperand(Op.Calc(stack));
        }
        
        r = this.left.getOperand() - this.right.getOperand();
        return r;
    }
    
}
