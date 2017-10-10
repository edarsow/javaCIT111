
package components.comp1_languageCore.lc3_controlOfFlow;

import java.util.Scanner;

/**
 * This class implements basic principles of user authentication by
 * checking a password entered by the user against a master
 * password. The while() loop is used to control the number of guesses
 * that are acceptable before the program terminates.
 * @author [YOUR NAME HERE] 
 */
public class Authentication {
    //  EXAMPLE: create a private final static String constant called
    // PASSWORD to store the password
    // assign your chosen password to this final constant
    private final static String PASSWORD = "p@ssword";

    // create a private final static String constant called
    // FORTUNE to store the
    // sensitive information that can only be accessed with a password


    // create a private final static int constant called NUM_ATTEMPTS
    // to represent how many
    // password attempts the user is allowed

    
    // I created a main() method in which to write your code
    public static void main(String args){
        // welcome the user to your system and ask for a password
        
        // create a scanner object for reading user input
        
        // create a variable called attempts of type int to store the number
        // of password attempts
        
        // MAKE YOUR WHILE() LOOP AFTER THE IF statementS!
        // create a while loop that executes the password gathering and
        // printing process as long as the variable attempts is less than NUM_ATTEMPTS

    
            // Collect a String from the user and store it in a variable userPassword
            // HINT: Use a call to scanner.next() to get a String from the keyboard

    
            // create an if() statement that executes a block of code
            // if the user entered the correct password.
            // use the equals() method on any String object (yrou variable userPasswrd)
            // to compare the user's password to the correct password in PASSWORD

    
                // (Inside if{}) Notify the user that the password entered is correct

                 // tell the user his/her fortune
                
                // thank the user for participating

                // exit the entire while() loop with the simple statement: break;
                // break;

            // create an else{} block that only executes if the password
            // was incorrect

                // inside else{} : tell the user that the password was incorrect

                // increment the variable attempts by one to track the number
                // of password attempts

                // tell the user how many attempts have been made

                // tell the user how many password attempts are allowed

                // create another if() statement here that will
                // tell the user that they've tried too many times if their
                // number of attempts is equal to the NUM_ATTEMTPS allowed
                // (this is an if() statement inside the else{} block)

                    // inside the second if(), tell the user they've tried too many times

                // the else block should ask the user to try again
                    
                    // tell the user to try again (this only displays if they
                    // have another attempt remaining
                    
        // CLOSE ALL YOUR CODE BLOCKS and label the closing curly braces
        
    } // close main method
} // close class
