/*
 * Copyright (C) 2018 Eric Darsow
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
public class PurchaseCalculator {
    
    public static void main(String[] args) {
        final double ITEM_PRICE = 100.00;
        double discount  = 0.15;
        double purchaseLimit;
        
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter (no $):");
        // create a scanner object and point to it with variable s
        Scanner s = new Scanner(System.in);
        // read in a double value from the user and store in purchaseLimit
        purchaseLimit = s.nextDouble();
        
        // call method and pass in a double value as the declaration requires
        System.out.println("Price with tax:");
        
        // call a method and pass in 100.0 as an argument
        displayPriceWithTax(100.0);
        
        double perc = discount * 100;
        System.out.println("Hard-coded discount of %" + perc);
        // call method and pass in ITEM_PRICE and discount
        computePriceAfterDiscount(ITEM_PRICE, discount);
        
        // call method and pass in ITEM_PRICE and purchaselimit
        displayPurchasableNumber(ITEM_PRICE, purchaseLimit);
        
        
    } // close method main
    
    /**
     * Computes and displays the inputted price with the tax rate added
     * @param price the initial purchase price
     */
    public static void displayPriceWithTax(double price){
       
        
        
        
    } // close method displayPriceWithTax
    
    
    /**
     * Computes the final sale price given an initial sale price and a discount
     * @param price the price of the item before discount
     * @param discount the discount percent as a decimal value
     */
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // close method
    
    
    
    /**
     * Computes the total number of units that can be purchased within a given
     * spending limit. Uses Math.floor() to "round down" to the nearest 
     * complete unit that can be purchased and displays the result
     * @param price the price of the item to be purchased in x quantity
     * @param limit the amount of money to be spent on x units of item
     */
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("With $" + limit 
                + ", you can buy " + numPurchasable + " units");
        
    }
    
    
} // close class
