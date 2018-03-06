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
package week6_basicMethods;

import java.util.Scanner;

/**
 * Class simulates functionality of a purchase calculator to demonstrate
 * the creation and use of methods that take input parameters
 * @author Eric C Darsow
 */
public class PurchaseCalculatorMenu {
    
    final static double TAX_RATE = 0.075;
    
    public static void main(String[] args) {
        Scanner priceScanner = new Scanner(System.in);
        double itemPrice;
        double discount;
        
        System.out.println("Enter the item price: ");
        itemPrice = priceScanner.nextDouble();
        
        System.out.println("Select a value to compute and press enter:");
        System.out.println("1 - sale price plus tax");
        System.out.println("2 - sale price less discount plus tax");
        
    }
    
    /**
     * Computes and displays the inputted price with the tax rate added
     * @param price the initial purchase price
     */
    public static void displayPriceWithTax(double price){
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
    } // close method
    
} // close class
