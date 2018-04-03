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
public class GeometricShapesCubeSimpleCall {

    public static void main(String[] args){
           
        // calls our method inside our call to println()!
        // it's a neseted method call!
        System.out.println("Volume of a cube: " + calcVolumeOfCube(50.0));
       
    } // close main method
    
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
