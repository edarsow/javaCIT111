
package components.comp3_objects.oop1_javadonuts;

/**
 *
 * @author Technology Rediscovery
 */
public class Donut {
    
    private int percRemaining = 100;
    
    public String name;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
        
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }  
}
