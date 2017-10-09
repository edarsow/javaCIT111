package component2structures.ls3_classStructure;

/**
 * Class which demonstrates the structure of a class: member variables
 * and methods. Companion to Module #3 in Java Component Language Structures
 * taught in CIT 111: Introduction to programming Java at the Community College
 * of Allegheny County (Pittsburgh, PA).
 * @author Eric Darsow
 */

public class ConverterBare {
    
    private static int numberConverstionsProcessed = 0;
    
    public static void main(String[] args){
        int ducks = 40;
        // add local variables for yards and bangs
        
        int yaks = convertDucksToYaks(ducks);
        System.out.println(ducks + " ducks equals " + yaks + " yaks");
        System.out.println("Total Conversions: " + numberConverstionsProcessed);
        
        // test the remaining two methods here
        // print out the total conversions made after each call
    } // close main()
    
    public static int convertDucksToYaks(int ducks){
       final int YACKS_PER_DUCK = 3;
        int yaks = ducks * YACKS_PER_DUCK;
        numberConverstionsProcessed++;
        return yaks;
    } // close method
    
    public static double convertYardsToMiles(double yards){
        // code your method here
        return 1.0; // edit this return value!
    } // close method
    
    public static int convertBangsToBucks(int bangs){
       // code your method here
        return 1;  // edit this return value!
    }// close method
} // close Class