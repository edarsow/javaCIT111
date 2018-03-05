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
 * Demonstrates the most essential functionality of a switched block can
 * also be implemented with if/else chains.
 * @author delores
 */
public class BasicSwitchAsIf {
    public static void main(String[] args) {
        // a hard-coded value to use in if/else chain 
        final int SELECTOR = 78;
        
        // march down chain, looking for matches
        if(SELECTOR ==1 ){
                System.out.println("First case selected");
        } else if(SELECTOR == 2){
                System.out.println("Second case selected");
        } else if(SELECTOR == 78){
                System.out.println("Third case selected");
        } else {
            System.out.println("Default case");
        } // close if/else chain
    } // close main
} // close class
