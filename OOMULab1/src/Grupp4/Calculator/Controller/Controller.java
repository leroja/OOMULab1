/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Controller;

import Grupp4.Calculator.Exeptions.*;
import java.util.*;
import java.io.*;
import Grupp4.Calculator.Model.*;
import Grupp4.Calculator.Model.Tokens.*;
import Grupp4.Calculator.View.*;
/**
 *
 * @author Lennart
 */
public class Controller {
    
    public void run(String input, String Dest) throws InvalidTokenException{
        Messages text = new Messages();
        try {
            
            BufferedReader fil= new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Dest));
            Calculate c = new Calculate();
            
            String line, result;
            text.FileMessage(input, Dest);
            while((line = fil.readLine()) != null){

             // calculate RPN
             // result = c.calc(line);
            
            // write result to file
            // wirter.writer(result);    
            writer.write("");
            writer.newLine();
            }
            writer.close();
            text.Klar();
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
	}
    }
    
    public void run() throws InvalidTokenException{
        Messages text = new Messages();
        Calculate c = new Calculate();
        
        while(true){
        text.InputMessage();
        Scanner scan = new Scanner(System.in); 
        String str =scan.nextLine();
        if (str.isEmpty() == true){
        text.EndMessage();
        System.exit(0);
        }
        else{
            c.calc(str);
            //TestRun(str);
        }   
        }
    }


static public void TestRun(String str){
    Operand t7;
    t7 = new Operand();
    t7.SetOperand(6);
    Operand result;
    int i;
    
    Token t1 = new Token();
    Token test = new Token();
    test.setToken(t7);
    TestStack hey = new TestStack();
    hey.push(test);
    t1 = hey.pop();
    result = (Operand) t1.getToken();
    i = result.getOperand();
    System.out.println(i);
}
}
     

