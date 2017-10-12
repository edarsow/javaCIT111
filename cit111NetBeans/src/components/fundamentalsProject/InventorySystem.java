/*
 * Copyright (C) 2017 delores
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
package components.fundamentalsProject;

import java.util.Scanner;
/**
 *
 * @author delores
 */
public class InventorySystem {
    
    // these static member variables hold our total inventory of each item
    public static int zombieMasks = 32;
    public static int wizardWands = 24;  
    
    
    public static void main(String[] args) {
        
        // these are local variables to store the requested order number
        int zombieOrder;
        int wandOrder;
        
        // setup our reader object so we can take input from the user
        Scanner scanner = new Scanner(System.in);
        
        
        // this while loop is always true, so the user is continually prompted for input
        while (zombieMasks > 0 || wizardWands > 0) {
            // prompt the user for a number of zombie masks and store output in local var
            System.out.println("How many zombie masks do you want to order? ");
            zombieOrder = scanner.nextInt();

            // prompt the user for a number of wizard wands and store output in local var
            System.out.println("How many wizard wands do you want to order? ");
            wandOrder = scanner.nextInt();

            // inventory control logic -- check to see if the order can be fulfilled and respond
            // appropriately
            if (zombieMasks - zombieOrder  > 0) {
                zombieMasks = zombieMasks - zombieOrder;
                System.out.println("you have successfully ordered " + zombieOrder + " zombie masks and there are " 
                        + zombieMasks + " remaining ");
            } else {
                System.out.println("sorry, we do not have enough zombie masks to complete your order!");
                System.out.println("you can order up to " + zombieMasks + " masks at this time");
            }

            // inventory control logic for the wizard wands -- follows the structure of that used for zombie masks
            
            if (wizardWands - wandOrder < 0) {
                System.out.println("sorry, we do not have enough wizard wands to complete your order!");
                System.out.println("you can order up to " + wizardWands + " masks at this time");

            } else {
                wizardWands = wizardWands - wandOrder;
                System.out.println("you have successfully ordered " + wandOrder + " wands and there are " 
                        + wizardWands + " remaining ");
            } // end if
            System.out.println("*********************");
        } // end while
    } // end main()
} // end class
