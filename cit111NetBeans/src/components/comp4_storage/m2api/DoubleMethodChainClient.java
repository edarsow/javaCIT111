
package components.comp4_storage.m2api;

/**
 * Client class for exploring the method input values
 * which take two doubles and reutrn one value
 * @author delores
 */
public class DoubleMethodChainClient {
    
    static double FIRST_DOUBLE = 18.0;
    static double SECOND_DOUBLE = 22.0;
    
    public static void main(String[] args) {
        // create a new instance of class DoubleMethods
        // and store a pointer in doubleMachine
        DoubleMethods doubleMachine = new DoubleMethods();
        
        double doug = 12.0;
        double doublin = 3.2;
        
        double calPercOut = doubleMachine.calcPercent(doug, doublin);
        System.out.println("calcPercOut's value is: " + calPercOut);
        
        double raisedToLargOut = doubleMachine.raiseToLargestPower(doug, doublin);
        System.out.println("raiseToLargOut's value is: " + raisedToLargOut);
        
        int kwUsed = 92;
        double computedElecOut = doubleMachine.computeElecCosts(kwUsed);
        System.out.println("computedElecOut's value is: " + computedElecOut);
        
        int kwMonth1 = 33;
        int kwMonth2 = 88;
        double billIncOut = doubleMachine.computeBillIncrease(kwMonth1, kwMonth2);
        System.out.println("billIncOut's value is: " + billIncOut);
        
    } // close main
    
} // close class



