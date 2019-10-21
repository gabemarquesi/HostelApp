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
public class ReservationNotFoundException extends java.lang.Exception{
    private String name, lastName;
    
    public ReservationNotFoundException(String message, String name, String lastName){
        super("Reservation not found for \""+name+" "+lastName+"\". ("+message+")");
    }
}
