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

/**
 * Demonstrates the most essential functionality of a switched block.
 * @author delores
 */
public class BasicSwitch {
    public static void main(String[] args) {
        // a hard-coded value to test switch functionality
        final int SELECTOR = 78;
        
        // match the value of SELECTOR to a case's value and excecute the code
        // in that case until a break; is encountered
        switch(SELECTOR){
            case 1: {
                System.out.println("First case selected");
                break; 
            } // unnecessary block { } curly braces here
            case 2: 
                System.out.println("Second case selected");
                break;
            case 78: 
                System.out.println("Cases can match any int value");
                break;
            // any pass through this switch which doesn't match a case hits here
            default:
                System.out.println("Default case");
        } // close switching block
    } // close main
} // close class
