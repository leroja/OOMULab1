/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

import Grupp4.Calculator.Model.TestStack;

/**
 *
 * @author Lennart
 */
public class SummaOperator extends Operator{
    
 public int add(TestStack stack){
    String tok;
    Token token = new Token();
    Token Operator = new Token();
    int one;
    int two;
    Token t4 = new Token();
    Token t5 = new Token();
    Operand t1 = new Operand();
    Operand t2 = new Operand();
    
    token = stack.peek();
    tok = token.getType();
    if (tok == "Char"){
        Operator = stack.pop();
    }
    else if (tok == "int"){
        // fel
    }
       
    token = stack.peek();
    tok = token.getType();
    if (tok == "Char"){
    // switch över olika räkne sätt 
    }
    else {
    t4 = stack.pop();
    t1 = (Operand)t4.getToken();
    t5 = stack.pop();
    t2 = (Operand) t5.getToken();
           one = t1.getOperand();
           two = t2.getOperand();
           return (one + two);
        
    }
     return 0;
 }   
 }


