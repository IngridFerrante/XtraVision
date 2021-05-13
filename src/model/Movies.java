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
public abstract class Movies {
    
    protected int IDmovie; 
    protected String title;
    protected String synopsis;   
    protected String genre;
    protected String director;
    protected int year; //int maybe
    protected double priceMovie;
    protected String idDiscCode; //each movie can have different copies
    protected int amt;
    
    //protected List<Stock> stock; //Array list of stock movie disc

    public Movies(int IDmovie, String title, String synopsis, String genre, String director, int year, double priceMovie) {
        this.IDmovie = IDmovie;
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.priceMovie = priceMovie;
    }
    
    
    
    public Movies(int IDmovie, String title, String synopsis, String genre,String director, int year, double priceMovie, String idDiscCode) {
        this.IDmovie = IDmovie;
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.priceMovie = priceMovie;
        this.idDiscCode = idDiscCode;
        
    }

    public Movies(int IDmovie) {
        this.IDmovie = IDmovie;
    }
    
       

//    @Override
//    public String toString() {
//        if (idDiscCode != null)
//            return "Movies: " + "title=" + title + ", description=" + synopsis + ", genre=" + genre + ", director=" + director + ", year=" + year + ", IDmovie=" + IDmovie + ", quantity=" + idDiscCode + '}';
//        else
//            return "Movies: " + "title=" + title + ", description=" + synopsis + ", genre=" + genre + ", director=" + director + ", year=" + year + ", IDmovie=" + IDmovie + ", quantity=" + 0 + '}';
//    }
//    
//    public String toShortString() {
//        
//        if (idDiscCode != null)
//            return "Movies: " + "title=" + title + ", genre=" + genre + ", director=" + director + ", year=" + year + ", quantity=" + idDiscCode + '}';
//        else
//            return "Movies: " + "title=" + title + ", genre=" + genre + ", director=" + director + ", year=" + year + ", quantity=" + 0 + '}';
//            
//    }

       
    
}
