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
package week8_methods2;

/**
 * Illustrates methods and calls with no input parameters and returning nothing, 
 * with inputs but not outputs, and with both inputs and outputs.
 * 
 * @author Eric Darsow
 */
public class MethodTypesShowcase {
    public static void main(String[] args) {
        // call a method requing no inputs, and which returns nothing:
//        displayFortune();
        // call a method that requries an input argument, but returns nothing
//        displayPriceWithTax(100.0);
        
        // call a method that requires an input argument, and returns a double
        double result = calcVolumeOfCube(50.0);
        // print out the returned value
        System.out.println("The volume of the cube is: " + result);
        
        
    }
    
    // delcare a method and write its body
    public static void displayPattern(){
        System.out.println("X**X*");
        System.out.println("*X**X");
        System.out.println("**X**");
        System.out.println("X**X*");
    } // close method
 
     
   // requires one input parameter of type duble, returns nothing
    public static void displayPriceWithTax(double price){
        final double TAX_RATE = 0.07;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
    } // close method
    
     public static double computePriceWithTax(double price){
        final double TAX_RATE = 0.07;
        double totalPrice = price * (1 + TAX_RATE);
        return totalPrice;
    } // close method
     
    
    // requires one input paramter of type double, and returns a double value
      public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        // return the area back to the calling method
        return cubeVolume;
    } // close method
 
} // close class
