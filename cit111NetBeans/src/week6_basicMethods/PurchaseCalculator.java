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

/**
 * Class simulates functionality of a purchase calculator to demonstrate
 * the creation and use of methods that take input parameters
 * @author Eric C Darsow
 */
public class PurchaseCalculator {
    
    public static void main(String[] args) {
        final double ITEM_PRICE = 100.00;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        
        // call method and pass in a double value as the declaration requires
        displayPriceWithTax(ITEM_PRICE);
        
    } // close method main
    
    /**
     * Computes and displays the inputted price with the tax rate added
     * @param price the initial purchase price
     */
    public static void displayPriceWithTax(double price){
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
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
    
    
} // close class
