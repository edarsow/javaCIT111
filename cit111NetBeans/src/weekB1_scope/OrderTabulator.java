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
package weekB1_scope;

/**
 * Bare-bones order tracking system which demonstrates the concept of 
 * using class-scoped variables to maintain state information about a set of
 * possible items orderable by calling item-specific methods.
 * 
 * @author Eric C Darsow
 */
public class OrderTabulator {
    
    private static int numPizzaSliders = 0;
    private static int numRoastBeefSliders = 0;
    
    public static void main(String[] args) {
        
        displayOrderTotals();
        
        orderPizzaSliders(5);
        orderRoastBeefSliders(6);
        
        displayOrderTotals();
        
        orderPizzaSliders(2);
        orderRoastBeefSliders(8);
        
        displayOrderTotals();
        
    } // close main
    
    public static void orderPizzaSliders(int orderQuant){
        System.out.println("Cookin' up " + orderQuant + " pizza sliders.");
        numPizzaSliders = numPizzaSliders + orderQuant;
    } // close method
    
    public static void orderRoastBeefSliders(int orderQuant){
        System.out.println("Cookin' up " + orderQuant + " roast beef sliders.");
        numRoastBeefSliders =  numRoastBeefSliders + orderQuant;
    } // close method
    
    public static void displayOrderTotals(){
        System.out.println("\n************ ORDER TOTALS ************");
        System.out.println("Total pizza sliders ordered: " + numPizzaSliders);
        System.out.println("Total roast beef sliders ordered: " + numRoastBeefSliders);
        System.out.println("**************************************\n");
    } // close method
    
} // close class
