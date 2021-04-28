/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.payment;

import java.time.LocalDate;
import java.util.Date;
import xtra.customer.Customer;

/**
 *
 * @author kelly
 */
public class Payment {
    //attributes
    private int IDorderNumber;
    private LocalDate datePaid; //research
    private double purchaseValue;
    private String basketDescription;
    private Customer customer;

    //methods
    public void sendReceipt (){
    
    }
    
    public void pay(){
        
    }    
    
    //constructor
    public Payment(LocalDate datePaid, double purchaseValue, String basketDescription) {
        this.datePaid = datePaid;
        this.purchaseValue = purchaseValue;
        this.basketDescription = basketDescription;
    }
    
    
    //methods getters and setters
    public int getIDorderNumber() {
        return IDorderNumber;
    }

    public void setIDorderNumber(int IDorderNumber) {
        this.IDorderNumber = IDorderNumber;
    }

    public LocalDate getDate() {
        return datePaid;
    }

    public void setDate(Date date) {
        this.datePaid = datePaid;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public String getBasketDescription() {
        return basketDescription;
    }

    public void setBasketDescription(String basketDescription) {
        this.basketDescription = basketDescription;
    }

    //method pay
    public void pay(Card card) {

    }
    
    
    
    
}
