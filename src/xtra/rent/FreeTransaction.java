/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.rent;

import java.math.BigDecimal;

/**
 *
 * @author ingridferrante
 */
public class FreeTransaction extends Transaction  {
    private String freecode; 

    public FreeTransaction(int orderNumberId, float daysRented, float price, int discAmount) {
        super(orderNumberId, daysRented, price, discAmount);
        this.freecode = freecode;
    }

 

    
}
