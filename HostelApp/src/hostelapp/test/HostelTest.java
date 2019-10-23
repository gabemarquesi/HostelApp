/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelapp.test;
import Hostel.*;
import Exceptions.*;
/**
 *
 * @author 2019.1.08.041
 */
public class HostelTest{

    private static boolean addCustomerTest(){
    Hostel hostel=Hostel.getHostel();
        hostel.createCustomer(null, "Berto", "berti", "1984-02-11", "rua AB", "ZIP123",
                "CIDADE", "ESTADO", "PAÍS", "rogerinhoespiga@hotmail.com");
        try{
        Customer bali=hostel.searchCustomerByName("Berto","berti");
        }
        catch(CustomerNotFoundException e){
            return false;
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testing CreateCustomer and associated functionality
    if(!(addCustomerTest())){
        System.out.println("failure on hostel.CreateCustomer:customer not on name index");
    }
    else{
        Hostel hostel=Hostel.getHostel();
        hostel.createCustomer(null, "Julio", "berti", "1984-02-11", "rua AB", "ZIP123",
                "CIDADE", "ESTADO", "PAÍS", "rogerinhoespiga@hotmail.com");
        hostel.createCustomer(null, "Marques", "berti", "1984-02-11", "rua AB", "ZIP123",
                "CIDADE", "ESTADO", "PAÍS", "rogerinhoespiga@hotmail.com");
        Customer bali;
        try{
        bali=hostel.searchCustomerByName("Julio","berti");
        System.out.println("success:\'Julio berti exists\'");
        }
        catch(CustomerNotFoundException e){
            return;
        }
        try{
        bali=hostel.searchCustomerByName("Berto","berti");
            System.out.println("success:\'Berto berti exists\'");
        }
        catch(CustomerNotFoundException e){
            return;
        }
        try{
        bali=hostel.searchCustomerByName("Berte","berti");
        }
        catch(CustomerNotFoundException e){
            System.out.println("success:\'Berte berti does not exist\'");
        }try{
        bali=hostel.searchCustomerByName("Marques","berti");
        System.out.println("success:\'Marques berti exists\'");
        }
        catch(CustomerNotFoundException e){
            System.out.println("failure:\'Marques berti does not exist\'");
        }
            }
    }
    
}
