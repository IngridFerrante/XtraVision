/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra.payment;

import java.math.BigDecimal;

/**
 *
 * @author kelly
 */
public interface PaymentOptions {
    
    public void pay(BigDecimal purchaseValue); 
    
}
