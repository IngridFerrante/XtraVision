/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Card;
import model.Creditcard;
import model.Transaction;
import model.Movie;
//import model.Stock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.mail.MessagingException;
import view.Congratulation;
import view.PaymentView;
import view.Return;

/**
 *
 * @author kelly
 * @author ingridferrante
 */
public class DatabaseController {
    
    private String dbServer = "jdbc:mysql://52.50.23.197:3306/Kelly_2019375?useSSL=false";
    private String dbUser = "Kelly_2019375";
    private String dbPassword = "2019375";
                      

    public DatabaseController() {
    }
    
    //method to take the transaction rent completed order and inseert into the database
    public Boolean CreateOrderInDatabase(Transaction transaction)
    {       
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
                  //sql query
        String query = "INSERT into orders (id_cardNumber, start_date, end_date, total_orderprice)\n" +
                "values ('" +transaction.getCardNumber()+ "', '"+
                Date_Format.format(transaction.getStartDate()) +  "', '"+  
                Date_Format.format(transaction.getEndDate())+"', '"+
                transaction.getTotalPrice()+"');";
                
            
            Boolean result = false;
              
            try {
                 
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();
            
            int i = stmt.executeUpdate(query);
                       
            
            if(i > 0)
            {
                result = true;
            }

            stmt.close();
            conn.close();
   
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                return result;
            } 
            

    }
    
    
    //counts the search through name results
    public Boolean createCardInDatabase(Card card){
        
        //sql query
        String query = "INSERT into card (id_cardnumber, namecard, month_expiresdate, year_expiresdate, cvv)\n" +
                "values ('" +card.getIDcardNumber()+ "', '"+
                card.getNameCard()+ "', '"+
                card.getMonthExpiresDate()+"', '"+
                card.getYearExpiresDate()+"', '"+
                card.getCvv()+"');";
            
            Boolean result = false;
              
            try {
                 
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();
            
            int i = stmt.executeUpdate(query);
            
            if(i > 0)
            {
                result = true;
            }
           
            // Close the rstatement and the connection
            stmt.close();
            conn.close();
   
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                return result;
            } 
            

    }
       
    
    //search for a match on movie title
    public  Movie[] getAllMoviesFromDatabase() 
    {
        
        //String[][] searchMovieResult = new String[allMoviesCount][5];
        ArrayList<Movie> movies = new ArrayList<>();
        
        try
        {
            //String dbServer = "jdbc:mysql://52.50.23.197:3306/Kelly_2019375?useSSL=false";
            //String dbUser = "Kelly_2019375";
            //String dbPassword = "2019375";
            
            //sql query
            String Query = "Select * from movies";
            

            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();
            

            ResultSet rs = stmt.executeQuery(Query);
            
            while (rs.next()) {  
                if(rs.getInt(8)>0){
                Movie movie = new Movie (rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7));    
              
                movies.add(movie);
                            }   
            }
            
            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return movies.toArray(new Movie[movies.size()]);
    }


    
    //check if card already exist in the database
    public boolean checkIfCardExist(String cardNumber) throws SQLException{
        
        boolean checkCardExist = false;
        
        String query = "select * from card where id_cardnumber = '" + cardNumber + "'";
        DatabaseController db = new DatabaseController();
        
        try {
                 
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query);
       
            
         
            if(rs.next())
            {
                
                checkCardExist = true;
            }
            

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return checkCardExist ;
    }
    
        
    //method to decrease/update database movie from stock when is rented         
    public void updateQuantityMoviesRented(int[] idmovies) {
         
        try {
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();
            String queries[]=new String[idmovies.length];
        for (int i= 0 ; i<idmovies.length;i++){
            queries[i] = "update movies set quantity = quantity-1 where idmovies = "+idmovies[i]+";";
            stmt.executeUpdate(queries[i]);
        }
            // Close the statement and the connection      
            stmt.close();
            conn.close();
   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        
    }
    
     
    //return/update movie databade quantity movie stock on movies table
     public void updateQuantityMoviesReturned(int movieId) {
         
        try {
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();

        
            String queries = "update movies set quantity = quantity+1 where idmovies =  "+movieId+";";  
            stmt.executeUpdate(queries); 
            
            // Close the statement and the connection
            stmt.close();
            conn.close();
   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        
    }
    

    //Check if movie id exist in movies table before return it
    public Boolean checkDiscCodeInDatabase(int movieId){
                  
            //sql query
            String query = "SELECT * FROM movies WHERE idmovies = '" + movieId + "'";
            
            
            Boolean result = false;
              
            try {
                 
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the result set
            if (rs.next()) {
                result = true;
            }

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return result;
        
    }
    
    

    //method to send order by email
    public Transaction sendOrderByEmail(){
        Transaction transaction = null;
                  
        //sql query
        String query = "SELECT * FROM orders ORDER BY id_order LIMIT 1;";
        
        Boolean result = false;
              
        try {
                 
            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
            
            Statement stmt = conn.createStatement();
       
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {                     
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                transaction = new Transaction (rs.getString(1), rs.getDate(3),rs.getDate(4),rs.getDouble(5));                                            
                
            }
            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return transaction;
    }
    
     //====WORKING ON THAT ====
    //to put email in the database card table
    public void updateEmail (Email SE) {
    
        // updated by the user who created this appoitment
        String sql = "UPDATE card SET email = '" + SE.getEmail() + "' WHERE id_customer = '" + SE.getCard() + "';";
                
        try {
                    
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser,dbPassword);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql); 
                       
            // Close the result set, statement and the connection
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            String msg = null;
            // Loop through the SQL Exceptions
            while (se != null) {
                msg = se.getSQLState() + " " + "Message: " + se.getMessage() + " " + "Error  : " + se.getErrorCode();
                se = se.getNextException();
                if (se != null)
                    msg =  msg + System.lineSeparator();
            }
            
        } catch (Exception e) {
           
        } 
        
    }
    
    //====WORKING ON THAT=====
    //Change the status in statusrental table, to keep track of which card in returning a movie
    public void updateRentalStatusByReturned(Return statusRental) {
         
//        try {
//            Connection conn = DriverManager.getConnection(dbServer,dbUser,dbPassword);
//            
//            Statement stmt = conn.createStatement();
//
//        
//            String queries = "update rentaldetail set rental = rental+1 where rentaldetail =  "+ statusRental +";"; 
//            
//            stmt.executeUpdate(queries); 
//            
//            // Close the statement and the connection
//            stmt.close();
//            conn.close();
//   
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } 
        
    }
    
      
}