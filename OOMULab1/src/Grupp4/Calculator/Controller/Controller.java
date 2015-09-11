/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Controller;

import java.util.*;
import java.io.*;
import Grupp4.Calculator.Model.*;
import Grupp4.Calculator.View.*;
/**
 *
 * @author Lennart
 */
public class Controller {
    public void run(String input, String Dest){
        Messages text = new Messages();
        try {
            
            BufferedReader fil= new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Dest));
            
            
            String line, result;
            text.FileMessage(input, Dest);
            while((line = fil.readLine()) != null){

             // calculate RPN
             // result = 
            
            // write result to file
            // wirter.writer(result);    
            writer.write("");
            writer.newLine();
            }
            writer.close();
            text.Klar();
        } catch (IOException e) {
//            e.printStackTrace();
            
	}
    }
    
    public void run(){
        Messages text = new Messages();
        while(true){
        text.InputMessage();
        Scanner scan = new Scanner(System.in); 
        String str =scan.nextLine();
        if (str.isEmpty() == true){
        text.EndMessage();
        System.exit(0);
        }
        else{
            System.out.println(str);
        }   
        }
    }
}
     

