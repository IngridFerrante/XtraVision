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
public class Movies {

    private String title;
    private String sinopysis; 
    private String genre;
    private String Classification; 
    private int year; 
    private int length;
    private int availability;
   

  
 
    public void status(){
        System.out.println("###############");
        System.out.println("Movie: " + this.getTitle());
        System.out.println("Sinopysis: " + this.getSinopysis());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("Classification: " + this.getClassification());
        System.out.println("Year: " + this.getYear());
        System.out.println("Lenght: " + this.getLength() + "min");
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinopysis() {
        return sinopysis;
    }

    public void setSinopysis(String sinopysis) {
        this.sinopysis = sinopysis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    
    
}
