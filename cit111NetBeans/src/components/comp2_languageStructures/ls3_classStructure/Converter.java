package components.comp2_languageStructures.ls3_classStructure;

import java.util.Scanner;

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
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("***ALMOST-LIKE-MAGIC UNIT CONVERTER***");
        System.out.println("Enter the number of ducks to convert to yaks:");
        
        int ducks = s.nextInt();
        
        int yaks = convertDucksToYaks(ducks);
        System.out.println(ducks + " ducks equals " + yaks + " yaks");
        System.out.println("***************************************");
        
        System.out.println("Enter the number of yards to covnert to miles:");
        double yards = s.nextDouble();

        double miles = convertYardsToMiles(yards);
        System.out.println(yards + " yards equals " + miles + " miles");
        System.out.println("***************************************");
        
        System.out.println("Enter the number of bangs to convert\n"
                + "to bucks (whole nums only:");
        
        int bangs = s.nextInt();
        int bucks = convertBangsToBucks(bangs);
        System.out.println(bangs + " bangs equals " + bucks + " bucks");
        System.out.println("*********CONVERT AGAIN SOON!***********");
        
        
    } // close main()
    
    public static int convertDucksToYaks(int ducks){
        final int YACKS_PER_DUCK = 3;
        int yaks = ducks * YACKS_PER_DUCK;
        numberConverstionsProcessed++;
        return yaks;
    } // close method
    
    
    
    public static double convertYardsToMiles(double yards){
        final double YARDS_PER_MILE = 1760.0;
        double miles = yards / YARDS_PER_MILE;
        return miles;
    } // close method
    
    
    public static int convertBangsToBucks(int bangs){
        final int BUCKS_PER_BANG = 17;
        int bucks = bangs * BUCKS_PER_BANG; 
       numberConverstionsProcessed++;
        return bucks;   
    }// close method
} // close Class