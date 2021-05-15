/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.AbstractTableModel;
import model.Movie;

/**
 *
 * @author kelly
 */
public class MoviesTable extends AbstractTableModel {
    
    //https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
    
    //to get title, genre, director, yaer, price and id in the rent frame    
    private String[] columnNames = {"Title","Synopsis","Genre","Director","Year", "Price","id"};
    private Movie[] movies;
    
    //Movie table passing the  array into parameter
    public MoviesTable( Movie[] movies) {
        this.movies = movies;
    }
        
    //getters
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    public int getRowCount() {
          return movies.length;
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //switch to return title, genre, director, yaer, price and id(hidden) in the rent frame
        Movie movie = movies[rowIndex];
        switch (columnIndex){
            case 0: {
                return movie.getTitle();
            
            }
            case 1:{
                return movie.getSynopsis();
            }
            case 2:{
                return movie.getGenre();
            }
            case 3:{
                return movie.getDirector();
            }
            case 4:{
                return movie.getYear();
            }
            case 5:{
                return movie.getPriceMovie();
            }
            case 6:{
                return movie.getIDmovie();
            }
           
     
        }
        return null;
    }
}
 
