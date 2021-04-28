/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author kelly
 */
public abstract class Card implements PaymentOptions{
    //atributes
    protected int cardNumber;
    protected String nameCard;
    protected LocalDate expiresDate;
    protected int cvv;
    protected int password; 
    
    
    protected abstract void makePayment(BigDecimal purchaseValue);
    
    //constructor
    public Card(int cardNumber, String nameCard, LocalDate expiresDate, int cvv, int password) {
        this.cardNumber = cardNumber;
        this.nameCard = nameCard;
        this.expiresDate = expiresDate;
        this.cvv = cvv;
        this.password = password;
    }

    
    public int getCardNumber() {
        return cardNumber;
    }

//    public void setCardNumber(int cardNumber) {
//        this.cardNumber = cardNumber;
//    }

    public String getNameCard() {
        return nameCard;
    }

//    public void setNameCard(String nameCard) {
//        this.nameCard = nameCard;
//    }

//    @Override
//    public void pay() {
//        
//    }
    
      
    
}
