package components.comp2_languageStructures.ls3_classStructure;

import java.util.Scanner;

/**
 * Class which demonstrates the structure of a class: member variables
 * and methods. Companion to Module #3 in Java Component Language Structures
 * taught in CIT 111: Introduction to programming Java at the Community College
 * of Allegheny County (Pittsburgh, PA).
 * @author Eric Darsow
 */
public class ConverterWithSwitch {
    
    private static int numberConverstionsProcessed = 0;
    
    public static void main(String[] args){
       
        System.out.println("Select the converter you want to run:");
        System.out.println("1) Convert Ducks to Yaks");
        System.out.println("2) Convert yards to miles");
        System.out.println("3) Convert bangs to bucks");
        
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        
        System.out.println("Now enter a value to be converted:");
        double valueToConvert = scan.nextDouble();
        
        // this switch mathes the int userChoice with the case numbers: 1,2, and 3
        switch(userChoice){
            case 1: System.out.println(convertDucksToYaks(valueToConvert) + " yaks");
                    break;
                    
            case 2: System.out.println(convertYardsToMiles(valueToConvert) + " miles");
                    break;
             
            case 3: System.out.println(convertBangsToBucks(valueToConvert) + " bucks");
                    break;
        } // close switch
        
        System.out.println("Total Conversions: " + numberConverstionsProcessed);
        
    } // close main()
    
    
    
    /**
     * Converts a given number of ducks into yaks using a built-in conversion 
     * constant of three yacks per duck
     * @param ducks the number of ducks to convert to yaks
     * @return the converted number of yaks
     */
    public static double convertDucksToYaks(double ducks){
        final int YACKS_PER_DUCK = 3;
        double yaks = ducks * YACKS_PER_DUCK;
        numberConverstionsProcessed++;
        return yaks;
    } // close method
    
    public static double convertYardsToMiles(double yards){
        final double YARDS_PER_MILE = 1760.0;
        double miles = yards / YARDS_PER_MILE;
        numberConverstionsProcessed++;
        return miles;
    } // close method
    
    public static double convertBangsToBucks(double bangs){
        final int BUCKS_PER_BANG = 10000;
        double bucks = bangs * BUCKS_PER_BANG;
        numberConverstionsProcessed++;
        return bucks;   
    }// close method
} // close Class