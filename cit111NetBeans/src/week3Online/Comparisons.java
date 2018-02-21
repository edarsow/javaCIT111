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
package week3Online;

/**
 * A class to explore how comparison operators and if-controlled blocks function.
 * @author delores
 */
public class Comparisons {
    
    public static void main(String[] args) {
        
        // create an initialize two int-type variables
        int correctPasscode = 5934;
        int attemptedPasscode = 1234;
        
        // compare correctPasscode to attemptedPasscode
        if(attemptedPasscode == correctPasscode){
            System.out.println("Codes Match! You're in!");
        } else {
            System.out.println("Codes don't match -- no soup for you!");
        } // close if/else blocks
    } // close main method
} // close class Comparisons
