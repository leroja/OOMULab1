/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;


import grupp4.calculator.exeptions.*;

/**
 *
 * @author Lennart
 */
public interface ViewInterface {
    public void RenameThisFunction(String[] args) throws InvalidTokenException, DivideByZeroException;
}
