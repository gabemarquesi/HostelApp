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
public class Customer {
    private String title, firstName, lastName, email;
    private LocalDate birthday;
    
    public Customer(String title){
        this(title, null);
    }
    
    public Customer(String title, String name){
        this(title, name, null);
    }
    
    public Customer (String title, String name, String lastName){
        this(title, name, lastName, null);
    }
    
    public Customer(String title, String name, String lastName, String birthday){
        this.title = title;
        this.firstName = name;
        this.lastName = lastName;
        this.birthday = LocalDate.parse(birthday);
    }
    
    @Override
    public int hashCode(){
        return 0;
    }
    
    public boolean equals(){
        return true;
    }
    
    @Override
    public String toString(){
        return("\nFirst Name: "+firstName+
               "\nLast Name: "+lastName+
               "\nTitle: "+title+
               "\nBirthday: "+birthday.toString());
    }
    
    
}
