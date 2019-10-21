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
public class CreditCardPayment extends Payment{
    private double amount;
    private String issuer, number, nameOnCard, securityCode;
    private LocalDate expirationDate;
    
    @Override
    public String toString(){
        return ("\nIssuer: "+issuer+
                "\nNumber: "+number+
                "\nName on card: "+nameOnCard+
                "\nSecurity code: "+securityCode+
                "\nExpiration date: "+expirationDate.toString()+
                "\nAmount: "+amount);
    }
    
    public boolean authorize(){
        return true;
    }
}
