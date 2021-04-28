/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import xtra.payment.Card;
import java.util.Date;

/**
 *
 * @author kelly
 */
public class Debit extends Card{

    //contructor
    public Debit(int cardNumber, String nameCard, LocalDate expiresDate, int cvv, int password) {
        super(cardNumber, nameCard, expiresDate, cvv, password);
    }

    @Override
    protected void makePayment(BigDecimal purchaseValue) {
    // call payment
    }


    @Override
    public void pay(BigDecimal purchaseValue) {
        makePayment(purchaseValue);
    }
    

    
}
