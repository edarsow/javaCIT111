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
package week5;

import java.util.Scanner;
/**
 * Demonstrates the essential functionality of a for() loop
 * @author delores
 */
public class ForLoopIntro {
    public static void main(String[] args) {
        // declare variable for controlling number of loops
        int loopControl;

        // create a scanner and store it in a variable of our choice
        Scanner userScanner = new Scanner(System.in);

        // prompt user and get an int from them
        System.out.println("How many loops shall I print with for()?");
        // grab an int from the user and store in loopControl
        loopControl = userScanner.nextInt();        

        // create a for() loop that initalizes numLoops to zero, 
        // has the same true/false test as the while(), and adds 1 to our
        // numLoops variable after each pass through the loop
        for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1){
            // same contents of our loop body 
            System.out.println("The value of numLoops: " + numLoops);
            // but the for() loop helps us by incrementing numLoops in its 
            // own declaration
        } // close for loop

    }// close main method
} // close class
