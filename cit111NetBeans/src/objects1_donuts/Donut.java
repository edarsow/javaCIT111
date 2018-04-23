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
 * along wdonith this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package objects1_donuts;

public class Donut {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    
    // method: takes in an integer representing the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten){
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        // very simple guts: just send back the value of one of the object's
        // member variables to the calling method. this is called a "getter"
        return percRemaining;
    } // close method
    
    // there's no main() method in this class!
    // we must make this object with the new keyword inside another class
    // in order for this class to do anything
    
} // close class



