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

    public String name;
    public String species;
    
    private int biteSizeInPercent;
    private int numBitesTaken;
    private int sizeLimit;
      
    // Method to simulate eating donut
    public int eatDonut(SizedDonut donutToEat){
        // we'll program guts here
        return numBitesTaken;
    }
    
    // "getter" method for a private member variable: sizeLimit
    public int getSizeLimit() {
        // just send back the value of sizeLimit
        return sizeLimit;
    }

    // "setter" method for private member variable: sizeLimit
    public void setSizeLimit(int sizeLimit) {
        // we need guts to check for a reasonable size limit
        this.sizeLimit = sizeLimit;
    }

    // "getter" for numBitesTaken
    public int getNumBitesTaken() {
        // just send back the value of numBitesTaken
        return numBitesTaken;
    }

    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int biteSizeInPercent) {
        // we need guts to check bite size
        this.biteSizeInPercent = biteSizeInPercent;
    }
    
} // close class
