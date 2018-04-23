/*
 * Copyright (C) 2017 Eric Darsow
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


package objects1_donuts;

public class DonutLand_Refactored {
    
        final static int nibble = 5;
        final static int megaBite = 45;
        
    public static void main(String[] args){

        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Chloe";
        
        // pass our Donut referenced by firstDonut to printObjectData
        printObjectData(firstDonut);
        
        // follow same pattern to make a second Donut object
        Donut secondDonut;
        secondDonut = new Donut();
        secondDonut.name = "Crusoe";
        
        printObjectData(secondDonut);
        
        // now eat some of each donut and print out the stats
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Taking megaBite...");
        firstDonut.simulateEating(megaBite);
        printObjectData(firstDonut);
        
        // same pattern for secondDonut
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");
            secondDonut.simulateEating(megaBite);
        }
        
        printObjectData(secondDonut);
        
    } // close main
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-------STATS--------|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------|");
    } // close printObjectData method
} // close class
