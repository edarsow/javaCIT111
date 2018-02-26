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
 * Adding user input to our while loop learning
 * @author delores
 */
public class WhileWithScanner {
    public static void main(String[] args) {
        int numLoops = 0;
        int loopControl = 2;
        // build a scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt user and get an int from them
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        // loop as long as numLoops is less than or equal to our loopControl
        // which we gathered from the user
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            // add one to numLoops each time we cycle so we only
            // loop the number of times the user imputed
            numLoops = numLoops + 1;
        } // close while
        
        System.out.println("...After the while loop");
        
    } // close main
} // close class
