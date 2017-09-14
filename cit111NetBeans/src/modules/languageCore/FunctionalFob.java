package modules.languageCore;

// Import the Scanner class from java.util to access the keyboard input
import java.util.Scanner;

/**
 * This class models the behavior of a remote car entry device that is
 * often attached to key rings. It includes a method for configuring
 * the device given a broadcast frequency and a vehicle identifier
 * @author Eric Darsow
 */
public class FunctionalFob {
    
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
    * TASK 1: SETUP METHODS
    * SKILL: 
     * Using the above code as a template, create all necessary method declarations and
     * code blocks to implment the following functions of our FOB. Note the input and 
     * out parameters for each method
     * - Unlock - Takes an int representing the number of doors to unlock.
     *            Print a confirmation of action. Returns nothing. 
     * - Lock   - Takes no parameters and automatically unlocks all doors.
     *            Prints a confirmation to the screen
     * - Sound Alarm
     *          - Takes no parameters and simply prints out alarm like 
     *          - strings. Doesn't reutrn anything.
     * - PopHatch
     *          - Takes no parameters and prints pop-like text to the console
     */
    
    // Your methods here
    
    /**
     * HINT: 
     * Create a method called soundAlarm() which takes no parameters
     * and toggles the car alarm when called. You'll also neeed to add
     * a member variable with this declration:\
     * 
     * private static int soundAlarm(){...} 
     * 
     */
    
    /**
     * TASK 2: WORKING WITH MEMBER VARIABLES
     * SKILLS: Creating and adjusting member variables
     * We want the car FOB to know the status of each of it's car functions.
     * Now that you have methods to go with each of the four functions 
     * of the device, create member variables of the appropriate type
     * which represent the following pieces of information:
     * - How many doors are LOCKED
     * - The status of the alarm system (armed, off, and sounding)
     * - The status of the hatch: open or closed (makea boolean called isOpen)
     * 
     * Once your member variables are in place, adjust the methods so that
     * each method adjusts the "setting" in each of the member variables.
     * So the soundAlarm method should change the status of the member variables 
     * representing the security system is in the state of "sounding"
     * 
     * Demonstrate the performance of each of these methods by making
     * calls to each in main(). Screen shot the output.
     */
    
    /**
     * TASK 3: CLEANING UP THE CLASS TO USE OUR NEW METHODS
     * SKILL: Refactoring (change the structure of) code
     * We have four methods that each toggle their member variables
     * and can be called by any other method. 
     * 
     * We want to demosntrate how each method is called from main and it adjusts
     * the value of relevant member variables. During program runtime, 
     * we want calls to println() made from main to display all the member variables'
     * current state. We should do thisby including println() calls BEFORE and 
     * AFTER FOB methods are called .
     * 
     */
    
} // close class CarFob
