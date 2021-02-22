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
package week3Online;

import java.util.Scanner;

/**
 * Reads a rider's height from keyboard and determines if safety threshold
 * has been met
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class RideHeight {
    public static void main(String[] anyNameWeWant){
        final int MIN_HEIGHT_CM = 80; // final means this val won't change during exec
        // make container for rider's height
        int riderHeight;
        // create a scanner object
        Scanner heightMeasureMachine = new Scanner(System.in);
        System.out.println("Welcome to the phantom train ride! "
                + "Enter your height in CM and press enter");
        // All important: use our heightMeasureMachine to get data from KB
        // and store in riderHeight
        riderHeight = heightMeasureMachine.nextInt();
        
        // 
        
        
    } // close main
} // close class
