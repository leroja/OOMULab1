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
public class KvotOperator extends Operator{

    public KvotOperator() {
    }
    
    @Override
     public String toString(){
        return ("/");
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
            Right = (Oper.Calc(stack));
        }else{
            Op = new Operand();
            Op = (Operand)tok.getToken();
            Right = (Op.Calc(stack));
        }
        tok = new Token();
        tok = stack.pop();
        if("Char".equals(tok.getType())){
            Oper = new Operator();
            Oper = (Operator)tok.getToken();
            Left = (Oper.Calc(stack));
        }else{
            Op = new Operand();
            Op = (Operand)tok.getToken();
            Left = (Op.Calc(stack));
        }
        
        if(Right == 0){
            throw new DivideByZeroException(Double.toString(Left),"/",Double.toString(Right));
        }
                
        r = Left / Right;
        return r;
    }
    
}
