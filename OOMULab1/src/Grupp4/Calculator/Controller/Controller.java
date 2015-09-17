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
    /*Runs when program starts with 2 comandline arguments*/
    public void run(String input, String Dest) throws InvalidTokenException, DivideByZeroException{
        Messages text = new Messages();
        try {
            BufferedReader fil= new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Dest));
            Calculate c = new Calculate();
            String line, result;
            
            text.FileMessage(input, Dest);
            while((line = fil.readLine()) != null){
             // calculate RPN
            result = c.calc(line);
            
            // write result to file
            writer.write(result);
            writer.newLine();
            }
            writer.close();
            text.Klar();
        } catch (IOException e) {
            System.out.println(e.getMessage());
	}
    }
    /*Runs when program starts with 0 comandline arguments*/
    public void run() throws InvalidTokenException, DivideByZeroException{
        Messages text = new Messages();
        Calculate c = new Calculate();
        String result;
        
        while(true){
        text.InputMessage();
        Scanner scan = new Scanner(System.in); 
        String str =scan.nextLine();
        if (str.isEmpty() == true){
            text.EndMessage();
            System.exit(0);
        }
        else{
            result = c.calc(str);
            System.out.println("Resultat: "+ result);
        }   
        }
    }
}
     

