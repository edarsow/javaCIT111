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
package week8_methods2;

import components.comp2_languageStructures.ls2_methodContracts.*;
import java.util.Scanner;


/**
 * Code for teaching the essential principles of method calls and signatures
 * that implement several elementry geometry formulas. This code is a companion 
 * to the Language Structures Module 1 (LS1) in the http://technologyrediscovery.net 
 * CIT111:  * inrtroduction to programming course taught at the Community College 
 * of Allegheny County in Pittsburgh, PA
 * @author Eric Darsow
 */


public class GeometricShapesSeed {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // Gather method parameters from the user and send to method for calculation
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double userSideLength = scan.nextDouble();
        
        // call calcVolumeOfCube() with the user's side length as an argument
        double returnedVolume = calcVolumeOfCube(userSideLength);
        
        // print the inputs and the ouputs to the console
        System.out.println("The volume of a cube with side length " + userSideLength + 
                " is " + returnedVolume);
        System.out.println("--------------------------------------------------------");
    } // close main
    
     /**
     * Calculates the volume of a cube with a given side length
     * @param sideLength the length of the side of the cube
     * @return the volume of the cube
     */
    public static double calcVolumeOfCube(double sideLength){
        // implements the cube area formulas: side ^3
        double cubeVolume = Math.pow(sideLength, 3);
        // return the area back to the calling method
        return cubeVolume;
    } // close method
} // close class
