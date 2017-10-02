package essentials;

import java.util.Scanner;

public class PlayGround {
    
    public static void main(String[] args){
        final int RETIREMENT_AGE = 66;
        final int MAX_TESTS = 3;
        
        int numLoops = 0;
        
        while(numLoops <= MAX_TESTS){
        Scanner scan = new Scanner(System.in);
        int userAge = scan.nextInt();
                
        // now that we have an age, instruct the computer
        // to compare the age with the retirement threshold
        while(numLoops <= MAX_TESTS){
            if(numLoops <= RETIREMENT_AGE){
                System.out.println("Go ahead, retire!");
            } else {
                System.out.println("Sorry, keep on workin");
            } // close if/else blocks
        } // while()
        
        // Before ending the while block, add 1 to 
        
            
       
        
    } // close main
       
} // close class





