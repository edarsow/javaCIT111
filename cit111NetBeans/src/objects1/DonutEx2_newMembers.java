
package objects1;

import components.comp3_objects.oop1_javadonuts.*;

/**
 *
 * @author Technology Rediscovery
 */
public class DonutEx2_newMembers {
    
    private int percRemaining = 100;
    
    public String name;
    
    public int simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
        return percentEaten;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }  
}
