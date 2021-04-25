/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ingridferrante
 */
public class Rent {
    private int orderNumber; 
    private Date startDate;
    private int numberOfDays;
    private Date returnDay; 

    public Rent(int orderNumber, Date startDate, int numberOfDays, Date returnDay) {
        this.orderNumber = orderNumber;
        this.startDate = startDate;
        this.numberOfDays = numberOfDays;
        this.returnDay = returnDay;
    }
    
    public void statusRent(){
        
    }

    //methods
    public void rental(LocalDate startDate,int numberOfDays){
        
        
    }
    
    public void returnMovie(int orderNumber){
        
    }
    
    public void lateReturnCalculateDays(){
        
    }
    
    public void getLastRental(){
        
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Date getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(Date returnDay) {
        this.returnDay = returnDay;
    }
    
    
}
