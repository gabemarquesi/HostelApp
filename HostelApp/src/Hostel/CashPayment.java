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
public class CashPayment extends Payment{
    private double amountTendered;
    
    @Override
    public String toString(){
        return ("\nAmount Tendered: "+amountTendered+
                "\nAmount: "+amount+
                "\nChange: "+(amountTendered-amount));
    }
}
