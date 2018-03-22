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
public class GeometricShapesComplete {
    /**
     * Acts as the controller in this program, calling methods which implement
     * several basic geometric formulas
     * @param args not used
     */
    public static void main(String[] args){
        // creat a scanner object to gather user input
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
        

        // gather the radius and hight from the user with a scanner
        System.out.println("Enter the cylinder radius:");
        double userRadius = scan.nextDouble();
        System.out.println("Enter the cylinder height:");
        double userHeight = scan.nextDouble();
        
        // call calcVolumeOfCylinder() with user-entered radius and height
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        // nicely print out our cylinder tool's result
        System.out.println("The volume of a cylinder with radius: " + userRadius + 
                "\nand height of " + userHeight + " is " + returnedCylVolume);
        System.out.println("--------------------------------------------------------");
        
        
        
        System.out.println("Enter the side 2 lengths followed by the \nheight of the trapezoid");
        // user a scanner to collect the three trapezoidal dimensions
        double userb1 = scan.nextDouble();
        double userb2 = scan.nextDouble();
        double trapHeight = scan.nextDouble();
        
        // call our method and pass down the user-entered values
        double returnedTrapArea = calcAreaOfTrapezoid(userb1, userb2, trapHeight);
        // nicely print out the results of our method call
        System.out.println("The area of the " + userb1 + "x" + userb2 + "x" + trapHeight 
                + " trapezoid is " + returnedTrapArea);
        
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
    
    /**
     * Calculates the volume of a cylinder with a given radius and height
     * @param radius raidus of the cylinder
     * @param height height of the cylinde
     * @return the volume of the cylinder
     */
    public static double calcVolumeOfCylinder(double radius, double height){
        final double PI = 3.1416;
        // implements the right cylinder formula: V = pi * r^2 * h
        double cylVol = PI * (radius * radius) * height; 
        // send the volume back to the calling method
        return cylVol;
    } // close method
    
    /**
     * Calculates the area of a trapezoid with given base lengths and height
     * @param b1 length of base 1
     * @param b2 length of base 2
     * @param height height of the trapezoid
     * @return the area of the trapezoid
     */
    public static double calcAreaOfTrapezoid(double b1, double b2, double height){
        // implements the formula for the area of a trapezoid
        double trapArea = (0.5) * (b1 + b2) * height;
        // send the area back to the calling method
        return trapArea;
    } // close method
} // close class
