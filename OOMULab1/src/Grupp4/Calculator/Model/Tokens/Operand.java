/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model.Tokens;

import Grupp4.Calculator.Model.Istack;
/**
 *
 * @author Lennart
 */
public class Operand extends Token{
    double tal;
    
    public void SetOperand(double tal){
        this.tal = tal;
    }
    public double  getOperand(){
        return (tal);
    }

    @Override
    public double Calc(Istack stack) {
        return tal;
    }
    
    
}
