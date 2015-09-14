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
    private String Type;
    
    public void SetType(String newType){
        Type = newType;
    }
    
    public String getType(){
        return (Type);
    }
    
   public void setToken (T newToken){t = newToken;}
   
    public T getToken(){return t;}
}
