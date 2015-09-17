/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

import Grupp4.Calculator.Exeptions.DivideByZeroException;
import Grupp4.Calculator.Model.Istack;
import Grupp4.Calculator.Model.TestStack;

/**
 *
 * @author Lennart
 */
public class Operator extends Token{
//    private Operand left, right;
//    //private char opeartor;
//    private Operator operator;
    protected char operator;
    protected Operand left, right;
    
    public Operator(){
        left = new Operand();
        right = new Operand();
    } 
    
//    public void SetOperator(char operator){
//        this.operator = operator;
//    }
    
    
//    public Double Calc(Operator Op){
//        return 0.0;
//    }
    
    public char getOperator(){
        return this.operator;
    }

    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        return super.Calc(stack); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}

