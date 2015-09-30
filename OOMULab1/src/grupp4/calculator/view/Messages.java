/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;

/**
 *
 * @author Lennart
 */
public class Messages {
    
    public Messages(){
        
    }
    
    public void EndMessage(){
        System.out.println("Användaren avslutade applikationen\n");
    }
    
    public void InputMessage(){
        System.out.print("Ange RPN uttryck <retur> (tom sträng = avsluta):");
    }    
    
    public void FileMessage(String Source, String Dest){
        System.out.println("Beräknar RPN uttryck från " + Source + "\nSkriver svaren till " + Dest);
    }
    public void Klar(){
        System.out.println("Beräkningen är klar");
    }
}
