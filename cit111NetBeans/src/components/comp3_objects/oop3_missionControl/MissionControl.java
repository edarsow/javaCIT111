package components.comp3_objects.oop3_missionControl;

import java.util.Scanner;

/**
 * Class respresents a mission control station in a disaster site rescue
 * simulation. This class is responsible for creating the simulation objects
 * and facilitating the user's interaction with those objects.
 * 
 * @author Eric Darsow
 */
public class MissionControl {
    
    // total personnel available for deployment
    final int totalStaff = 10;
    
    // the DisasterSite object is stored in a member variable
    // so all methods in MissionControl can access it
    private static DisasterSite mainSite;
    
    /**
     * Program entry point--creates DiasterSite and
     * Transfers control to the commander
     * @param args no parameters needed
     */
    public static void main(String[] args) {
        // create a DisasterSite object and store it in a class member variable
        mainSite = new DisasterSite();
        // transfer execution control to this method
        commanderControl();
    }
    
    /**
     * Utility class for writing notices to the console.
     * Uses a sleep method to simulate the communication process
     * @param event the text about the event to be logged
     */
    public static void logEvent(String event){
        // spacing only
        System.out.println("");
        // we need this try/catch thing for reasons we don't understand yet
        try {
            // wait 1 second
            Thread.sleep(1000);
            // print out whatever string was passed into the method
            System.out.println("log entry: " + event);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("");
    } // close method
    
    /**
     * Coordinates all disaster recovery related events
     */
    public static void commanderControl(){
        // stores user action for switch statement control
        int action = 0;
        // allow the commander to act until the exit signal is passed in
        while(action != -1){
            // transfer control to a method for gathering a single int
            // from the Commander user and passing it back into this method
            action = getCommanderAction();
            // The commander's choice is now processed by the switch statement
            // if the user enters 1, then case 1 is executed.
            switch (action) {
                // Write current vicitms to the log
                case 1: int result = mainSite.getCurrentVictimCount();
                        logEvent("Current Victims: " + String.valueOf(result));
                        break;
                // Assemble and dispatch crew
                case 2: dispatchCrew();
                        break;
            } // end switch
        } // end while
    } // close method
    
    
    /**
     * Utility method for gathering user input, i.e. the commander actions
     * Prints out the options for an action and prepares it for return
     * @return the user's selection
     */
    public static int getCommanderAction(){
        System.out.println("**********************************");
        System.out.println("MISSION CONTROL: COMMANDER ACTIONS:");
        System.out.println("**********************************");
        
        System.out.println("1. Write current victim count to the log");
        System.out.println("2. Assemble and dispatch rescue Team");
        System.out.println("3. Check mission status");
        System.out.println("-1. Exit Program");
        System.out.println("**********************************");
        // prompt user
        System.out.print("Enter desired action number: ");
        Scanner scanner = new Scanner(System.in);
        
        // get input from the user
        int commanderChoice = scanner.nextInt();
        // send the choice back tot he calling method
        return commanderChoice;
    } // close method
    
    /**
     * Simulates the formation and dispatching of the rescue crew
     * to the DisasterSite. Handles crew creation.
     */
    public static void dispatchCrew() {
        Scanner scanner = new Scanner(System.in);
        // prompt user and get size
        System.out.print("Enter a crew size to dispatch: ");
        int crewSize = scanner.nextInt();
        
        // build a new RescueTeam object to send to the DisasterSite
        RescueTeam rescueTeam1 = new RescueTeam();
        // set the team size on the RescueTeam object
        rescueTeam1.setTeamSize(crewSize);
        
        // Send the rescue team to make an attempt. The returned
        // value from makeRescueAttempt() is the count of rescued victims
        int numRescued = mainSite.makeRescueAttempt(rescueTeam1);
        System.out.println("Rescue underway...");
        // send the result to the log
        logEvent("Number vicitims rescued: " + numRescued);
       
    } // close method
} // close class
