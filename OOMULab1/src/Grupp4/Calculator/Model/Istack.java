/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model;

import Grupp4.Calculator.Model.Tokens.Token;

/**
 *
 * @author alexander
 */
public interface Istack {
    
    
    public void push(Token token);
    public Token pop();
    public Token peek();
    public Boolean isEmpty();
    public int stackSize();
}
