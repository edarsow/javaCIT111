/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week6_basicMethods;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates the most essential functionality of a switched block.
 * @author delores
 */
public class BasicSwitchWithMethodCalls {
    public static void main(String[] args) {
        // create a scanner object to read in user input
        Scanner keyboardScanner = new Scanner(System.in);
        // create a variable for holding user selection and running switch
        int userSelection;
        
        System.out.println("****** switches and methods *******");
        System.out.println("Options:");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!");
        System.out.println("Enter an int and press enter:");
        
        // read in an integer from the user through the keyboard
        userSelection = keyboardScanner.nextInt();
        
        
        // match the value of userSelection to a case's value and excecute the code
        // in that case until a break; is encountered
        switch(userSelection){
            case 1: 
                printStatement(); // the case just transfers execution to a method
                break; // exit switch mechanism
            case 2: 
                generateBigNumber(); // jump down to generateBigNumber and come back
                break;
            case 3: 
                //do nothing--just jump outside switch and end program
                break;
            // any pass through this switch which doesn't match a case hits here
            default:
                System.out.println("Unknown selection....exiting");
        } // close switching block
    } // close main
    
    /**
     * Prints a statement from the film 2013 film "Enemy" with Jake Gyllenhaal
     * http://www.imdb.com/title/tt2316411/
    */
     public static void printStatement(){
        System.out.println("**********INSIDE printStatement********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
    } // close method printSpecialStatement
     
     /**
      * Uses constructor method on a BigInteger to generate a random large number
      * and display it to the console
      */
      public static void generateBigNumber(){
        System.out.println("**********INSIDE generateBigNumber************");
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(150, r);
        // display the randomly generated huge number
        System.out.println(bigInt);        
        System.out.println("**********************************************");
    } // close method generateBigNumber
      
} // close class
