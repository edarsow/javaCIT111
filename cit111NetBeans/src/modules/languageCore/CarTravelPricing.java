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
package modules.languageCore;

import java.util.Scanner;

/**
 *
 * @author delores
 */
public class CarTravelPricing {
    
    final static double MAZDA_MILES_PER_GALLON = 27.0;
    final static double FUEL_PRICE_2017 = 2.89;
    final static int MILES_PER_OIL_CHANGE = 3000;
    
    public static void main(String[] args){

        System.out.println("***********************************");
        System.out.println("******TRIP MILEAGE MACHINE*********");
        System.out.println("*****GAS PRICES AND OIL CHANGES****");
        
        // create a scanner for gathering user input and get input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter odometer reading at the start of the trip");
        int destAOdometer = scan.nextInt();
        
        System.out.println("Please enter odometer reading at the end of the trip");
        int destBOdometer = scan.nextInt();
        
        // these two lines are our number crunching lines
        int milesDrivenAtoB = destBOdometer - destAOdometer;
        double totalFuelCosts = (milesDrivenAtoB / MAZDA_MILES_PER_GALLON) * FUEL_PRICE_2017;
        
        // report the calculations to the user
        System.out.println("Driving " + milesDrivenAtoB + " miles  from A to B cost " 
                + totalFuelCosts + " dollars");
        
        // Math.floor drops the argument of the method to the next lowest whole number
        double numDesiredOilChanges = Math.floor(milesDrivenAtoB / MILES_PER_OIL_CHANGE);
        System.out.println("You should have changed the oil " + numDesiredOilChanges 
                + " times");
        double milesToNextChange = (milesDrivenAtoB % MILES_PER_OIL_CHANGE);
        System.out.println("Change oil again in " + milesToNextChange + " miles");
        
        // ** TASK 1: Drive the car additional miles and re-calculate stats **           
        // SKILL: Identifying data needs               
        // create a new variable called destCOdometer and assign it an odometer
        // value that the user is prompted to enter. Re-write code from above here.
        
        // <---- your code here - delete me ---->
        
        // Now that we have a destination C, calculate the distance from B to C
        // and assign that value to a variable called milesDrivenBtoC;
        // <---- your code here - delete me ---->
        
        // Calculate the fuel costs for traveling from B to C and display this data
        // <---- your code here - delete me ---->
        
        // Calcualte the number of oil changes that should have occurred and 
        // display this data to the console
        // <---- your code here - delete me ---->
        
        // Finally, provide overall trip stats by creating a new varaible called
        // totalTripMileage and totalTripOilChanges and populating those 
        // with appropriately calculated values. Display those to the user
        // <---- your code here - delete me ---->
        
        // Print final stats to the user using println() calls
        // <---- your code here - delete me ---->
        
    } // close main
    
    // ** TASK 2: Refactor into methods to avoid code repetition**
    // SKILL: Writing and calling simple methods
    
    // We have duplicated lots of code to calculate and display fuel and and oil
    // change info from A to B, then B to C, and the entire trip. 
    // This has involved basically copying and pasting lines of code, tweaking
    // them a little bit, and displaying their result.
    
    // This is a Bad Thing because we'd have to change several lines of code
    // if we found a math error or would like to expand the system to include
    // a desitination D, etc.
    
    // To avoid duplication of code, create two new methods
    // that calcualte total fuel costs and one that calculates oil change 
    // info.
    
    // the first method should be called calculateTotalFuelCosts
    // and should take only one parameter -- the miles driven
    // and should return a double value representing the total cost of driving
    // those miles
    // DO NOT call pritnln() from this method -- do it in main with the reutrn values
    
    // the second method should be called calculateOilChanges
    // and should take total miles driven as a parameter and return
    // a double value representing the total oil changes that should
    // DO NOT call pritnln() from this method -- do it in main with the reutrn values
    // have been made during the journey over those miles
    
    // do a bunch of work to refactor the code so that we're calling these two
    // new methods in main() and printing the return values. The lines of code
    // in main should only be calling println() methods to display math calculations
    // that are done in these two new methods
    
    
    /**
     * ************TASK 3 ********************
     * Skill: Developing data validation systems with if() statements
     * 
     * It is possible that the user will enter odometer values that are 
     * nonsensical, such as a destination C odometer reading that is lower
     * and a destination B reading. We cannot travel negative distances
     * in our dimensions of existince.
     * 
     * Use if() statments to compare the odometer readings entered by the user
     * and ensure that they are sensible and we can perform any required
     * calualtions on the data the user entered.
     * 
     * Create appropriate messages to the user in the case of misentered
     * data. For 1000 points extra credit, use a while loop to keep asking
     * the user for new data in case the data entered is incorrect.
     * 
     * Take a screen shot of your program output to include with your code's
     * presentation.
     * 
     * 
     */
    
    
    
} // close class
