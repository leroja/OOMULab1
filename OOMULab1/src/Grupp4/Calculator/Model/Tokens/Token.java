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
 * @param <T>
 */
public class Token<T>{
    private T t;
    private String Type;
    
    public void SetType(String newType){
        Type = newType;
    }
    
    public String getType(){
        return (Type);
    }
    
    @Override
    public String toString(){
        return( "Token consists of type" + Type + "whcih is"+ t);
    }
    
   public void setToken (T newToken){t = newToken;}
   
    public T getToken(){
        return t;
    }
    
    public double Calc(Istack stack) throws DivideByZeroException{
        return 0;

    }
}
