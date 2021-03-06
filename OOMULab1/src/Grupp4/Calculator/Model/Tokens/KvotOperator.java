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
    
     
     
/**
 *
 * @param stack
 * @return
 * @throws DivideByZeroException 
 */
    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        double r, Right, Left;
        Token tok;
        
        tok = stack.pop();
        Right = tok.Calc(stack);
        
        tok = stack.pop();
        Left = tok.Calc(stack);
        
        if(Right == 0){
            throw new DivideByZeroException(Double.toString(Left) + " / " + Double.toString(Right));
        }
                
        r = Left / Right;
        return r;
    }
    
}
