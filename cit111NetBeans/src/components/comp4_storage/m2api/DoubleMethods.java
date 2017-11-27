
package components.comp4_storage.m2api;

/**
 * Utility class with three methods, each taking
 * two doubles as an input value and returning a double 
 * vale. Paired with the class DoubleMethodChainClient
 * @author delores
 */
public class DoubleMethods {
    
    public double divideDoubles(double a, double b){
        return a/b;
    }
    
    public double raiseDoubles(double a, double b){
        double d =  Math.pow(a, b);
        return d;
    }
    
    public double maxOfTwoDoubles(double a, double b){
        return Math.max(a, b);
    }
} // close class
