/*
 * Copyright (C) 2017 Technology Rediscovery
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
package modules.controlOfFlow;

import java.util.Scanner;

/**
 *
 * @author EX Darsow
 */
public class MysteryNumber {
    
    final static int MAGIC_NUMBER = 27;
    
    public static void main(String[] args){
        
        System.out.println("***********************************");
        System.out.println("******GUESS THE MAGIC NUMBER*******");
        System.out.println("*****BETWEEN ONE AND ONE HUNDRED***");
        
        Scanner scan = new Scanner(System.in);
        int firstGuess = scan.nextInt();
        if (firstGuess > MAGIC_NUMBER){
            System.out.println("Your guess was TOO HIGH! you lose");
        } else if(firstGuess < MAGIC_NUMBER){
            System.out.println("Your guess was TOO LOW you lose");   
        } else {
            System.out.println("Wow, fantastic guess! That's the MAGIC_NUMBER.");
        } // end if block
        
        /*
        TASK 1: COPY GUESS BLOCKS 
        Skill: code reading and light editing
        You are a nice person. Great! Copy the appropriate lines of code from
        the above guts of main() such that the user gets three--yes, three!--guesses
        to arrive at the MAGIC_NUMBER and win the game.
        
        Give the user appropriate prompts so interaction with the application
        is smooth and the user can focus on making three solid guesses.
        */
        
        // <--- DELETE ME AND PUT YOUR CODE HERE -->
        
        /*
        TASK 2: ENDLESS GUESSING?
        Skill: While loop execution control
        
        Using while loops, create code that will coordinate asking the user
        for a new guess as long as the user has not arrived at the magic number.
        
        TIP: You'll want to create a variable that is set to 1 as long as the 
        guess entered is INCORRECT. The while loop condition should check to see
        if this "monitoring varaible" has been toggled to 0, in which case the
        MAGIC NUMBER has been found and the guessing loop can be removed.
        */
        
        /**
         * TASK 3: GAME STATS
         * Skill: Creating application "stats" variables and populating them
         * 
         * Now that we have a while loop implemented, users can guess many times.
         * Create variables that works like counters for the number of guesses 
         * the user made over the MAGIC_NUMBER and under the MAGIC_NUMBER. 
         * After the user has arrived at the magic number, display the statistics
         * about the guesses required and list the total guss number, including
         * the correct final guess.
         * Also display the MAGIC_NUMBER that was set as a class constant value
         */
        
    } // close main
} // close class
