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
package components.comp3_objects.oop1_javadonuts;

/**
 *
 * @author delores
 */
public class DogLandComplete {
    
    public static void main(String[] args) {
        // create a new RoboDog instance
        // store in pointer: viciousDog
        RoboDogComplete viciousDog = new RoboDogComplete();
        viciousDog.name = "Norbert";
        viciousDog.breed = "Westie";
        viciousDog.age = 12;
        
        // display basic doc stats
        System.out.println("Dog 1: " + viciousDog.name);
        System.out.println("Breed of " + viciousDog.name + ": " 
                + viciousDog.breed);
        System.out.println("Age of " + viciousDog.name + ": " 
                + viciousDog.age);
    
        // test bark()
        viciousDog.bark();
        
        // test findTreasure();
        boolean foundTreasure = viciousDog.findTreasure();
        System.out.println("Did " + viciousDog.name  + "find a treasure? " 
                    + foundTreasure);
        
        // test listenForCall()
        int dist = 10;
        boolean heardCall = viciousDog.listenForCall(dist);
        System.out.println("Did " + viciousDog.name  + " hear a call " +  dist 
                + " meters away? "+ heardCall);
        
        
        // ** Test our eatDonut() method **
        // make a Donut!
        Donut donutForRobodog = new Donut();
        
        System.out.println();
        System.out.println();
        
        // and print out the percent remaining -- should be 100
        System.out.println("**** TESTING EATDONUT METHOD ****");
        System.out.println("Perc Remaining on donutForRobot: " 
                + donutForRobodog.getPercRemaining());
        
        // now call eatDonut on the RoboDog and pass it a Donut object
        int percRoboDogWillEat = 45;
        viciousDog.eatDonut(donutForRobodog, percRoboDogWillEat);
        
        // test that the donut was, in fact, eaten by RoboDog
        
         System.out.println("Perc Remaining on donutForRobot: " 
                + donutForRobodog.getPercRemaining());
        
        } // close main()
} // close class
