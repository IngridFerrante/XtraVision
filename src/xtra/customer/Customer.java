/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.customer;

/**
 *
 * @author kelly
 */
public class Customer {
    //attributes
    public String email;
    public int IDcustomerNumber;
    
    //method
//    public void locateCustomer(int IDcustomerNumber) {
//        this.IDcustomerNumber = IDcustomerNumber;
//    }

    public Customer(String email, int IDcustomerNumber) {
        this.email = email;
        this.IDcustomerNumber = IDcustomerNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
