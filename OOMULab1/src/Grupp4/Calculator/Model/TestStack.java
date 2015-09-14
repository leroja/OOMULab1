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

    public TestStack(){
        stack = new Token[1000];
        top = -1;
}
    
    @Override
    public void push(Token token){
        top++;
        stack[top]=token;
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
    if(top == -1){
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
