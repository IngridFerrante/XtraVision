/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;

/**
 *
 * @author ingridferrante
 * @author kelly
 */

//abastract class of Movies 
public abstract class Movies {
    
    //attibutes
    protected int IDmovie; 
    protected String title;
    protected String synopsis;   
    protected String genre;
    protected String director;
    protected int year; 
    protected double priceMovie;
    protected int quantity;
    

    public Movies(int IDmovie, String title, String synopsis, String genre, String director, int year, double priceMovie) {
        this.IDmovie = IDmovie;
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.priceMovie = priceMovie;
    }
        
    
//    public Movies(int IDmovie, String title, String synopsis, String genre,String director, int year, double priceMovie, String idDiscCode) {
//        this.IDmovie = IDmovie;
//        this.title = title;
//        this.synopsis = synopsis;
//        this.genre = genre;
//        this.director = director;
//        this.year = year;
//        this.priceMovie = priceMovie;
//       
//        
//    }

    public Movies(int IDmovie) {
        this.IDmovie = IDmovie;
    }
    
       

       
    
}
