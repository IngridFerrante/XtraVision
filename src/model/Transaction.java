/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import model.Customer;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Kelly
 * @author ingridferrante
 */
public class Transaction {
    //atributes
    protected final String cardNumber;
    protected Date startDate;
    protected Date endDate;
    protected final double totalPrice; // price for each disc/movie
    private String orderInformation;

    //constructor with parameters 
    public Transaction(String cardNumber, Date startDate, Date endDate, double totalPrice,  String orderInformation) {
        this.cardNumber = cardNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.orderInformation = orderInformation;
    }

    //getters
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }        

    public String getCardNumber() {
        return cardNumber;
    }
    
    public LocalDate getReturnDay(LocalDate date) {       
        return null;       
        
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //constructor
    public Transaction(String cardNumber, Date startDate, Date endDate, double totalPrice) {
        
        this.cardNumber = cardNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
     // return to print in the email to the customer
        return "Your XtraVision Xpress ORDER: "  + "\n" + " Order number:" + cardNumber + "\n" + "Rental start date:" 
                + startDate + " \n Rental end date:" + endDate + " \n Total paid:" + totalPrice 
                + "\n RETURN INFORMATION: you can find the movie return number at the case of each movie." 
                +"\n Any incorrect charge or for more information, please contact us: " + "\n" + "010010001";
    
    }

    
}
