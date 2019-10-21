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
public class Address {
    private String address, zipCode, city, state, country;
    
    public Address(String address, String zipCode, String city, String state, String country){
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
    @Override
    public String toString(){
        return("\nAddress: "+address+
               "\nZip Code: "+zipCode+
               "\nCity: "+city+
               "\nState: "+state+
               "\nCountry: "+country
        );
    }
}
