
package modules.controlOfFlow;

import java.util.Scanner;

/**
 * This class implements basic principles of user authentication by
 * checking a password entered by the user against a master
 * password. The while() loop is used to control the number of guesses
 * that are acceptable before the program terminates.
 * @author [YOUR NAME HERE] 
 */
public class AuthenticationKey {
    // create a private final static String constant called
    // PASSWORD to store the password
    // assign your chosen password to this final constant
    private final static String PASSWORD = "p@ssword";
    // create a private final static String constant called
    // FORTUNE to store the
    // sensitive information that can only be accessed with a password
    private final static String FORTUNE = 
            "You shall soon experience great change in life";
    // create a private final static int constant called NUM_ATTEMPTS
    // to represent how many
    // password attempts the user is allowed
    private final static int NUM_ATTEMPTS = 3;
    
    // create a main() method in which to write your code
    public static void main(String[] args){
        
        // welcome the user to your system and ask for a password
        System.out.println("***JAVA FORTUNE TELLER***");
        System.out.println("Enter the system password to learn your fortune");
        
        // create a scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // create a variable called attempts of type int to store the number
        // of password attempts
        int attempts = 0;
        
        // DO THIS AFTER THE IF statement!
        // create a while loop that executes the password gathering and
        // printing process as long as the variable attempts is less than NUM_ATTEMPTS
        while(attempts < NUM_ATTEMPTS){
            // Collect a String from the user and store it in a variable userPassword
            // HINT: Use a call to scanner.next() to get a String from the keyboard
            String userPassword = scanner.next();
            // create an if() statement that executes a block of code
            // if the user entered the correct password.
            // use the equals() method on any String object (yrou variable userPasswrd)
            // to compare the user's password to the correct password in PASSWORD
            if(userPassword.equals(PASSWORD)){
                // Notify the user that the password entered is correct
                System.out.println("Correct password!");
                // tell the user his/her fortune
                System.out.println("****************************");
                System.out.println("Your fortune is: " + FORTUNE);
                System.out.println("****************************");
                // thank the user for participating
                System.out.println("Thank you for participating");
                // exit the entire while() loop with the simple statement: break;
                // break;
                break;
                // create an else{} block that only executes if the password
                // was incorrect
            } else {
                // tell the user that the password was incorrect
                System.out.println("Incorrect password, try again:");
                // increment the variable attempts by one to track the number
                // of password attempts
                attempts = attempts + 1;
                // tell the user how many attempts have been made
                System.out.println("Number of attempts: " + attempts);
                // tell the user how many password attempts are allowed
                System.out.println("Number attempts allowed: " + NUM_ATTEMPTS);
                // create another if() statement here that will
                // tell the user that they've tried too many times if their
                // number of attempts is equal to the NUM_ATTEMTPS allowed
                // (this is an if() statement inside the else{} block)
                if(attempts == NUM_ATTEMPTS){
                    // inside the if(), tell the user they've tried too many times
                    System.out.println("Sorry, you have tried too many "
                            + "times...exiting Java Fortune Teller");
                    // the else block should ask the user to try again
                } else {
                    System.out.println("Please try again: ");
                } // end of nested if/else
            } // end of if/else block
        } // close while loop
    } // close main method
} // close class
