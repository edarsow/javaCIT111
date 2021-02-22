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
package chunk1_mods3and4;

/**
 * Demo of basic comparison and if operatations
 * @author Loretta
 */
public class CompOperatorDemo {
    
    
    public static void main(String[] whateva){
        final int PARKING_BAN_SNOW_DEPTH = 3;
        
        String sign = "No parking this side of street if snow depth exceeds 3 inches";
        int currentSnowDepth = 2;
        
        // Use comparison operator >= to check if there's a parking ban
        // comparison operators always return a boolean, so I'll have a 
        // boolean-typed variable on the left side of my assignment =
        boolean snowCompResult; // delaring but not initializing boolean-type var
        snowCompResult = currentSnowDepth >= PARKING_BAN_SNOW_DEPTH; // init and assign to snowCompResult
        
        System.out.println(sign);
        // show result
//        System.out.print("Current snow depth: " + currentSnowDepth + " inches\n");
//        System.out.print("Is parking ban in effect? ");
//        
        StringBuilder sb = new StringBuilder();
        sb.append("Current snow depth: " );
        sb.append(currentSnowDepth);
        sb.append(" inches");
        System.out.println(sb.toString());
        
//        System.out.println(snowCompResult);
        
        // Logic mechanism in which the if {} block will only execute under the conditio
        // that the value of the expression inside ( ) evaluates to true
        
        if(snowCompResult){
            System.out.println("Parking ban IS in effect!! Move your vehicle.");
        } else { // else block is ONLY executed if the preceeding if's control statement
                 // evaluates to FALSE
            System.out.println("No parking ban. Park-ho!");
        }
                
    } // close main
    
} // close class
