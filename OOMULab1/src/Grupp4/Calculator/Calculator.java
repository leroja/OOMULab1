/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator;


import Grupp4.Calculator.Controller.Controller;
import Grupp4.Calculator.Exeptions.*;

/**
 *
 * @author Lennart
 */
public class Calculator {
    public static void main(String[] args) throws InvalidTokenException, DivideByZeroException {
        
        try{
            if(args.length == 0){
                Controller controll = new Controller();
                controll.run();
            }else if(args.length == 2){
                Controller controll = new Controller();
                controll.run(args[0], args[1]);

            }else{
                throw new WrongSyntax();
            }
        
        }catch(WrongSyntax ws){
            System.out.println(ws.getMessage());
        }
    }
    
    
    
}
