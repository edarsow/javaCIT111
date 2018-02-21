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
 * Simulates authentication of a single-user system using String comparisons
 * @author Eric Darsow
 */
public class UsernameAndPassword {
    public static void main(String[] args) {
        // these are constants that we'll authenticate against
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        // storage variables for user data
        String enteredUsername;
        String enteredPasswd;
        
        // create our Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt user for username
        System.out.println("Enter your username followed by enter:");
        // read username typed in to keyboard into variable
        enteredUsername = userInputScanner.next();
        
        System.out.println("Enter your password followed by enter:");
        // use the same Scanner to read in the entered password
        enteredPasswd = userInputScanner.next();
        
        // check if both the username and password match the correct ones
        if(enteredUsername.equals(CORRECT_USERNAME) && enteredPasswd.equals(CORRECT_PASSWORD)){
            // successful authentication message
            System.out.println("Authentication Successful! You have logged into nothing!");
        } else {
            // failed authentication message
            System.out.println("Failure to authenticate! This attempt will not be recorded");
        } // end if/else blocks
        
    } // close main method
} // close class UsernameAndPassword
