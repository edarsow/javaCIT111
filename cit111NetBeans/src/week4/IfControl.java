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
package week4;

import java.util.Scanner;


/**
 * Compares a user-entered value against a pre-set purchase limit to 
 * model a banking training program for you learning to manage money.
 * @author Eric Darsow
 */
public class IfControl {
    
    // this is the entry point for our program
    public static void main(String[] args) {
        
        // create a purchase limit as a final variable since it won't change
        final double PURCHASE_LIMIT = 200.00;
        // declare a double-type variable to store the user's purchase amount
        double purcahseAmount;
        // create a Scanner object to get values from teh keyboard
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for a purchase amount
        System.out.println("Enter the amount of the purchase (no $) and press enter:");
        // read whatever the user typed on the keyboard into the variable purcahseAmount
        purcahseAmount = userInputScanner.nextDouble();
        
        // compare the user-entered purchase amount against the purcahse limit
        if(purcahseAmount > PURCHASE_LIMIT){
            // code to run if the the comparison evaluates to true (purchase is too high)
            System.out.println("Ah Ah ah--That's too expensive! Buy something else");
            
        } else {
            // code to run if the comparison evaluates to false
            System.out.println("Okay, you can purchase this item for: $" + purcahseAmount);
        } // close if/else block
        
    } // close main method
} // close class IfControl
