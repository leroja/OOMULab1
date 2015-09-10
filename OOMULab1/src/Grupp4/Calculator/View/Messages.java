/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.View;

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
    public void WrongSynatx(){
        System.out.println("”Syntax: java Calculator [källfil destinationsfil]”");
    }
}
