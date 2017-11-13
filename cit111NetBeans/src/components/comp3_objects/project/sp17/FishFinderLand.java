
package components.comp3_objects.project.sp17;

/**
 * Created for CIT 111 - Intro to programming Java in Spring 2017
 * @author sarah.mikesell
 */

import java.util.Random;

class FishFinder{
    private boolean running;
    private String location;
    private double waterDepth;
    private double determineWaterTemperature;
    private int numberOfFish;
   
    public void startFinder(){
        running = true;
        
}// close startFinder method 
    
    public void stopFinder(){
        running = false;
        
    } // close stop finder method
    
    public int locationOne(){
       numberOfFish = 4;
       
       return numberOfFish;
        
    } // close location one method
    
    public int locationTwo(int numTwo){
        numTwo = numberOfFish + 3;
        
        return numTwo;
    } // close location two method
    
    public int locationThree(int numThree){
        numThree = numberOfFish + 7;
        
        return numThree;
    }
    
    
    public String depthOfWater(double water){
            String depthLocation = "No depth found";
        
        if(water <= 10.5){
            depthLocation = "Lake Shore";
        } else if (water > 10.5){ 
            depthLocation = "Middle of Lake";
        }else if (water >= 40.5){
            depthLocation = "Lake Dam";
        
        
        }
        return depthLocation;
    } // close method depth of water
    
    public double waterTemperature(double currentTemp){
        Random ran = new Random();
         int x = ran.nextInt(80)+40;
         currentTemp = x ;
       
         return currentTemp;
    }
} // close FishFinderLand

public class FishFinderLand {
 
    public static void main(String[] args){
       FishFinder finder = new FishFinder();
       
       // call to turn on finder
       finder.startFinder(); 
       System.out.println("The fish finder is now on!");
       
       // first fishing spot 
       System.out.println("Our first fishing spot is the Lake Shore!");
       
        // search for 6 seconds https://www.quora.com/How-do-I-get-a-Java-program-to-wait-before-running-the-next-line-of-code-in-a-simple-hello-world-type-program     
       try {
            System.out.println("Searching for fish.....><>.....");
              Thread.sleep(6000);
            }
       catch (InterruptedException e) {
            }
       
        // call to location one
       System.out.println("There are " + finder.locationOne()+ " fish near the Shore!");
       
       System.out.println(" ");
       
       // location 2
       System.out.println("Our second fishing spot is the middle of the lake!");
      
       // search for 8 seconds
       try {
        System.out.println("Searching for fish.......><>......");
            Thread.sleep(8000);
            }
       catch (InterruptedException e){
           
            }
       
       // call to location two
       System.out.println("There are " + finder.locationTwo(0)+ " fish in the center of the lake!");
       
       //space
        System.out.println(" ");
       
       // location number three
       System.out.println("Our third fishing spot is at the Dam!");
       
       // search for 10 seconds
       try{
           System.out.println("Searching for fish........><>......");
            Thread.sleep(10000);
       }
       catch (InterruptedException e){
       }
       
       // location call three
       System.out.println("Wow, there are " + finder.locationThree(0)+ " fish at the dam!");
       
        //space
        System.out.println(" ");
       
        //depth of water
        System.out.println("Where is the lake 30 ft deep?");
        
        // search for 5 seconds
        try {
        System.out.println("Searching for the depth......");
            Thread.sleep(5000);
            }
       catch (InterruptedException e){
           
            }
        // find depth of water at certain location
        System.out.println(finder.depthOfWater(30));
        
        // space
        System.out.println(" ");
        
        
       
       //temp
       System.out.println("What is the current water temperature?");
       
       //search for 8 seconds
       try { 
        System.out.println("Searching for the temperature......");
            Thread.sleep(8000);
            }
       catch (InterruptedException e){
           
            }
       
       // find water temperature
       System.out.println(finder.waterTemperature(0));
        
       // call to turn off finder
       finder.stopFinder();
       System.out.println("The fish finder is now off!");
       
    } // close class FishFinderLand
} // close class fish finder



