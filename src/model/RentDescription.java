/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.List;
import xtra.rent.FreeTransaction;
import xtra.rent.Rent;
import xtra.rent.Transaction;

/**
 *
 * @author ingridferrante
 */
public class RentDescription {
    private final String freeTransactionCode = "First Rental Free - use code FREE123 ";
    private final String nightMovieprice = "Movie one night for 4.00 euro";
    private FreeTransaction freeTransaction = new FreeTransaction(new BigDecimal("0"), 1, 1, freeTransactionCode, "FREE123");
    
   // private Transaction nightMovieprice = new Transaction( new BigDecimal("2.99"), 1, 1, nightMovieprice);

    List<Transaction> transaction;
    
    public RentDescription(){
    }
    

public int getNotReturned(String customerCardNumber ){
    return 0;
}

public void save(Rent rent){
    
}

public Transaction TransactionSelected(int amount, String freecode){
    if(!freecode.isEmpty() && (amount ==1))
        return freeTransaction;
        return null;
       
        
}
// complete 




}
