package week5;

import java.util.Random;

/**
 * Simulates a process control mechanism
 * that judges the quality of a product against
 * an established quality standard. A while-controlled block
 * is used to model the repeated assessment of a stream
 * of units with randomized quality values;
 * @author Eric Darsow
 */
public class QualityControlOnMyOwn {
    
    public static void main(String[] args){
        final int QUALITY_TRESHOLD = 65;
        final int MAX_QUALITY = 100;
        final int UNITS_TO_MAKE = 10000;

        int unitQuality = 0;
        int totalFailures = 0;
        int totalUnitsMade = 0;
        // make a random number generator
        Random randomGenerator = new Random();
        while(totalUnitsMade < UNITS_TO_MAKE){
            // generate a random number between 0 and 100
            unitQuality = randomGenerator.nextInt(MAX_QUALITY + 1);
            System.out.println("Unit Quality: " + unitQuality);
            // increment our total unit counter
            totalUnitsMade = totalUnitsMade + 1;
            
            // test the unit's quality against the threshold
            if(unitQuality < QUALITY_TRESHOLD){
                // execute these lines if below quality
                System.out.println("Unit below quality standards!");
                totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");
            } // close if/else
            
            // Provide a test summary up to this point
            System.out.println("Total failures: " + totalFailures +
                    " out of " + totalUnitsMade + " units made");
            System.out.println("***************************");
            
        } // close while
        
        // calculate summary statistics
        double productionRatio = (double)totalFailures / 
                (double)totalUnitsMade;
        // print out summary statistics
        System.out.println("***PRODUCTION SUMMARY***");
        System.out.println("Tested " + totalUnitsMade + " Units.");
        System.out.println("Failure Ratio: " + productionRatio);
        
    } // close main
} // close class
