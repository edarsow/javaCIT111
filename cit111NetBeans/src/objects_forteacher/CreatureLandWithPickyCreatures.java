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
package objects_forteacher;

import objects2_creatures.Creature;
import objects2_creatures.SizedDonut;

/**
 * Class which demonstrates the creation
 * and manipulation of Java Objects
 * @author delores
 */

public class CreatureLandWithPickyCreatures { 
    public static void main(String[] args) {
        PickyCreature penguin;
        penguin = new PickyCreature();
        // writing member variable values
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        penguin.setMinimumDonutSize(80);
        penguin.setBiteSizeInPercent(10);
        displayCreatureStats(penguin);
        
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Chloe";
        donutForPenguin.sizeInmm = 66;
        displaySizedDonutStats(donutForPenguin);
        
        SizedDonut anotherDForP = new SizedDonut();
        anotherDForP.name = "Rolando";
        anotherDForP.sizeInmm = 123;
        displaySizedDonutStats(anotherDForP);
        
        // THIS IS THE CRITICAL LINE!
        // pass an instance of a SizedDonut object into 
        // the eatDonut method on our Creature object
        penguin.eatDonut(donutForPenguin);
        penguin.eatDonut(anotherDForP);
        
        displaySizedDonutStats(donutForPenguin);
        displaySizedDonutStats(anotherDForP);
        
    } // close main
    
    public static void displaySizedDonutStats(SizedDonut d){
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + d.name);
        System.out.println("Size: " + d.sizeInmm + "mm");
        System.out.println("Percent Remaining: " 
                + d.getPercRemaining() + "%");
        System.out.println("**********************");
    } // close method
    
    public static void displayCreatureStats(PickyCreature c){
        System.out.println("***Creature Stats***");
        System.out.println("Creature Name: " + c.name);
        System.out.println("Species: " + c.species);
        System.out.println("Bite size: " + c.getBiteSizeInPercent() 
                + "% of a SizedDonut");
        System.out.println("Min SizedDonut size: " + c.getMinimumDonutSize()
                + "mm");
        System.out.println("**********************");
    } // close method
} // close class