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
 * Simulates a system to judge of a prospective rider can go on the Phantom Train
 * @author Eric Darsow
 */
public class RideHeight {
    
     // this is the entry point for our program
    public static void main(String[] args) {
        
        // create a minimum rider height final variable (a constant)
        final int MIN_HEIGHT_CM = 80;
        // declare an int-type variable to store the rider height
        int riderHeight;
        // create a Scanner object to get values from teh keyboard
        Scanner userInputScanner = new Scanner(System.in);
       
        // prompt the user for the rider height
        System.out.println("Welcome to the Phantom Train ride! Enter your height in CM:");
        // read whatever the user typed on the keyboard into the variable riderHeight
        riderHeight = userInputScanner.nextInt();
        
        // compare the user's height against the height minmum
        if(riderHeight < MIN_HEIGHT_CM){
            // code to run if the the comparison evaluates to true (rider is too short)
            System.out.println("Sorry, Shorty--come back after doing some growing");
            
        } else {
            // code to run if the comparison evaluates to false
            System.out.println("Your height of " + riderHeight + "cm means you can ride!");
        } // close if/else block
        
    } // close main method
} // close class RideHeight
