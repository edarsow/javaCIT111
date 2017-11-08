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
package components.comp4_storage.m1arrays;

/**
 *
 * @author delores
 */
public class IntegerArrays {
    public static void main(String[] args) {
        // create an array of ints called writingInstruments
        // that stores the approximate count of instruments in each beaker
        int[] writingInstruments = new int[5];  // <-- MAKE AN OBJECT!!!!
        
        // estimate each beaker's contents and store it in the appropriate 
        // array bin, indexed 0-4
        writingInstruments[0] = 15;
        writingInstruments[1] = 19;
        writingInstruments[2] = 5;
        writingInstruments[3] = 16;
        writingInstruments[4] = 14;
        
        printNumericArrayManually(writingInstruments);
        
        
        
        
        printNumericArrayWithWhileLoop(writingInstruments);
        printNumericArrayWithForLoop(writingInstruments);
        
        System.out.println("");
        System.out.println("*** Calling method to calculate total instruments ***");
        int sum = calculateSumOfArrayValues(writingInstruments);
        System.out.println("Total number of writing instruments: " + sum);
        
        System.out.println("");
        System.out.println("** Calling method to calculate average instruments **");
        double average= calculateAverageOfArrayValues(writingInstruments);
        System.out.println("Average number of instruments: " + average);
        
        createAndAnalyzeFlasksArray();
        
        
    } // close main
    
    public static void createAndAnalyzeFlasksArray(){
        System.out.println("");
        System.out.println("** Creating mysteriousFluids array **");
        int[] mysteriousFluids = new int[4];
        
        System.out.println("Filling array with liquid volumes...");
        mysteriousFluids[0] = 250;
        mysteriousFluids[1] = 100;
        mysteriousFluids[2] = 180;
        mysteriousFluids[3] = 150;
        
        // can't call this one because it assumes 5 bins
        // printNumericArrayManually(mysteriousFluids);
        printNumericArrayWithWhileLoop(mysteriousFluids);
        printNumericArrayWithForLoop(mysteriousFluids);
        
        System.out.println("");
        System.out.println("*** Calling method to calculate total instruments ***");
        int sum = calculateSumOfArrayValues(mysteriousFluids);
        System.out.println("Total number of writing instruments: " + sum);
        
        System.out.println("");
        System.out.println("** Calling method to calculate average instruments **");
        double average= calculateAverageOfArrayValues(mysteriousFluids);
        System.out.println("Average number of instruments: " + average);
        
        
    }
    
    
    public static void printNumericArrayManually(int[] intArray){
        System.out.println("");
        System.out.println("********* ACCESSING ARRAY MANUALLY *********");
        System.out.println("Number instruments in beaker indexed at 0: " + 
                String.valueOf(intArray[0]));
        System.out.println("Number instruments in beaker indexed at 1: " + 
                String.valueOf(intArray[1]));
        System.out.println("Number instruments in beaker indexed at 2: " + 
                String.valueOf(intArray[2]));
        System.out.println("Number instruments in beaker indexed at 3: " + 
                String.valueOf(intArray[3]));
        System.out.println("Number instruments in beaker indexed at 4: " + 
                String.valueOf(intArray[4]));
        
    } // close method
    
    
    
    public static void printNumericArrayWithWhileLoop(int[] intArray){
        System.out.println("");
        System.out.println("********* ACCESSING ARRAY WITH WHILE() LOOP *********");
        
        // create a counter variable i that we can use to
        // iterate over (loop) the array
        int i = 0;
        // ask the array it's length (size) and store its value in arraySize
        int arraySize = intArray.length;
        // use the while()-controlled block to control the looping
        // loop 5 total times, once for each bin in the array
        while(i < arraySize){
            // we can replace our hard-coded numbers with i
            System.out.println("Number instruments in beaker indexed at " 
                    + i + ": " + String.valueOf(intArray[i]));
            // after we've done our work, increment i so we look at the next
            // bin the next time through the loop
            i = i + 1;
        } // close while
    } // close method
    
    
    
    public static void printNumericArrayWithForLoop(int[] intArray){
        System.out.println("");
        System.out.println("********* ACCESSING ARRAY WITH FOR LOOP *********");
        
        // create a for() loop to visit each bin of the array and
        // run code to print out the values
        int arraySize = intArray.length;
        for(int i = 0; i < arraySize; i = i + 1){
            // we can replace our hard-coded numbers with i
            System.out.println("Number instruments in beaker indexed at " 
                    + i + ": " + String.valueOf(intArray[i]));
        } // close for() loop
        
        
    } // close method
    
    public static int calculateSumOfArrayValues(int[] intArray){
        
        int totalInstruments = 0;
        for(int i = 0; i < intArray.length; i = i + 1){
            // we can replace our hard-coded numbers with i
            totalInstruments = totalInstruments + intArray[i];
        } // close for() loop
        
        return totalInstruments;
    } 
    
    public static double calculateAverageOfArrayValues(int[] intArray){
        int totalInstruments = 0;
        int arraySize = intArray.length;
        for(int i = 0; i < arraySize; i = i + 1){
            // we can replace our hard-coded numbers with i
            totalInstruments = totalInstruments + intArray[i];
        } // close for() loop
        
        double averageValue = totalInstruments / arraySize;
        return averageValue;
        
    }
    
} // close class
