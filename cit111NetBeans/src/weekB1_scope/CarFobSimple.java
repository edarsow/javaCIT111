package weekB1_scope;

import components.comp2_languageStructures.ls1_basicMethods.*;
import java.util.Scanner;

public class CarFobSimple {
    
   
    private static double broadFreq;
    private static int vehicleId;
    private static boolean doorsLocked = true;
    
    public static void main(String[] args){
        System.out.println("CAR FOB PROGRAMMING UTILITY");
        configure();
        unlock(4);
        System.out.println("Closig Car FOB utility");
       
    } // close main
    
    public static void configure(){
        // Ask the user for a broadcast frequency and car ID. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a broadcast frequency as a decimal number:");
        double userFreq = scanner.nextDouble();
        // Set the member variables broadFreq so any method can use this value
        broadFreq = userFreq;
        
        System.out.println("Enter a vehicle frequency as an integer:");
        int userVehicleId = scanner.nextInt();
        // Set the member variable vehicleId so any method can use this value
        vehicleId = userVehicleId;
        
        System.out.println("Configuration Complete for vechile " + vehicleId + 
                " and broadcasting on frequency: " + broadFreq);
    } //close method configure()
    
    public static void unlock(int numdoors){
        doorsLocked = false;
        System.out.println(numdoors + " doors unlocked on vehicle " + vehicleId +
                "using frequency " + broadFreq);
        System.out.println("Doors Locked? " + doorsLocked);
    } // close method unlock()
    
} // close class CarFob



