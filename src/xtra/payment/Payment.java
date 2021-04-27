/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.payment;

import java.util.Date;

/**
 *
 * @author kelly
 */
public abstract class Payment {
    //attributes
    private int IDorderNumber;
    private Date date; //research
    private double purchaseValue;
    private String basketDescription;

    //methods
    public void sendReceipt (){
    
    }
    
    public void pay(){
        
    }    
    
    //constructor
    public Payment(int IDorderNumber, Date date, double purchaseValue, String basketDescription) {
        this.IDorderNumber = IDorderNumber;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    
    
    
    
}
