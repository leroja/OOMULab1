/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Exeptions;

/**
 *
 * @author Lennart
 */
public class DivideByZeroException extends Exception{
    
    public DivideByZeroException(String token1, String Oper, String token2){
        super("DivideByZeroException: " + token1 + Oper + token2);
    }
    
}
