/*
 * Copyright (C) 2017 delores
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
package structures;

/**
 *
 * @author delores
 */
public class TwoNamesSeed {
    
    public static void main(String[] args){
        System.out.println("Calling a method to create a greeting:");
        greet("Helen", "Esther");
        System.out.println("---------------------------------------------------------");
        
    } // close main
    
      
    /**
     * Simulates a greeting between two people passed in as parameters
     * @param greeter The person doing the greeting
     * @param greetee The person being greeted
     */
    public static void greet(String greeter, String greetee){
        System.out.println("Why hello " + greetee + ", folks call me " + greeter +"!");
    } // close method
    
    
   
} // close class
