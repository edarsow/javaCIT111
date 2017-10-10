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
package components.comp2_languageStructures.ls3_classStructure;

/**
 * A class for practicing calling methods from main() in a class with existing
 * methods. Companion to Module: Language Structures 3 - Class Structure
 * @author Eric Darsow
 */
public class MethodPractice {
    
    public static void main(String[] args){
        // TASK 1: call helloWorld() and print the response to the screen
        
        // your code here
        
        // TASK 2: Call sameCase(String s) and pass in a string that has both
        // uper and lower case letters. Note that the method does the printing
        // and returns nothing
        
        // your code here
        
        // TASK 3: Now call squareRoot(double d) and pass in a double value
        // Note that you'll have to store the return value, which is a double. 
        // Store it in a double variable called sqrRootReturnedValue
        // and then print the output to the console
        
        // your code here
        
        // TASK 4 is more complex, and instructions are at the end of the class 
    }
    
    public static void helloWorld(){
        System.out.println("This is the obligatory: Hello World!");
    }

    public static void sameCase(String s){
        String upperCase = s.toUpperCase();
        String lowerCase = s.toLowerCase();
        System.out.println("The string in all uppers: " + upperCase + " and the "
                + "string in all lowers:"  + lowerCase);
    }
    
    public static double squareRoot(double takeSqrRoot){
        return Math.sqrt(takeSqrRoot);
        
    }
    
    // TASK 4: write a method called absoluteValue that takes in an int
    // and uses Math.abs(double d) to convert the value to
    // its absolute value. Then write a call in main() to
    // test it and print the value it returns.
    
    
}
