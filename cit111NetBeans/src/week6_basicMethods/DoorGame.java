package week6_basicMethods;

import components.comp2_languageStructures.ls1_basicMethods.*;
import java.util.Scanner;

/**
 * Code to illustrate core concepts in method calling. Companion to the Language
 * Structures Module 1 (LS1) in the http://technologyrediscovery.net CIT111: 
 * inrtroduction to programming course taught at the Community College of Allegheny
 * County in Pittsburgh, PA
 * @author Eric Darsow
 */
public class DoorGame {
    
    /**
     * Controller method for the game--get a user choice for one of three doors
     * and call the appropriate method
     * @param args not used
     */
    public static void main(String[] args){
        
        // welcome header to the game
        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("-------GRAND PRIZE OR GOATS-------");
        System.out.println("");
        System.out.println("**********     **********     **********");
        System.out.println("*  **    *     *  * *   *     * ***    *");
        System.out.println("*   *    *     * *   *  *     *    *   *");
        System.out.println("*   *    *     *     *  *     * *****  *");
        System.out.println("*   *    *     *    *   *     *    *   *");
        System.out.println("*  ***   *     * ****** *     * ***    *");
        System.out.println("**********     **********     **********");
        System.out.println("");
        
        // create a scanner for user input, prompt the user, and store in doorChoice
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ONE DOOR number you'd like to open - 1, 2, or 3: ");
        int doorChoice = scan.nextInt();
        
        // use a switch block to select which method to call
        switch (doorChoice){
            case 1: 
                // simulate opening door one by calling revealDoor1;
                openDoor1();
                break;
            case 2: 
                oepnDoor2();
                break;
            case 3: 
                openDoor3();
                break;
        } // end switch block
    } // close main
    
    /**
     * Simulates the opening of door 1
     */
    public static void openDoor1(){
        System.out.println("EHHHH! Sorry: just a bio goat");
    } // close method
    
    /**
     * Simulates the opening of door 2
     */
    public static void oepnDoor2(){
        System.out.println("Hurray! You've won a G-9000 Series Robotic Goat \n"
                + "which is superior to bio goats in all possible ways.");
    } // close method
    
    /**
     * Simulates the opening of door 3
     */
    public static void openDoor3(){
        System.out.println("EHHHH! Sorry: just a bio goat");
    } // close method
    
} // close class
