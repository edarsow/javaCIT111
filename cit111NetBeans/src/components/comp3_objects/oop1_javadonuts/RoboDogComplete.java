
package components.comp3_objects.oop1_javadonuts;

import java.util.Random;
/**
 * Implemented RoboDog Class
 * @author Technology Rediscovery
 */
public class RoboDogComplete {
    
    // Consant: maximum meters the dog can hear
    final int MAX_HEARING_DISTANCE = 100;
    
    public String name;
    public String breed;
    public int age;
    
    /**
     * Simulates the dog barking with 
     * text printed to the console
     */
    public void bark(){
        System.out.println("...[very loud and scary barking]...");
    }

    /**
     * Simulates the dog looking for treasures in the
     * backyard. Use a random number generator to create
     * some variability in whether or not the dog finds treasure
     * 
     * @return whether or not the dog found a treasure on its hunt
     */
    public boolean findTreasure(){
        // don't forget to import java.util.Random
        Random rand = new Random();
        int randInt = rand.nextInt(11);
        // simulate findin treasure if randInt is 5 or more
        if (randInt >= 5) {
            return true;
        } else {
            return false;
        } // close if/else
    } // close method
    
    /**
     * Simulates the dog's ability to hear a call some
     * distance from itself. Uses the MAX_HEARING_DISTANCE
     * constant to determine if the call can be heard 
     * 
     * @param distance the distance from the call to the dog
     * @return whether or not the dog could hear the call
     */
    public boolean listenForCall(int distance){
        if(distance < MAX_HEARING_DISTANCE) {
            return true;
        } else {
            return false;
        } // close if/else
    } // close method
    
   /**
    * Simulates the RoboDog eating a Donut object
    * @param donut the donut to eat
    * @param percToEat the amount of the associated Donut to eat
    */
    public void eatDonut(Donut donut, int percToEat){

        donut.simulateEating(percToEat);
        System.out.println("Robodog just ate " + percToEat + " percent of a donut!");
        
    } // close method
    
    
    
    
} // close class
