/*
 * Copyright (C) 2018 delores
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
package components.comp3_objects.oop4_btfcars;

/**
 * Client class of our practice Car class
 * @author delores
 */
public class CarLandNegSpeeds {
    public static void main(String[] args) {
        // create a new instance of a Car object with the keyword: new
        Car deLorean = new Car();
        // set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        // send our Car instance to a helper method to print its member variables
        deLorean.startEngine();
        deLorean.accelerate(88);
        displayCarStats(deLorean);
        deLorean.decelerate(100);
        displayCarStats(deLorean);
        
    } // close main
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("*****************");
    } // close displayCarStats
    
    
} // close class
