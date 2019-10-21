/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel;

import java.time.LocalDate;

/**
 *
 * @author Gustavo
 */
public class Payment {
    protected double amount;
    protected LocalDate dateTime;

    public Payment createPayment(String type){
        if(type == "Cash"){
           return new CashPayment();
        }else if(type == "Check"){
            return new CheckPayment();
        }else if(type == "Credit Card"){
            return new CreditCardPayment();
        }
        
        System.out.println("Unknown Payment Type");
        return null;
    }

}
