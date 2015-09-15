/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

/**
 *
 * @author Lennart
 */
public class Operator extends Token{
//    private Operand left, right;
//    //private char opeartor;
//    private Operator operator;
    private char operator;
    
//    public void SetOperator(char operator){
//        this.operator = operator;
//    }
    
    
//    public Double Calc(Operator Op){
//        return 0.0;
//    }
    
    public char getOperator(){
        return this.operator;
    }
    
}

