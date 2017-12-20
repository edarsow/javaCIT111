
package components.comp4_storage.m2api;

/**
 * Utility class with three methods, each taking
 * two doubles as an input value and returning a double 
 * vale. Paired with the class DoubleMethodChainClient
 * @author delores
 */
public class DoubleMethods {
    
    final double PRICE_PER_KWH = 17.2;
    final double GRID_CONNECTION_FEE = 3.45;
    
    public double calcPercent(double a, double b){
        return ( a / b ) * 100;
    }
    
    public double raiseToRoundPower(double a, double b){
        // look up the java.lang.Math class floor() method in the API
        double roundedDownDouble = java.lang.Math.floor(b);

        // look up java.lang.Math and its pow() method
        // in the Java API!
        return java.lang.Math.pow(a, roundedDownDouble);
    } // close method
    
    public double raiseToLargestPower(double e, double b){

        double largestDouble =  Math.max(e, b);
        if(e == largestDouble){
            return java.lang.Math.pow(b, e);
        } else {
            return java.lang.Math.pow(e, b);
        } // close if/else
    } // close method
    
    public double computeElecCosts(int kilowatthours){
        double usageCosts = kilowatthours * PRICE_PER_KWH;
        double totalCost = usageCosts + GRID_CONNECTION_FEE;
        return totalCost;
    } // close method
    
    public double computeBillIncrease(int kwhMonth1, int kwhMonth2){
        double totalCost1 = computeElecCosts(kwhMonth1);
        double totalCost2 = computeElecCosts(kwhMonth2);
        
        return calcPercent(totalCost1, totalCost2);
        
    } // close method
    
} // close class


