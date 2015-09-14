/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model;

//import Grupp4.Calculator.Model.*;
import Grupp4.Calculator.Model.Tokens.*;
//import Grupp4.Calculator.Model.Tokens.Operand;
//import Grupp4.Calculator.Model.Tokens.Operator;
//import Grupp4.Calculator.Model.Tokens.Token;
import java.util.*;

/**
 *
 * @author Lennart
 */
public class Calculate {
      
    public Calculate(){
        
    }
    
    public String calc(String Exp){
        int test;
        TestStack st = new TestStack();
        StringTokenizer StrTok = new StringTokenizer(Exp);
        String str;
//        Token token = new Token();
//        Operand Op = new Operand();
//        Operator Oper = new Operator();
        
        while(StrTok.hasMoreTokens()){
            str = (StrTok.nextToken());
            if (isNumeric(str)){
                Token token = new Token();
                Operand Op = new Operand();
                Op.SetOperand(Integer.parseInt(str));
                token.setToken(Op);
                st.push(token);
            }
            else if(IsOperator(str)){
                Operator Oper = new Operator();
                switch(str){
                    case "+":
                        Oper = new SummaOperator();
                        SummaOperator sum = new SummaOperator();
                        test = sum.add(st);
                        System.out.println(test);
                        break;
                    case "-":
                        Oper = new DifferensOperator();
                        break;
                    case "*":
                        Oper = new ProduktOperator();
                        break;
                    case "/":
                        Oper = new KvotOperator();
                        break;
                    case "%":
                        Oper = new ModulusOperator();
                        break;
                    default:
                        System.exit(0);
                }
                Token token = new Token();
                token.setToken(Oper);
                st.push(token);
            }
            else System.out.println("Fel");
            
        }
        
//        while(!st.isEmpty()){
//            Token token = new Token();
//            Operand Op = new Operand();
//            token = st.pop();
//            Op =(Operand)token.getToken();
//            System.out.println(Op.getOperand());
//        }
        
        
        return "";
    }
 
    
    public boolean isNumeric(String s) {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }
    public boolean IsOperator(String s){
        return s.matches("[+-/*%]");
    }
}
