package essentials;

/**
 * Implements the basic equation for calculating the remaining
 * mass of a decaying nuclear compund after a given time period
 * @author Eric Darsow
 */

public class HalfLife {
    // half life of Cesium 137 which is a physical constant
    final static double CS137_HALF_LIFE = 30.17;
    
    public static void main(String[] args){
        double initialKgCS = 1200000;
        double yearsToDecay = (2017 + (9/12)) - (1986 + (4/12));
        
        System.out.println("Years since chernobyl disaster: " + yearsToDecay);
        System.out.println("Mass of Cesium waste at the time of disaster: " + initialKgCS);
        
        double massAfterDecay = calculateCSMassRemaining(initialKgCS, yearsToDecay);
        System.out.println("Today, " + massAfterDecay + " kg of Cesium-137 still remain");
    } // close method
    
    public static double calculateCSMassRemaining(double initial, double time){
        // implement the radioactive decay formula of A = I * 2^(-t/h)
        // Referenced at http://www.coolmath.com/
        double finalMass;
        double expExpression = Math.pow(2, (-1 * time) / CS137_HALF_LIFE);
        finalMass = initial * expExpression;
        // send this double value back to the calling method
        return finalMass; 
    } // close method
    
} // close class
