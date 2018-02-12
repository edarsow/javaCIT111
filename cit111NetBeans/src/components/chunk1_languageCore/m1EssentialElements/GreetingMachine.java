
package components.chunk1_languageCore.m1EssentialElements;

import java.util.Scanner;

/**
 * Demonstrates basic user input using a Scanner object by reading in a name
 * and printing out a greeting that includes that inputted value
 * 
 */
public class GreetingMachine {
    
    public static void main(String[] args) {
       System.out.println("Please enter your name and press enter");
       Scanner scan = new Scanner(System.in);
       String name = scan.next();
       System.out.println("Whoa, " + name + " What an interesting name card you have!");
    } // Close main()
} // close class GreetingMachine