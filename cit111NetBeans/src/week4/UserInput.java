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
 * Demonstrates the functionality of a Scanner object and how to use it to
 * gather input from the user 
 * @author Eric Darsow
 */
public class UserInput {
    public static void main(String[] args) {
        // this is a "final variale" to store the tax rate
        final double SALES_TAX = 0.07; 
        
        // declare double-type variables
        double salePrice;
        double priceWithTax;
        
        // create a Scanner object using the imported Class libray
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user
        System.out.println("Enter the sale price (no $) and press enter:");
        // use the Scanner object to read a double value from the console
        salePrice = userInputScanner.nextDouble();
        // add the tax amount to original sale amount 
        priceWithTax = salePrice * (1 + SALES_TAX);
        // print out results of the calculation to the console
        System.out.println("Your item price + 7% tax: $" + priceWithTax);
        
    } // close main() method
} // close class UserInput
