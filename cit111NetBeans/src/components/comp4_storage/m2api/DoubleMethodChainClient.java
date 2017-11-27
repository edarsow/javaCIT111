
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
        // call methods from class Doublemethods
        double returnedFromCall1 = 
                doubleMachine.divideDoubles(FIRST_DOUBLE, SECOND_DOUBLE);
        double returnedFromCall2 = 
                doubleMachine.raiseDoubles(FIRST_DOUBLE, returnedFromCall1);
        double returnedFromCall3 = 
                doubleMachine.maxOfTwoDoubles(returnedFromCall1, returnedFromCall2);
        
        System.out.print("The output of call 3: ");
        System.out.println(returnedFromCall3);
        
    } // close main
} // close class
