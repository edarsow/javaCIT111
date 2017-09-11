package essentials;

import java.lang.*;
import java.util.Scanner;

/**
 * Class which converts a value entered by the user into a new type of data
 * @author delores
 */
public class Converter {
    // This final identifier is to an int value that will not change
    // during program execution. (It is NOT vairable.)
    final static int EMAILS_PER_LINE = 3;
    
    public static void main(String[] args){
        // Basic prompt
        System.out.println("Enter the number of emails you processed:");
        // Create a scanner object that reads input
        Scanner scan = new Scanner(System.in);
        // now gather input and store it in the local variable days
        int days = scan.nextInt();
        // Send das to our converter method which will convert and display values
        convertEmailsToLines(days);
    } // close main()
    
    public static void convertEmailsToLines(int emails){
        // Convert the number of emails passed to this method into lines
        // of code that could have been written
        double lines = (emails / EMAILS_PER_LINE);
        // Note how we use the contatenation operator + to combine identiers 
        // (Seconds) and literals ("in quotes")
        System.out.println(emails + " emails costs you writing" + lines + 
                " lines of solid code!");
    } // close method
} // close Class
