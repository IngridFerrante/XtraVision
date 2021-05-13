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
public class Creditcard extends Card{

    public Creditcard(String IDcardNumber, String nameCard,int cvv, int monthExpiresDate, int yearExpiresDate) {
        super(IDcardNumber, nameCard,cvv, monthExpiresDate, yearExpiresDate);
    }

   

    
    @Override
    protected void makePayment(BigDecimal amount) {
        // call payment card service
        // idMethodPayment = payService.VAULT(this.pan, this.pan, this.cvv, this.expirationDate, this.nameOnCard)
        //payService.execute(this.amount, "EUR", this.pan,  idMethodPayment)
    }

    @Override
    public void pay(BigDecimal amount) {
        makePayment(amount);
    }


}