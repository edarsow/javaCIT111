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
 * Demonstrates the basic functionality of a while() statement with if() logic
 * @author delores
 */
public class RetirementAgeBreak {
    
    public static void main(String[] args) {
        int age;
        // make a Scanner object and store in a variable whose name we can choose
        Scanner inputScanner = new Scanner(System.in);
        
        // the test condition for this while statement is always true, 
        // so the looping will occur until the user issues a command to the compiler
        // to stop execution
        while(true){
            // prompt the user for age
            System.out.println("Enter your age to see if you can retire:");
            // read age from the console and store in variable
            age = inputScanner.nextInt();
            // implement basic if() logic--if they're over 65.5
            if(age > 65.5){
                // if true
                System.out.println("Wahoo! Grab the newspaper and martini!");
                // here's our check for the "stop signal" of an age less than zero
            } else if (age < 0) {
                // The magical BREAK: if this statement is hit, jump to after while()
                break;
                // if they can't retire and they have a real age, they're too young
            } else {
                System.out.println("Sorry, Keep working...");
                
            }// close if/else block
            
        }// close while() loop
        
        // this line of code is outside the while, so is run after break is hit
        System.out.println("Thanks for checking your retirement status!");
        
    } // close main method
} // close class
