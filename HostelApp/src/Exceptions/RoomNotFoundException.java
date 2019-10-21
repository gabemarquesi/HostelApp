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
public class RoomNotFoundException extends java.lang.Exception{
    private int number;
    
    public RoomNotFoundException(String message, int number){
        super("Room "+number+" not found. ("+message+")");
    }
}
