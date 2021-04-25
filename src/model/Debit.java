/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author kelly
 */
public class Debit extends Card{
    
    //contructor
    public Debit(int cardNumber, String nameCard, int cvv, Date expiresDate, String type, int IDorderNumber, Date date, double purchaseValue, String basketDescription) {
        super(cardNumber, nameCard, cvv, expiresDate, type, IDorderNumber, date, purchaseValue, basketDescription);
    }
    
}
