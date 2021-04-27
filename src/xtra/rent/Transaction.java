/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.rent;

import java.util.Date;

/**
 *
 * @author ingridferrante
 */
public class Transaction {
       protected final int orderNumberId; 
       protected final float daysRented; 
       protected final float price;
       protected final int discAmount;

    public Transaction(int orderNumberId, float daysRented, float price, int discAmount) {
        this.orderNumberId = orderNumberId;
        this.daysRented = daysRented;
        this.price = price;
        this.discAmount = discAmount;
    }
       
       public int orderNumberId(){
           return orderNumberId;
       }
       
       public Date getDayReturn(){
           return null;
       }
       
       public float getPrice(){
           return price;
       }
       
       public int getDiscAmount(){
           return discAmount;
       }

    @Override
    public String toString() {
        return "orderNumberId: " + orderNumberId ;
    }

    
       
       
       
       
}
