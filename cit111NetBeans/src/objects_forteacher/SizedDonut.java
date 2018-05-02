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

package objects_forteacher;

import objects2_creatures.*;

public class SizedDonut {
    
    // member variables
    public String name;
    public int sizeInmm;

    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){
        // subtract the percentEaten at this moment from existing
        // amount of the SizedDonut
        percRemaining = percRemaining - percentEaten;
        System.out.println("SizedDonut.simulateEating | Perc Rem: " + percRemaining);
        
    } // close method
    
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
} // close class



