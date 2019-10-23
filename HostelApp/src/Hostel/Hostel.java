/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel;

import Exceptions.CustomerNotFoundException;
import Exceptions.RoomNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import java.time.LocalDate;

/**
 *
 * @author Gustavo
 */
public final class Hostel {
    private static final Hostel instance = new Hostel();
    private String name;
    private String phone;
    
        private Map<String, Customer> customersNameIndex;
    private Set<Customer> customers;
    
    private Hostel(){
        customersNameIndex=new HashMap<String,Customer>();
        customers=new HashSet<Customer>();
    }
    
    public static Hostel getHostel(){
        return instance;
    }
    
    public boolean createCustomer(String title, String name, String lastName, String dateOfBirth, String address, String zipCode, String city, String state, String country, String email){
        Customer cInsert=new Customer(null, name, lastName, dateOfBirth, email);
        Address aInsert=new Address(address, zipCode, city, state, country);
        customersNameIndex.put(lastName+", "+name, cInsert);
        customers.add(cInsert);
        return true;
    } 
    //enumerations for checking problems with entered customer data, if any
    public enum customerDataStatus{
        CORRECT, MISSING_MANDATORY_FIELD, NAME_UNDER_THREE_CHARS, INVALID_NAME, INVALID_TITLE
    }
    public customerDataStatus[] checkCustomerdata(Customer checkedCustomer){
        //TODO: CHECK INTEGRITY (e.g. all fields filled, valid title, valid name, etc)
        customerDataStatus[] status={customerDataStatus.CORRECT};//PLACEHOLDER
        return status;
    }
    public boolean makeReservation(Customer customer, String rsDate, String checkin, String checkout){
        return true;
    }
    
    public boolean makePayment(double amountTendered, String typeOfPayment){
        return true;
    }
    
    public boolean createRoom(int number, double dimension){
        return true;
    }
    
    public void addRoom(Room room){
        
    }
    
    public Room searchRoomByNumber(int number) throws RoomNotFoundException{
        return null;
    }
    
    public Customer searchCustomerByName(String name, String lastName) throws CustomerNotFoundException{
      if(!(customersNameIndex.containsKey(lastName+", "+name))){
            throw new CustomerNotFoundException(name,lastName,"not on index");
        }
        return customersNameIndex.get(lastName+", "+name);
    }
    
    public Customer searchReservationByCustomerName(String name, String lastName) throws CustomerNotFoundException{
        return null;
    }
    
    public Set<Reservation> searchReservations(String name, String lastName){
        return null;
    }
}
