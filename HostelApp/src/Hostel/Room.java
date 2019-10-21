/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel;

/**
 *
 * @author Gustavo
 */
public class Room {
    private int number;
    double dimension;
    
    @Override
    public String toString(){
        return ("\nRoom number: "+number+
                "\nDimension: "+dimension);
    }
}
