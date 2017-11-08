/*
 * Copyright (C) 2017 technologyrediscovery.net
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
package components.comp4_storage.m1arrays;

/**
 * Class to model the most basic functionality of Arrays-
 * String values are loaded up into an array and sent to a method to
 * print those values to the console.
 * @author Eric Darsow
 */
public class ProgrammingBooks {
    
    /**
     * Creates and loads up a String array
     * @param args not used
     */
    public static void main(String[] args) {
        // create an array object that stores only Strings
        // and store a reference to that array in the variable books
        String[] books = new String[5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";
        
        // now that we have created and filled up our array, we can
        // pass it as a single object down to a method, such as 
        // one written to print out its contents
        printArrayContents(books); // method call
        
    } // close main 
    
    /**
     * Prints the contents of a String array of size 5, indexed from 0 to 4
     * @param arrayInsideMethod an array of String objects with 5 bins
     */
    public static void printArrayContents(String[] arrayInsideMethod){
        System.out.println("*********** Extract array value and store it ************");
        // Extract contents of each array bin, then print it to the console
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractedArrayValue );
        // do this process for each bin of the array
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at array at index 1: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at array at index 2: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at array at index 3: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at array at index 4: " + extractedArrayValue );
        
        // If you uncomment these two lines below, you'll get an
        // arrayIndexOutOfBounds exception, which occurs if we try to extract
        // or store a value in an array bin that doesn't exist.
        // Our array only has five compartments, indexed from 0 to 4

        /* remove this line
        
        
        extractedArrayValue = arrayInsideMethod[5];
        System.out.println("Book at array at index 5: " + extractedArrayValue ); 
        
        
        
        */ // and this line
        
        System.out.println("");
        System.out.println("*********** Extract from array inside println() ************");
        // since the array stores String values, we can extract the value of
        // each array bin directly inside our call to the println() method
        System.out.println("Book at array index 0: " + arrayInsideMethod[0]);
        System.out.println("Book at array index 1: " + arrayInsideMethod[1]);
        System.out.println("Book at array index 2: " + arrayInsideMethod[2]);
        System.out.println("Book at array index 3: " + arrayInsideMethod[3]);
        System.out.println("Book at array index 4: " + arrayInsideMethod[4]);
        
    } // close method
    
} // close class
