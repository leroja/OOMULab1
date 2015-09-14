/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

/**
 *
 * @author Lennart
 * @param <T>
 */
public class Token<T> {
    private T t;
    
   public void setToken (T t){this.t = t;}
   
    public T getToken(){return t;}
}
