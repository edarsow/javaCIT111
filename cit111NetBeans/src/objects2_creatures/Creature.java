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
package objects2_creatures;

/**
 * Class to demonstrate Object fundamentals in Java
 * @author Eric Darsow
 */

public class Creature {

    // public member variables
    public String name;
    public String species;
    // private member variable
    private int biteSizeInPercent = 0;

    // Method to simulate eating donut
    public void eatDonut(SizedDonut donutToEat){
        System.out.println("Creature.eatDonut | Eating " 
                + biteSizeInPercent + "% of " + donutToEat.name);
        // call the simulateEating method on the
        // passed in SizedDonut Object
        donutToEat.simulateEating(biteSizeInPercent);
        
    }
    
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("SizedDonut.setBiteSizeInPercent | "
                    + "Ooops, negative values not allowed!" );
        } // close if/else
    } // close method
    
} // close class
