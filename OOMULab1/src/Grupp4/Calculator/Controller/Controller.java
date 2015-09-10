/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Controller;

import java.util.*;
import java.io.*;
import Grupp4.Calculator.Model.*;
/**
 *
 * @author Lennart
 */
public class Controller {
    public void run(String input, String Dest){
        try {
//            File file = new File("test.txt");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
           // File file = new File(Dest);
            
            BufferedReader fil= new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Dest));
 //           FileWriter writer = new FileWriter(Dest);
            
            String line;
            while((line = fil.readLine()) != null){
//                StringTokenizer st = new StringTokenizer(line);
//                while (st.hasMoreTokens()) {
//                    // add tokens to stack
//                }
             // calculate RPN
            
            // write result to file
            writer.write("");
            writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
//            e.printStackTrace();
            
	}
    }
    
    public void run(){
        
        
        while(true){
            
            break;
        }
       
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            String str = scan.next();
        
            System.out.println(str);
        }
        System.exit(0);
    }
}


