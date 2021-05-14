/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import model.Customer;
import controller.DatabaseController;
import controller.DatabaseController;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Card;
import model.Creditcard;
//import model.Customer;
import view.Congratulation;

/**
 *
 * @author kelly
 */
public class Email {
    
    //sender -->xtravision email information that we created for the CA
    private String user = "xtravisionca@gmail.com"; //XtraVision CA email
    private String pass = "Pass1234!";
    private String email;
    private String orderInformation;
    private Creditcard card;

    public Creditcard getCard() {
        return card;
    }

    public void setCard(Creditcard card) {
        this.card = card;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Email(String to)
   
    {
        
        Properties prop = new Properties();
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");        
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);         
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        //get the Session object to authenticate sender email password
        Session session = Session.getInstance(prop,new javax.mail.Authenticator() 
        {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
            {
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });
        
        //debug mode to show what is going on during the process of sending email.
        session.setDebug(true);
        
        try
        {
                 
        Message message = new MimeMessage(session);
                                                
        //no_reply                                      
        message.setFrom(new InternetAddress("no_reply@xtravisionca.com"));          
          
          
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
         
        // Set Subject: subject of the email
        message.setSubject("XtraVision Xpress Receipt");
          
        // set body of the email 
        DatabaseController db = new DatabaseController();
        String text = db.sendOrderByEmail().toString();
             
             
        message.setContent(text,"text/html; charset=utf-8" );
        message.saveChanges();
           
        //message.setText(text, "text/html; charset=utf-8");
          
        System.out.println(message);
        
        //make the email message transport 
        Transport.send(message);
          
        System.out.println("Mail sent");
          
        } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
        
    } 


    
    
    
}



    
    
    
    
       
    
