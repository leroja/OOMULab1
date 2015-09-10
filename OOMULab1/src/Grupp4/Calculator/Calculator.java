/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator;


import Grupp4.Calculator.Controller.Controller;

/**
 *
 * @author Lennart
 */
public class Calculator {
    public static void main(String[] args) {
        
        if(args.length == 0){
            Controller controll = new Controller();
            controll.run();
        }else if(args.length == 2){
            Controller controll = new Controller();
            controll.run(args[0], args[1]);
            
        }else{
            System.out.println("Invalid number of arguments");
        }
        

    }
    
    
    
}
