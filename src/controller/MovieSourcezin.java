/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Movie;
import model.Movie;

/**
 *
 * @author ingridferrante
 */
public interface MovieSourcezin {
    boolean isCached();
    Movie[] getMovies();
    Movie[] getMoviesByTitle(String title);
    Movie getMovieById(int id);
    Movie[] getMoviesByGenre(String selectedGenre);
}
