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
     
       
                
    } // close class main
} // close class RoadTrip
