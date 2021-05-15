/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.PaymentOptions;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import view.PaymentView;

/**
 *
 * @author kelly
 */

// this is abstract because you cannot let anyone to have access to the user card information attributes
public abstract class Card implements PaymentOptions {
    //attributes
    protected String IDcardNumber;
    protected String nameCard;
    protected int monthExpiresDate;
    protected int yearExpiresDate;
//    protected int cardPassword;
    protected int cvv;
    
    protected abstract void makePayment(BigDecimal amount);
    
    
//constructor with paramaters
    public Card(String IDcardNumber, String nameCard, int monthExpiresDate,int yearExpiresDate, int cvv) {
        this.IDcardNumber = IDcardNumber;
        this.nameCard = nameCard;
        this.monthExpiresDate = monthExpiresDate;
        this.yearExpiresDate = yearExpiresDate;
        this.cvv = cvv;
    }

    //encapsulation getters and setters 
    
    public String getIDcardNumber() {
        return IDcardNumber;
    }

    public void setIDcardNumber(String IDcardNumber) {
        this.IDcardNumber = IDcardNumber;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }


    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getMonthExpiresDate() {
        return monthExpiresDate;
    }

    public void setMonthExpiresDate(int monthExpiresDate) {
        this.monthExpiresDate = monthExpiresDate;
    }

    public int getYearExpiresDate() {
        return yearExpiresDate;
    }

    public void setYearExpiresDate(int yearExpiresDate) {
        this.yearExpiresDate = yearExpiresDate;
    }

    
  // methods to check card input validation
     public void checkCardValidation(Card card) {
       
         
        cardNameValidation(card);
        idCardNumberValidation(card);
        emptyCardNumberValidation(card);
        cardNumberLength(card);
        cvvValidation(card);
        cvvLength(card);
       
    }   
     //validations
     
     public void cardNameValidation(Card card){
         // Card name has to be only letters!
         if(!card.getNameCard().matches("^[a-zA-Z ]+$")){
            System.out.println("Card name has to be only letters!");
        }        
    }
    
    public void idCardNumberValidation(Card card){
         
        if(!card.getIDcardNumber().matches("[0-9]+")){
            System.out.println("Card number has to be only numbers!");
            
        }
        
    }
    
    public void emptyCardNumberValidation(Card card){
         // Card number cannot be empty!
        if(card.getIDcardNumber().isEmpty()){
            System.out.println("Card number cannot be empty!");
        }
        
    }
    
   
    public void cardNumberLength(Card card){
         // Card number has to be 16 digits!
         if(card.getIDcardNumber().length() != 16){
            System.out.println("Card number has to be 16 digits!");
        }      
    }
    
    
    
    public void cvvValidation(Card card){
         //cvv number have to be numbers!
     //   if(!card.getCvv().matches("[0-9]+")){
            System.out.println("Card security number have to be numbers!");
        //}      
    }
    
    public void cvvLength(Card card){
         // cvv number contains only 3 digits!
     //   if(card.getCvv().length() != 3){
           System.out.println("Card security number contains only 3 digits!");
      //  }  
    }
    
    
    public void dateValidation(){
        // method to set the format to the "yyyy/mm/dd" 
        String date = "anocarto-meacartoa-01";
        LocalDate dateConvertion = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        dateConvertion = dateConvertion.withDayOfMonth(dateConvertion.getMonth().length(dateConvertion.isLeapYear()));
        Date today = new Date();
        SimpleDateFormat dF = new SimpleDateFormat("yyyy/mm/dd");
        dF.format(today);
        Date cardDate;
        

    }
    
    
}
