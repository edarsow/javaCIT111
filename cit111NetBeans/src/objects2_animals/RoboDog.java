
package objects2_animals;

import components.comp3_objects.oop1_javadonuts.*;

/**
 * Simulates simple behaviors of a robotic dog
 * @author Technology Rediscovery
 */
public class RoboDog {
    
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
        // write my guts
    }

    /**
     * Simulates the dog looking for treasures in the
     * backyard. Use a random number generator to create
     * some variability in whether or not the dog finds treasure
     * 
     * @return whether or not the dog found a treasure on its hunt
     */
    public boolean findTreasure(){
       // write my guts
       
       return true; //change me
    }
    
    /**
     * Simulates the dog's ability to hear a call some
     * distance from itself. Uses the MAX_HEARING_DISTANCE
     * constant to determine if the call can be heard 
     * 
     * @param distance the distance from the call to the dog
     * @return whether or not the dog could hear the call
     */
    public boolean listenForCall(int distance){
        // write my guts
        
        return true; //change me
       
    }
    
}
