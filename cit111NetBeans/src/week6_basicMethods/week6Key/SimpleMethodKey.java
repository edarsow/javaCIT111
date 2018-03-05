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
package week6_basicMethods.week6Key;

import java.math.BigInteger;
import java.util.Random;

/**
 * Demonstration class for the concept of a method in its most basic form
 * @author Eric Darsow
 */
public class SimpleMethodKey {
    public static void main(String[] args) {
        System.out.println("This code is inside method: main");
        // call the method printStatement, transferring execution to that block
        printStatement();
        
        System.out.println("...back in main");
        generateBigNumber();
        // call the same method again!
        System.out.println("...back in main");
        printStatement();
        
    } // close method main
    
    // illustration method that takes no parameters and returns nothing to the caller
    public static void printStatement(){
        System.out.println("**********INSIDE printStatement********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
        // call generateBigNumber again, from a different method than main
        generateBigNumber();
    } // close method printSpecialStatement
    
    public static void generateBigNumber(){
        System.out.println("**********INSIDE generateBigNumber************");
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(150, r);
        // display the randomly generated huge number
        System.out.println(bigInt);        
        System.out.println("**********************************************");
    } // close method generateBigNumber
    
} // close class
