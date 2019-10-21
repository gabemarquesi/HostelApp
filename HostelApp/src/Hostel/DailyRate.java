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
public class DailyRate extends Room{
    private double price;
    
    public double DailyRate(double price){
        return price*dimension;
    }
}
