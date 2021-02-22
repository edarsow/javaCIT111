/*
 * Copyright (C) 2021 Eric Darsow <edarsow@ccac.edu>
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
package sandbox;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class Literals {
    
    public static void main(String[] args) {
        // Assign a literal boolean value to a boolean-typed variable
        boolean debuggedHeadlights; 
        debuggedHeadlights =  false;
        
        boolean enoughTimeToDebug = false;
        // Go look up the value of the variable enoughTimeToDebug
        // When you've got that value, then assign it to debuggedHeadlights
        debuggedHeadlights = enoughTimeToDebug;

        double bidAmount = 33.0 + 56.0;
        
        int kids = 2;
        String carsOnNebular = String.valueOf(kids); 
//        int total = carsOnNebular + 3;
        System.out.println(carsOnNebular);
        
//        int passengers = kids + adults;
        
    }
    
}
