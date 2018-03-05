package week7_scopeAndMemVars;

// This is an unncesary import since all classes in java.lang are imported
// automatically and are known as the standard library
import components.comp2_languageStructures.ls1_basicMethods.*;
import java.lang.*;
// Import the Scanner class from java.util to access the keyboard input
import java.util.Scanner;

/**
 * This class models the behavior of a remote car entry device that is
 * often attached to key rings. It includes a method for configuring
 * the device given a broadcast frequency and a vehicle identifier
 * @author Eric Darsow
 */
public class CarFob {
    
    // Marked private to prevent other classes from tinnkering with these variables
    // These two member variables are accessible to any method in this class
    private static double broadFreq;
    private static int vehicleId;
    // assume our vehicle starts with its doors locked
    private static boolean doorsLocked = true;
    
    public static void main(String[] args){
        System.out.println("CAR FOB PROGRAMMING UTILITY");
        // call configure() to initiate the configuration process
        // configure takes zero arguments
        configure();
        
        // Now that we have a configured key FOB, call unlocked
        // and request four doors to be unlocked
        unlock(4);
        
        // Prove to ouselves that the flow of execution returned to main()
        System.out.println("Closig Car FOB utility");
        // Program execution terminates here, at the end of main()
    } // close main
    
    public static void configure(){
        // create a Scanner for gathering user input
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter a double
        System.out.println("Enter a broadcast frequency as a decimal number:");
        // Call the scanner's nextDouble() method to retrieve a double from the keybaord
        double userFreq = scanner.nextDouble();
        // set the member variable broadFreq to whatever the user entered
        broadFreq = userFreq;
        
        // same procedure as above for the vehicle ID
        System.out.println("Enter a vehicle frequency as an integer:");
        int userVehicleId = scanner.nextInt();
        vehicleId = userVehicleId;
        
        // Notify the user that the configuration is complete
        System.out.println("Configuration Complete for vechile " + vehicleId + 
                " and broadcasting on frequency: " + broadFreq);
    } //close configure
    
    public static void unlock(int numdoors){
        // toggle the boolean variable doorsLocked to true, representing
        // the now unlocked car
        doorsLocked = false;
        System.out.println(numdoors + " doors unlocked on vehicle " + vehicleId +
                "using frequency " + broadFreq);
    } // close unlock
    
    /**
     * ***** NOW YOU TRY!! *******
     * Using the above code as a template, create a method called lock
     * which changes the value of doorsLocked to 'true' and prints out the
     * status to the user.
     * Once you write the method below, call that method from main()
     */
    
    // Your lock() method here
    
    /**
     * TASK 2
     * Create a method called soundAlarm() which takes no parameters
     * and toggles the car alarm when called. You'll also neeed to add
     * a member variable with this declration:\
     * 
     * private static int soundAlarm(){...} 
     * 
     * // your soundAlarm() method here
     */
} // close class CarFob
