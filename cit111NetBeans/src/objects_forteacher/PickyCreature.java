/*
 * Copyright (C) 2018 Technology Rediscovery, LLC
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

import objects2_creatures.SizedDonut;

/**
 * Class to demonstrate Object fundamentals in Java
 * @author Eric Darsow
 */

public class PickyCreature {

    // public member variables
    public String name;
    public String species;
    // private member variable
    private int biteSizeInPercent = 0;
    private int minimumDonutSize;

    // Method to simulate eating donut
    public void eatDonut(SizedDonut donutToEat){
        
        if(donutToEat.sizeInmm >= minimumDonutSize){
            System.out.println("Creature.eatDonut | Eating " 
                    + biteSizeInPercent + "% of " + donutToEat.name);
            donutToEat.simulateEating(biteSizeInPercent);
        } else {
            System.out.println("Creature.eatDonut | SizedDonut TOO SMALL! ");
            
        } // close if/else
    } // close method
    
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    } // close method
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("SizedDonut.setBiteSizeInPercent | "
                    + "Ooops, negative values not allowed!" );
        } // close if/else
    } // close method

    // "getter" method for accessing the value of this object's
    // minumumDonutSize member variable
    public int getMinimumDonutSize() {
        return minimumDonutSize;
    } // close method

    // "setter" method that allows the user of this class
    // to inject a value for the Creature's minimum 
    // SizedDonut that it will take a bite of
    public void setMinimumDonutSize(int minSizeToSet) {
        if(minSizeToSet > 0){
            this.minimumDonutSize = minSizeToSet;
        } else {
            System.out.println("Min SizedDonut size must be positive!");
        } // close if/else
    } // close method
    
} // close class
