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
 */
public class Operator extends Token{
    
    public Operator(){
    } 
    


    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        return super.Calc(stack); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}

