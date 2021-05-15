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

    //constructor with parameters extended from movies
    public Movie(int IDmovie, String title, String synopsis, String genre, String director, int year, double priceMovie) {
        super(IDmovie, title, synopsis, genre, director, year, priceMovie);
    }

    //Constructor with parameter IDmovie;
    public Movie(int IDmovie) {
        super(IDmovie);
    }

 
    //getters

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
    

    
}
