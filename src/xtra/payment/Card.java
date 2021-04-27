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
public class Card extends Payment{
    //atributes
    private int cardNumber;
    private String nameCard;
    private int cvv;
    private Date expiresDate;
    private String type; //check 
    
    //methods
//    protected void getType(){
//        
//    }
    
    protected void makePayment(){
        
    }
    
    //constructor
    public Card(int cardNumber, String nameCard, int cvv, Date expiresDate, String type, int IDorderNumber, Date date, double purchaseValue, String basketDescription) {
        super(IDorderNumber, date, purchaseValue, basketDescription);
        this.cardNumber = cardNumber;
        this.nameCard = nameCard;
        this.cvv = cvv;
        this.expiresDate = expiresDate;
        this.type = type;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
      
    
}
