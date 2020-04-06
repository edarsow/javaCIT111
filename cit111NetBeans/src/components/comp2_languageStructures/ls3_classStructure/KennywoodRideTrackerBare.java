/*
 * Copyright (C) 2017 Technology Rediscovery
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
package components.comp2_languageStructures.ls3_classStructure;

import java.util.Random;

/**
 * This class is a companion to module 3: Class Structure in the language structures
 * component of CIT111 taught at the Community College of Allgheny County in Pitsburgh, pa.
 * You can access the guide for creating this class at 
 * http://http://technologyrediscovery.net/java/mods/ls3_classStructure.html
 * @author Eric Darsow
 */

public class KennywoodRideTrackerBare {
   
   // Member variables; they will all have private static [type] [var name]
   // we'll initialize all to zero
  private static int totalRiders = 0;
  private static int totalFailedRiders = 0;
  private static int totalSickRiders = 0;

  // named constant values; never change (i.e. final)
  final static int MIN_HEIGHT_THRILL = 50;
  final static int MIN_HEIGHT_THEME = 34;

    public static void main(String[] args){
      System.out.println("In Main");
      rideBlackWidow(10, 60);
      printRiderStats();
      rideBlackWidow(4, 60);
      printRiderStats();
      rideBlackWidow(342, 60);
      printRiderStats();
    } // close main()
    
    public static void rideBlackWidow(int riders, int avgHeight){
        System.out.println("Riding Black Widow!!!");
        // adding incoming riders to my member variable tracking totalRiders
        totalRiders = totalRiders + riders;

    } // close method
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        
    } // close method
    
    public static void printRiderStats(){
       System.out.println("total riders: " + totalRiders);
    } // close method
    
} // close class
