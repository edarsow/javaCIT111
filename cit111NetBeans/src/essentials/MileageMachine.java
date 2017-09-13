package essentials;

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
public class MileageMachine {
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
        double totalFuelCosts = (milesDriven / MAZDA_MILES_PER_GALLON) * FUEL_PRICE_2017;
        
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
        
        // now print to the screen a line that indiciates additional driving
        // has occured and display how many more miles are driven
        // <---- your code here - delete me ---->
        
        // display the initial and the new new final odometer readings on two lines
        // <---- your code here - delete me ---->
        
        // use the += operator (look it up if you need to) to now actually 
        // add the variable you created to represent additioanl miles driven
        // to the ending odometer variable
        // <---- your code here - delete me ---->
        
        // recalcualte the total miles driven and assign that to milesDriven
        // <---- your code here - delete me ---->
        
        // calculate the new total fuel costs and store it in a NEW
        // variable. Dont' use totalFuelCosts
        // <---- your code here - delete me ---->
        
        // Now send the new miles driven and fuel costs to the console
        // <---- your code here - delete me ---->
                
         // ** TASK 2: Redisplay the oil change information **
        // with the value of these variables udpdated, display the total oil
        // changes that should have occured and when the next oil change is due
        // NOTE you will not need to declare any new varaibles
        
        // <---- your code here - delete me ---->
        
         // ** TASK 3: Calclulate and display the increase in costs **
         // Create a new variable that will hold the increase in total cost
         // of gas after these additional miles are driven
         
         // <---- your code here - delete me ---->

         //Subtract the new fuel costs from the previous fuel costs
         // and store that value in the increase in fuel costs variable you
         // just created.
         // <---- your code here - delete me ---->
         
         // Display the new data to the console
         // <---- your code here - delete me ---->
    } // close main
    
    // ** TASK 4: Refactor into methods to avoid code repetition**
    
    // We have duplicated lots of code to calculate and display fuel and and oil
    // change info. To avoid duplication of code, create two new methods
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
    // new methods in main() and printing the return values. We should push as much
    // code as we can into these two new methods.
    
} // close class
