package components.comp2_languageStructures.ls3_classStructure;

/**
 * Class which demonstrates the structure of a class: member variables
 * and methods. Companion to Module #3 in Java Component Language Structures
 * taught in CIT 111: Introduction to programming Java at the Community College
 * of Allegheny County (Pittsburgh, PA).
 * @author Eric Darsow
 */

public class ConverterBare {
    
    public static void main(String[] args){
        
        // declare a varaible and initialize it to the value you want to convert
        int ducks = 40;
        // call the converstion method on the right of = and store 
        // the return value in the new variable yaks
        int yaks = convertDucksToYaks(ducks);
        // now print the original and converted value to the console
        System.out.println(ducks + " ducks equals " + yaks + " yaks");
         
        // TASK 1: Copy and paste in 2 more methods from our class repository
        // Insert them underneath convertDucksToYaks()
        
        // TASK 2: Test the remaining two methods here the same way as ducksToYaks
        
        // [your code here]
        
        // TASK 3: IMPORTANT: Add a member variable called 
        // totalConversionsProcessed to this class. (Above main(), after class {
        
        // TASK 4: Inside each of your inserted methods, increment this new
        // class member variable with the statement totalConversionsProcessed++
        
        // TASK 5: Write statements that print out the total conversions made by 
        // any method after EACH call, so we can see it go up after each method
        // has done its work
        
        // [your code here]
        
    } // close main()
    
    public static int convertDucksToYaks(int ducks){
       final int YACKS_PER_DUCK = 3;
        int yaks = ducks * YACKS_PER_DUCK;
        return yaks;
    } // close method
    
    // Additional methods go here, stacked under convertDucksToYaks
    
    
} // close Class