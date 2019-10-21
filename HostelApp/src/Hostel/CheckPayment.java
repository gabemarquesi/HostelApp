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
public class CheckPayment extends Payment{
    private String bankId, bankName, branchNumber;
    
    public String toString(){
        return ("Bank ID: "+bankId+
                "Bank Name: "+bankName+
                "Branch Number: "+branchNumber);
    }
}
