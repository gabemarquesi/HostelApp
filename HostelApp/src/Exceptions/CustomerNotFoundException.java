/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Gustavo
 */
public class CustomerNotFoundException extends java.lang.Exception{
    String name, lastName;
    
    public CustomerNotFoundException(String message, String name, String lastName){
        super("Customer \""+name+" "+lastName+"\" not found. ("+message+")");
    }
}
