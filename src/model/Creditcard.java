/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author kelly
 */

//using Creditcard as subclass to access Card information as Card in an abstract class
//Creditcard is inherited from Card class
public class Creditcard extends Card{ 

    //constructor from Card class
    public Creditcard(String IDcardNumber, String nameCard,int cvv, int monthExpiresDate, int yearExpiresDate) {
        super(IDcardNumber, nameCard,cvv, monthExpiresDate, yearExpiresDate);
    }


    
    @Override
    protected void makePayment(BigDecimal amount) {

    }

    @Override
    public void pay(BigDecimal amount) {
        makePayment(amount);
    }


}