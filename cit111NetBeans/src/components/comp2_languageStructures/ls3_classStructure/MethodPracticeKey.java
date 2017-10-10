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

public class MethodPracticeKey {
    
    public static void main(String[] args){
        // TASK 1: 
        helloWorld();
        
        // TASK 2: 
        sameCase("Lots Of cAsEs");
        
        // TASK 3: 
        double sqrRootReturnedValue = squareRoot(144.0);
        System.out.println(sqrRootReturnedValue);
        
        // TASK 4 
        double toTakeLog = 1000.00;
        double fromLog = takeLog(toTakeLog);
        System.out.println("The abs value of " + toTakeLog + " is: " + fromLog);
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
    
    // TASK 4: write a method called takeLog that takes in a double
    // to take the log-base-10 of. Use a method on the Math class
    // Then write a call in main() to
    // test it and print the value it returns.
    
    public static double takeLog(double toLog){
        double log = Math.log10(toLog);
        return log;
    }
    
    
}
