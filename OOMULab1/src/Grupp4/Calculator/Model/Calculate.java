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
    /**
     * Calculates target input string
     * @param Exp 
     * @return Calculated result as a string
     * @throws InvalidTokenException
     * @throws DivideByZeroException 
     */
    public String calc(String Exp) throws InvalidTokenException, DivideByZeroException{
        double res;
        Istack st = new StackStack();
        StringTokenizer StrTok = new StringTokenizer(Exp);
        String str;
        Operator Oper;
        
        
        try{
               while(StrTok.hasMoreTokens()){
                    str = (StrTok.nextToken());
                    if (isNumeric(str)){
                        Token token;
                        Operand Op = new Operand();
                        Op.SetOperand(Double.parseDouble(str));
                        token = Op;
                        st.push(token);
                    }
                    else if(IsOperator(str)){
                        switch(str){
                            case "+":
                                Oper = new SummaOperator();
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
                                throw new InvalidTokenException(str);
                        }
                        Token token;
                        token = Oper;
                        st.push(token);
                    }else {
                        throw new InvalidTokenException(str);
                    }
                }
        
            Token token;
            
            token = st.pop();
            res =  token.Calc(st);

            if(!st.isEmpty()){
                throw new InvalidOperationException();
            }
               
        return Double.toString(res);
        
        } catch(InvalidTokenException ite){
            return ite.getMessage();
        }catch(ArithmeticException are){
            return are.getMessage();
        }catch(InvalidOperationException ioe){
            return ioe.getMessage();
        }catch(NumberFormatException nfe){
            System.out.println(nfe.getMessage());
            return nfe.getMessage();
        }catch (DivideByZeroException dbze){
            return dbze.getMessage();
        }
        
    }
 
    /**
     * 
     * @param s
     * @return True if target string equals an operand
     */
    public boolean isNumeric(String s) {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }
    /**
     *
     * @param s
     * @return True if target string equals an operator
     */
    public boolean IsOperator(String s){
        return s.matches("[+-/*%]");
    }

}
