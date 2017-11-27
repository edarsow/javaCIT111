
package components.comp4_storage.m2api;

/**
 * Client class for demonstrating simple method calls
 * with one input parameter and int return types. Chaining is possible
 * given their input and output types
 * @author delores
 */
public class IntegerMethodChainClient {
    
        final static int STARTING_INT = 5;
    
    public static void main(String[] args) {
        // create a new isntance of IntegerMethods
        // and store a pointer in integerConverter
        IntegerMethods integerConverter = new IntegerMethods();
        
        // call all methods on IntegerMethods and manipulate the returned
        // values by passing them to other methods
        int returnedValFromCall1 = 
                integerConverter.transformWithAddition(STARTING_INT);
        int returnedValFromCall2 = 
                integerConverter.transformWithMultiplication(returnedValFromCall1);
        int returnedValFromCall3 = 
                integerConverter.transformWithSubtraction(returnedValFromCall2);
        System.out.print("The output of call 3 is: ");
        // output result of method chains:
        System.out.println(returnedValFromCall3);
        
    } // close main
    
} // close class
