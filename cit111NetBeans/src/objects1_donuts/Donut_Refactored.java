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

public class Donut_Refactored {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    
    public void simulateEating(int percentEaten){
        System.out.println("Inside simulateEating method");
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        System.out.println("Inside getPercRemaining method");
        return percRemaining;
    } // close method
    
} // close class



