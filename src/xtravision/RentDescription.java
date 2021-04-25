/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision;

import java.util.Date;

/**
 *
 * @author ingridferrante
 */
public class RentDescription {
    private int orderNumber; 
    private Rent statusRent;
    private Date returnDay;

    public RentDescription(int orderNumber, Rent statusRent, Date returnDay) {
        this.orderNumber = orderNumber;
        this.statusRent = statusRent;
        this.returnDay = returnDay;
    }
    
    
}
