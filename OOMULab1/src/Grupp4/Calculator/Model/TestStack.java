/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model;

import Grupp4.Calculator.Model.Tokens.Token;
import java.util.StringTokenizer;

/**
 *
 * @author Lennart
 */
public class TestStack implements Istack {
    private Token[] stack;
    private int top;

    public void TestStack(){
        top = -1;
        stack = (Token[]) new Object[1000];
}
    
    @Override
    public void push(Token token) {
        stack[top]=token;
        top++;
    }

    @Override
    public Token pop() {
       Token result;
       result = stack[top];
       top--;
       return (result);
    }

    @Override
    public Token peek() {
       Token result;
       result = stack[top];
       return (result);
    }

    @Override
    public Boolean isEmpty() {
    if(top == 0){
        return (true);
    }
    else {
        return (false);
    }
    }  
  
    @Override
    public int stackSize() {
        return(top +1);
    }
        
}
