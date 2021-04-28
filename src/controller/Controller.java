/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import view.View;
import xtra.customer.Customer;
import xtra.payment.Card;
import xtra.payment.Payment;
import xtra.rent.Rent;
import xtra.stock.Movies;
import xtra.stock.Stock;


/**
 *
 * @author kelly
 */
public class Controller {
 
    //screen text ---------------------
    //user icon
    private final String screenNoMembershipText = "NO Membership required!\n";
    private final String screenCompanyNameText = " XTRA VISION XPRESS \n";    
    private final String screenFreeCodeText = "*First rental movie for FREE Cupom: FREE123";
    
    private final String screenCardFlagText = "\nMasterCard * VISA * AMERICANEXPRESS * elo";
    private final String screenRentLimitsText = "Rent transactions limit: First "
            + "rent = 2 movies | From sedond rent on: 4 movies ";                    
                    
    private final String rentReturnOption = "Would you like to RENT or RETURN? ";
    private final String rentOption = "[1] 2 Rent ";
    private final String returnOption = "[2] no exit Return ";
    private final String cancelOption = "[3] 6 Cancel "; 
    
    private final String selectMovie = "[1] Select movies";
    private final String cancelSelectedMovie = "[2] Cancel selected movie";
    private final String allSelected = "[3] All your selection : basket"; 
    private final String checkout = "[4] Checkout"; 
    private final String backToPreviousPage = "[5] Back to previous page";

    private final String cancelledConfirmationText = "Are you sure you wish to "
            + "cancel operation? (Y/N)";
    private final String cancelledText = "The program has finished";
    private final String moviechoiceFromListText = "Now you can choose a movie "
            + "from the list!"; 
    private final String oneMoreMovieChoiceFromListText = "Would you like to "
            + "choose one more movie?"; 
    private final String addOneMoreMovieChoiceFromListText = "Would you like "
            + "to choose one more movie?"; 
    private final String backToPreviousPageText = "Back to previous page";
    private final String noMovieAvailableText = "NO MOVIES AVAILABLE AT THE "
            + "MOMENT \n try later";
    private final String rentLimitChecoutBackOptionText = "You actived your "
            + "rent limit. \n Pease, click 'Checkout' or 'BACK' to previous "
            + "page if you want to chance a movie";
    private final String notReadyForCheckoutText = "You are not ready for "
            + "checkout, you must choose a movie";
    private final String freeCodeReminderText = "One movie for free in your "
            + "first rent, use code: FREE123 ";
    private final String emailOptionText = "Please, type your email address";
    private final String receiptByEmailText = "To receive the transaction "
            + "receipt, type your email address";
        
    private final String cardDetailsText = "Please enter your card details";
    private final String expiresDateText = "Card expires date (mm/yy):";
    private final String cardNumberText = "Could you type the card number "
            + "(16 digits NO space):";
    private final String nameCardText = "Could you type the account holder "
            + "name:";
    private final String cvvText = "Type the CVV (3 digits NO space):";
    private final String passwordText = "Type card PASSWORD(4 digits NO space):";  
    private final String wrongCardDetailsText = "Invalid Card details, "
            + "transaction cancelled";
    private final String two_MoviesAllowedText = "Sorry, just 2 movies allowed "
            + "for this first rent, please return movies";
    private final String fourMoviesAllowedText = "Sorry, just 4 movies allowed "
            + "for this first rent, please return movies";
    
    private final String twoMoviesAllowedNewCustomerText = "New customer "
            + "can rent up to 2 movies, please return movies";
    
        private final View view;
        //private final RentDescription rentDescription;
        private final List<Movies> chosenMovie;

    public Controller(View view) {
        this.view = view;
        //this.rentDescription = new RentDescription();
        this.chosenMovie = new LinkedList<>();
    }

    public void executeProgram() {
        
        int choice;
        boolean select;
        int maxQuantity;
        int position = 0;
        
        
//        
//        // Transaction
//        List<Transaction> transaction = rentDescription.getAllTransaction();
//        
//        // create array to show customer the transaction
//        // add transaction and messages on the screen
//        String[] firstPageScreenText = new String[transaction.size() + 4];
//        
//        firstPageScreenText[position] = "Special Offers";
//        position++;
//        
//        for (Transaction t: transaction) {
//            
//            firstPageScreenText[position] = t.toString();
//            position++;
//        }
//        
//        firstPageScreenText[position] = screenNoMembershipText;
//        position++;
//        firstPageScreenText[position] = screenFreeCodeText;
//        position++;
//        firstPageScreenText[position] = screenCardFlagText;        
//        // add the menu
//        String[] optionsText = {rentOption, returnOption, cancelOption};
//                
//        while(true) {
//            // option selected from mainMenu
//            choice = view.screenOption(screenCompanyNameText, rentReturnOption, firstPageScreenText, optionsText);
//
//            //using switch in case we need more option on the screen
//            switch(choice) { 
//                
//                case 1: // Rent 
//                    //old customer rent limit 
//                    maxQuantity = rentDescription.getMaximumRentedMoviesForGeneralAccount();
//                    executeOperations(maxQuantity, true);
//                                   
//                    break;
//                case 2: // Rent 
//                    //old customer rent limit 
//                    maxQuantity = rentDescription.getMaximumRentedMoviesForGeneralAccount();
//                    executeOperations(maxQuantity, false);
//
//                    break;
//                case 3: // 
//                    select = view.askQuestionYesOrNo(cancelledConfirmationText);
//                    if (select) {
//                        view.printMessage(cancelledText);
//                        view.CloseScanner();
//                        return;
//                    }
//                
//            }
//            chosenMovie.clear();
//                                  
//        }
//           
//        
//    }
//    
//    //decide if we will create ulimited account
//    private void selectItems(int maxQuantity){
//        
//    }
//    
//    private void viewItems(){
        
    }
    
    // choose movie, cancel chosen movie, view basket and checkout
    private void executeOperations(int maxQuantity) {
//                int choice;
//        //List<Transaction> transactions;
//        boolean yes;
//        Rent rent;
//        List<Stock> stock;
//        Card card;
//        Customer customer;
//        String idCustomer;//checkname
//        String name;
//        int quantityNotReturned;
//        boolean newCustomer;
//        Payment payment;
//
//        
//        String[] msgOptions = {selectMovie, cancelSelectedMovie, allSelected, checkout, backToPreviousPage};
//        
//        while(true) {
//            
//             choice = view.menu("", rentReturnOption, new String[0], msgOptions);
//             
//             switch(choice) {
//                
//                case 1: // select a movie 
//                    chosenMovie(maxQuantity);                        
//                    break;
//                case 2: // cancel movie chosen
//                    // not implemented yet
//
//                    break;
//                case 3: // view a movie
//                    viewItems();
//                    break;
//
//                case 4: // checkout
//                    
//                    if (chosenMovie.isEmpty()) {
//                        
//                        view.printMessage(notReadyForCheckoutText);
//                        continue;
//                        
//                    }
//                    transactions = new LinkedList<>();
//                    // get offer for the selection
//                    transactions.add(getTransaction(maxQuantity, ""));
//                    
//                    // get offer for the code entered by the customer
//                    if (!) {
//                                                      //
//                        yes = view.askQuestionYesOrNo(freeCodeReminderText);
//                        
//                        if (yes) 
//                            transactions.add(getTransactions( 1, "FREE123"));
//                           
//                    }
//                     
//                    // get Disc for the movies selected
//                    stock = new LinkedList<>(); 
//                    for (Movies b: chosenMovie) {
//                        
//                        b.getAvailableStock();
//                        
//                    }
//                    
//                    rent = new Rent(LocalDate.now(), transactions,stock);
//                    
//                    //
//                    
//                    // type card number
//                    card = typeCardNumber();                    
//                    
//                    if (card == null) {
//                        
//                        view.printMessage(wrongCardDetailsText);
//                        return;
//                        
//                    }
//                    
//                    IDcustomerNumber = card.getCardNumber();
//                    name = card.getNameCard();
//                    customer = rentDescription.get(IDcustomerNumber);
//                    newCustomer = false;
//                    
//                    if (customer == null) {
//                        customer = new Customer(IDcustomerNumber, "", null);
//                        newCustomer = true;
//                    }
//                    
//                    quantityNotReturned = rentDescription.getQuantityOfRentalsNotReturnedByCustomer(IDcustomerNumber);
//                    
//                    if () { // 
//                       
//                        if (quantityNotReturned + stock.size() > 2)
//                            view.printMessage(two_MoviesAllowedText);
//                    } else { // general account
//                        
//                        if (newCustomer) { // new customer
//                            
//                            if (stock.size() > 2)
//                            view.printMessage(twoMoviesAllowedNewCustomerText);
//                                                            
//                        } else { //customer already registered on the database
//                            
//                            if (quantityNotReturned + stock.size() > 4)
//                                view.printMessage(fourMoviesAllowedText);
//                            
//                        }
//                          
//                    }
//                    
//                    // create payment
//                    payment = new Payment(LocalDate.now(), rent.getTotalPurchase(), rent.toString(), customer);
//                    
//                    payment.pay(card); 
//                    
//                    rentDescription.save(rent);
//                    rentDescription.saveAll(stock);
//                    rentDescription.save(payment);
//                    
//                    sendReceipt(customer, payment);
//                    
//                case 5: //back to previous page
//                    return;
//             }
//        }
//        
//        
//        
//        
//        
    }
    

//    private Transaction getTransaction(){
//        
//    }
    
    private Card typeCardNumber() {
        //
        return null;
    }
    
    private void sendReceipt(Customer customer, Payment payment) {
        //
    }
    
}   