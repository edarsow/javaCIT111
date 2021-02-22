/*
 * Copyright (C) 2021 Eric Darsow <edarsow@ccac.edu>
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
package chunk1_mods3and4;

import java.util.Scanner;

/**
 * Demonstrate hard-coded and Scanner input for basic passcode comparison
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class Passcode {
    public static void main(String[] notUsedAtAll){
        final int CORRECT_CODE = 5934; // declared and initialized
        int userCode; // declared but not initialized since Scanner will do it
        
        // Create a variable typed to hold our Scanner object, of type Scanner
        Scanner scan;
        // Build a scanner with the new keyword, and assign to scan
        // System.in represents our computer's keyboard
        scan = new Scanner(System.in);
        System.out.println("Please enter passcode and press enter: ");
        // assign to userCode whatever value the scanner reads from the keyboard
        userCode = scan.nextInt();
        System.out.println("You entered passcode: " + userCode);
        // compare correct and user code with
        if(userCode == CORRECT_CODE){
            // When comparison returns true
            System.out.println("The Atomic Number of Zinc is 30");
        } else {
            // when comparison is false
            System.out.println("Incorrect code; no soup for you!");
        }
        System.out.println("Program End");
        // end program with end of execution in main
    } // close main
    
} // close class
