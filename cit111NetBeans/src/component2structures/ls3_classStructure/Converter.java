package component2structures.ls3_classStructure;

/**
 * Class which demonstrates the structure of a class: member variables
 * and methods. Companion to Module #3 in Java Component Language Structures
 * taught in CIT 111: Introduction to programming Java at the Community College
 * of Allegheny County (Pittsburgh, PA).
 * @author Eric Darsow
 */
public class Converter {
    
    private static int numberConverstionsProcessed = 0;
    
    public static void main(String[] args){
        int ducks = 40;
        double yards = 2900;
        int bangs = 2; 
        
        int yaks = convertDucksToYaks(ducks);
        System.out.println(ducks + " ducks euals " + yaks + " yaks");
        System.out.println("Total Conversions: " + numberConverstionsProcessed);
        
        double miles = convertYardsToMiles(yards);
        System.out.println(yards + " yards euals " + miles + " miles");
        System.out.println("Total Conversions: " + numberConverstionsProcessed);
        
        int bucks = convertBangsToBucks(bangs);
        System.out.println(bangs + " bangs equals " + bucks + " bucks");
        System.out.println("Total Conversions: " + numberConverstionsProcessed);
    } // close main()
    
    public static int convertDucksToYaks(int ducks){
        final int YACKS_PER_DUCK = 3;
        int yaks = ducks * YACKS_PER_DUCK;
        numberConverstionsProcessed++;
        return yaks;
    } // close method
    
    public static double convertYardsToMiles(double yards){
        final double YARDS_PER_MILE = 1760.0;
        double miles = yards * YARDS_PER_MILE;
        numberConverstionsProcessed++;
        return miles;
    } // close method
    
    public static int convertBangsToBucks(int bangs){
        final int BUCKS_PER_BANG = 10000;
        int bucks = bangs * BUCKS_PER_BANG;
        numberConverstionsProcessed++;
        return bucks;   
    }// close method
} // close Class