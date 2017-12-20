
package components.comp4_storage.m2api;

/**
 * Sample class to illustrate inputs and outputs of methods
 * @author delores
 */
public class IntegerMethods {
    
    /**
     * Adds an arbitrary (meaningless) value to an inputted value
     * @param valToAdd the value to which the amount is to be added
     * @return the transformed integer value
     */
    public int add(int valToAdd){
        int tempStorage = valToAdd + 10;
        return tempStorage;
    }
    
    /**
     * Multiplies an arbitrary value to an inputted value
     * @param valToMult the value to multiply
     * @return the transformed integer value
     */
    public int multiply(int valToMult){
        int tempStorage = valToMult * 3;
        return tempStorage;
    }
    
    /**
     * Subtracts an arbitrary value from an inputted value
     * @param valToSubtractFrom the int from which to subtract
     * @return the transformed integer value
     */
    public int subtract(int valToSubtractFrom){
        int tempStorage = valToSubtractFrom - 12;
        return tempStorage;
    }
    
} // close class





