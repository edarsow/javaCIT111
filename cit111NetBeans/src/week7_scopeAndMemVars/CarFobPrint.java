package week7_scopeAndMemVars;

import components.comp2_languageStructures.ls1_basicMethods.*;
import java.lang.*;
import java.util.Scanner;

public class CarFobPrint {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a broadcast frequency as a decimal number:");
        double userFreq = scanner.nextDouble();
        broadFreq = userFreq;
        
        System.out.println("Enter a vehicle frequency as an integer:");
        int userVehicleId = scanner.nextInt();
        vehicleId = userVehicleId;
        
        System.out.println("Configuration Complete for vechile " + vehicleId + 
                " and broadcasting on frequency: " + broadFreq);
    } //close configure
    
    public static void unlock(int numdoors){
        doorsLocked = false;
        System.out.println(numdoors + " doors unlocked on vehicle " + vehicleId +
                "using frequency " + broadFreq);
    } // close unlock
    
   
}
    