/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel;

import java.util.Set;

/**
 *
 * @author Gustavo
 */
public final class Hostel {
    private static final Hostel instance = new Hostel();
    private String name;
    private String phone;
    
    private Hostel(){
        
    }
    
    public static Hostel getHostel(){
        return instance;
    }
    
    public boolean createCustomer(String title, String lastName, String dateOfBirth, String address, String zipCode, String city, String state, String country, String email){
        return true;
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
        
    }
    
    public Customer searchCustomerByName(String name, String lastName) throws CustomerNotFoundException{
        
    }
    
    public Customer searchReservationByCustomerName(String name, String lastName) throws CustomerNotFoundException{
        
    }
    
    public Set<Reservation> searchReservations(String name, String lastName){
        return null;
    }
}
