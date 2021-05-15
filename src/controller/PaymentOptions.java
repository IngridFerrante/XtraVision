/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;

/**
 *
 * @author kelly
 */
public interface PaymentOptions {
    
    //method for payment
    public void pay(BigDecimal amount);
    
}