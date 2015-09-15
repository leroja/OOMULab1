/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp4.Calculator.Model;


import Grupp4.Calculator.Exeptions.*;
import Grupp4.Calculator.Model.Tokens.*;
import java.util.*;

/**
 *
 * @author Lennart
 */
public class Calculate {
      
    public Calculate(){
        
    }
    
    public String calc(String Exp) throws InvalidTokenException{
        int test;
        TestStack st = new TestStack();
        StringTokenizer StrTok = new StringTokenizer(Exp);
        String str;
        
        
        try{
            
               while(StrTok.hasMoreTokens()){
                    str = (StrTok.nextToken());
                    if (isNumeric(str)){
                        Token token = new Token();
                        Operand Op = new Operand();
                        Op.SetOperand(Integer.parseInt(str));
                        token.setToken(Op);
                        token.SetType("int");
                        st.push(token);
                    }
                    else if(IsOperator(str)){
                        Operator Oper = new Operator();
                        switch(str){
                            case "+":
                                Oper = new SummaOperator();
        //                        SummaOperator sum = new SummaOperator();
        //                        test = sum.add(st);
        //                        System.out.println(test);
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
                        token.SetType("Char");
                        st.push(token);
                    }else {
                        throw new InvalidTokenException(str);
                    }
//                    else if (isAlpha(str)){
//                      throw new InvalidTokenException(str);
//                    }
//                    else System.out.println("Fel");
//                        //InvalidTokenException: w
                }
        
        while(!st.isEmpty()){
            Token token = new Token();
            Operand Op = new Operand();
            Operator Oper = new Operator();
            
            token = st.pop();
            if("int".equals(token.getType())){
                Op = (Operand)token.getToken();
                System.out.println(Op.getOperand());
            }
            if("Char".equals(token.getType())){
                Oper = (Operator)token.getToken();
                System.out.println(Oper.getOperator());
            }

        }

        
        return "";
        } catch(InvalidTokenException ite){
            System.out.println(ite.getMessage());
            return ite.getMessage();
        }catch(ArithmeticException are){				
            System.out.println(are.getMessage());
            return are.getMessage();
        }
        
    }
 
    
    public boolean isNumeric(String s) {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }
    public boolean IsOperator(String s){
        return s.matches("[+-/*%]");
    }
    public boolean isAlpha(String name) {
    char[] chars = name.toCharArray();

    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }
    return true;
}
}
