/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtravision;

/**
 *
 * @author ingridferrante
 */
public class Stock extends Movies {
    private int id;
    private String StatusStock;

    public Stock(String title, String sinopysis, String genre, String Classification, int year, int length) {
        super(title, sinopysis, genre, Classification, year, length);
    }
    
    public void Availability(){
        System.out.println("Movie is available");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusStock() {
        return StatusStock;
    }

    public void setStatusStock(String StatusStock) {
        this.StatusStock = StatusStock;
    }


 
    
    
    
 
    
}
