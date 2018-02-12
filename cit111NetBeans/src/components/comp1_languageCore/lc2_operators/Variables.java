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
package components.comp1_languageCore.lc2_operators;

/**
 * Demonstrates Java's primitive type and String type variables
 * and essential operators to manipulate those variables
 * @author Eric Darsow
 */
public class Variables {
    
    public static void main(String[] args) {
        // delcare variables and give them a type (they are all int type)
        int yearsEleSchl = 5;
        int yearsMS = 3;
        int yearsHS = 4;
        int yearsCollege = 2;
        int totalYears;
        
        // we can operate on them as before
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // and print the value of totalYears to the console with some text
        System.out.println("Total years in school: " + totalYears);
        
    } // close main method
} // close class Variables
