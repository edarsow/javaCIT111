/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3Online;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah
 * @author Eric Darsow
 */
public class RoadTrip {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // delcaring this variable but not initalizing
        
        // simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        // print out initial stats
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("********************************************************");
        
        System.out.println();
        System.out.println("Beginning leg 1:");
        
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odomoeter by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading West 
        System.out.println("Oh, look! A person who wants to go west, too!");
        
        // Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alternative shorter version: currentNumberOfPassengers++
        } // closes if()
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from money remaining and over-write cashOnHand
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        // reprint the variables that I adjusted
        System.out.println();
        System.out.println("****Variable stats at end of the leg 1****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        // Solution to exercise for completing road trip
        
        //Step 1 in guide: set leg distance to 500 miles
        legDistance = 500.00;
        
        // Step 2: Sumulate finding a pair of hitchhikers and check car status
        System.out.println("Oh, Two more WestBound travelers! Check car sta");
        if(carFull == false){
            System.out.println("Car is not full--picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        }
        
        // Step 3: Calculate fuel price for driving 500.0 more miles
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Amount spent on gas leg 2: " + gasPriceForLeg);
        
        // Step 4: Print out leg two data:
        System.out.println();
        System.out.println("****Variable stats at end of the leg 2****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        // Step 5: Get remaining distance to utah as leg distance
        legDistance = distanceToMoabUtah - legDistance;
        
        // Step 6: More hitchikers
        System.out.println("More hitchers: another pair! Can we fit them?");
        
        int numHitchers = 2;
        // note this was a different method for testing capacity that's more
        // robust than the above method that doesn't take into account
        // the number of hitchers we might pick up
        if(currentNumberOfPassengers + numHitchers <= maxPassengers){
            System.out.println("Able to pick up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + numHitchers;
        } else  {
            System.out.println("Too many folks--can't take ya, sorry!");
        }
        
        // Step 7: pay for gas for rest of trip
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on final leg: " + gasPriceForLeg);
        
        // Step 8: Arrive! and toggle destination reached var
        destinationReached = true;
        
        // Step 9: Print out final stats:
        
        System.out.println();
        System.out.println("****Variable stats at end of the leg 3****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        
    } // close class main
} // close class RoadTrip
