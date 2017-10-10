/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.comp1_languageCore.lc2_operators;

/**
 * As a language fundamentals learning Class, this Mileage Machine approaches
 * the problem of calculating mileage costs and oil change cycles
 * using a procedural mindset. Constants hold fixed car attributes 
 * and numeric type variables handle the calculations.
 * All methods are static and their local variables only exist in a static (non-
 * instantiated) context. 
 * 
 * See MileageObject for an object-oriented approach to this problem.
 * @author Eric Darsow
 */

public class MileageMachineTask1Key {
    final static double MAZDA_MILES_PER_GALLON = 27.0;
    final static double FUEL_PRICE_2017 = 2.89;
    final static int MILES_PER_OIL_CHANGE = 3000;
    
    public static void main(String[] args){
        // odometer values
        int startingOdometer = 224766;
        int endingOdometer = 280196;

        // price per mile = miles / fuel cost per unit
        double pricePerMile = MAZDA_MILES_PER_GALLON / FUEL_PRICE_2017;

        int milesDriven = endingOdometer - startingOdometer;

        // fuel costs = (miles driven) / (price per mile)
        double totalFuelCosts = milesDriven / pricePerMile;
        
        System.out.println("Driving " + milesDriven + " miles costs " 
                + totalFuelCosts + " dollars");
        
        // Math.floor drops the argument of the method to the next lowest whole number
        double numDesiredOilChanges = Math.floor(milesDriven / MILES_PER_OIL_CHANGE);
        System.out.println("You should have changed the oil " + numDesiredOilChanges 
                + " times");
        double milesToNextChange = (milesDriven % MILES_PER_OIL_CHANGE);
        System.out.println("Change oil again in " + milesToNextChange + " miles");
        
       // ** TASK 1: Drive the car additional miles and re-calculate **
        
        // create a variable of type int and initialize it to 44000 to repreaent
        // the car being driven an additional 44000 miles.
        
        // <---- your code here - delete me ---->
        
        int moreMiles = 44000;
        
        // now print to the screen a line that indiciates additional driving
        // has occured and display how many more miles are driven
        System.out.println("Driving...driving...driving " + moreMiles + " more miles");
        
        // display the initial and the new new final odometer readings on two lines
        System.out.println("Initial odomoeter: " + startingOdometer);
        System.out.println("New final odomoeter: " + endingOdometer);
        
        // use the += operator (look it up if you need to) to now actually 
        // add the variable you created to represent additioanl miles driven
        // to the ending odometer variable
        endingOdometer += moreMiles;
        // recalcualte the total miles driven and assign that to milesDriven
        milesDriven = endingOdometer - startingOdometer;
        // calculate the new total fuel costs and store it in a NEW
        // variable. Dont' use totalFuelCosts
        double newTotalFuelCosts = milesDriven / pricePerMile;
        // Now send the new miles driven and fuel costs to the console
        System.out.println("Driving " + milesDriven + " miles costs " 
                + newTotalFuelCosts + " dollars");
        
         // ** TASK 2: Redisplay the oil change information **
         
        // with the value of these variables udpdated, display the total oil
        // changes that should have occured and when the next oil change is due
        // NOTE you will not need to declare any new varaibles
        numDesiredOilChanges = Math.floor(milesDriven / MILES_PER_OIL_CHANGE);
        System.out.println("You should have changed the oil " + numDesiredOilChanges 
                + " times");
        milesToNextChange = (milesDriven % MILES_PER_OIL_CHANGE);
        System.out.println("Change oil again in " + milesToNextChange + " miles");
        
         // ** TASK 3: Calclulate and display the increase in costs **
         // Create a new variable that will hold the increase in total cost
         // of gas after these additional miles are driven
         double costIncrease;
         //Subtract the new fuel costs from the previous fuel costs
         // and store that value in the increase in fuel costs variable you
         // just created.
         costIncrease = newTotalFuelCosts - totalFuelCosts;
         
         // Display the new data to the console
         System.out.println("The new miles resulted in a cost increase of " + 
                 costIncrease);
    } // close main
    
} // close class
