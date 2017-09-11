package essentials;

import java.util.Scanner;

/**
 * Class which converts a value entered by the user into a new type of data
 * @author delores
 */
public class Converter {
    
    public static void main(String[] args){
        // Basic prompt
        System.out.println("Enter a number of days:");
        // Create a scanner object that reads input
        Scanner scan = new Scanner(System.in);
        // now gather input and store it in the local variable days
        int days = scan.nextInt();
        // Send das to our converter method which will convert and display values
        convertDaysToSeconds(days);
        
    } // close main()
    
    public static void convertDaysToSeconds(int days){
        final int SECONDS_PER_HOUR = 60 * 60;
        int seconds = days * SECONDS_PER_HOUR;
        System.out.println(days + " days is the equivalent of " + seconds + " seconds");
    } // close convertDaysToSeconds()
    
} // close Class
