package modules.languageCore;

import java.util.Random;

/**
 * Simulates a process control mechanism
 * that judges the quality of a product against
 * an established quality standard. A while-controlled block
 * is used to model the repeated assessment of a stream
 * of units with randomized quality values;
 * @author Eric Darsow
 */
public class QualityControl {
    final static int QUALITY_TRESHOLD = 65;
    final static int MAX_QUALITY = 100;
    final static int UNITS_TO_MAKE = 10000;
    
    static int unitQuality = 0;
    static int totalFailures = 0;
    static int totalUnitsMade = 0;
    
    public static void main(String[] args){
        // make a random number generator
        Random randomGenerator = new Random();
        while(totalUnitsMade < UNITS_TO_MAKE){
            // generate a random number between 0 and 100
            unitQuality = randomGenerator.nextInt(MAX_QUALITY + 1);
            System.out.println("Unit Quality: " + unitQuality);
            // increment our total unit counter
            totalUnitsMade = totalUnitsMade + 1;

            if(unitQuality < QUALITY_TRESHOLD){
                System.out.println("Unit below quality standards!");
                totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");
            } // close if/else

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
