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
 */
public class Movie extends Movies{

    //constructor 
    public Movie(int IDmovie, String title, String synopsis, String genre, String director, int year, double priceMovie) {
        super(IDmovie, title, synopsis, genre, director, year, priceMovie);
    }
//   
//    public Movie(int IDmovie, String title, String synopsis, String genre, String director, int year, double priceMovie, String idDiscCode) {
//        super(IDmovie, title, synopsis, genre, director, year, priceMovie, idDiscCode);
//    }

    public Movie(int IDmovie) {
        super(IDmovie);
    }

    

//
//    @Override //not being used at the moment --> test console
//    public String toString() {
//        if (idDiscCode != null)
//            return "Movie{" + "title=" + title + ", synopsis=" + synopsis +   ", genre=" + genre + ", year=" + year + ", IDmovie=" + IDmovie + ", status=" + idDiscCode + '}';
//        else
//            return "Movie{" + "title=" + title + ", synopsis=" + synopsis + ", genre=" + genre + ", year=" + year + ", IDmovie=" + IDmovie + ", status=" + idDiscCode + '}';
//    }
//    
//    @Override
//    public String toShortString() {
//        
//        if (idDiscCode != null)
//            return "Movie{" + "title=" + title +  ", genre=" + genre + ", year=" + year + ", status=" + idDiscCode + '}';
//        else
//            return "Movie{" + "title=" + title + ", genre=" + genre + ", year=" + year + ", status=" + idDiscCode + '}';
//            
//    }    //not being used at the moment --> test console
    
    

    public int getIDmovie() {
        return IDmovie;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }
    
     public double getPriceMovie() {
        return priceMovie;
    }
    
    
//    public List<Stock> getStock() {
//        return stock;
//    }
  
    
}
