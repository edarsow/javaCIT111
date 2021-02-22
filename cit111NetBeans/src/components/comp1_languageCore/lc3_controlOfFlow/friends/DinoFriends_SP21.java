/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.comp1_languageCore.lc3_controlOfFlow.friends;

import java.util.Scanner;

/**
 * Program asks user a series of questions about their interests
 * and computes an overall friend compatibility score based on 
 * their responses
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class DinoFriends_SP21 {
    public static void main(String[] notUsed){
        // Create our storge containers (variables0
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 45;
        int userResponse = 0;
        Scanner inputScanner;
        boolean passedThreshold = false; // not used in v.0
        
        // Fixed point allotments by question
        final int Q1_YES_POINTS = 30;
        final int Q1_NO_POINTS = -50;
        
        // Create scanner
        inputScanner = new Scanner(System.in);
        
        System.out.println("Hello, I'm Owen Grady: Let's see if we might be friends.");
        System.out.println("Please answer the followingn questions truthfully!");
        
        // ********************************************
        // QUESTION 1
        // ********************************************
        
        
        System.out.println("Q1: Do you enjoy riding a motorcycle through ");
        System.out.println("a jungle with a pack of raptors?");
        System.out.println("Enter 1 for yes, any other number for no.");
        
        // use scanner to read input into userResponse
        userResponse = inputScanner.nextInt();
        
        if(userResponse == 1){
            // This block will contain nested logic only run if user 
            // is a motorcycle dare devil
            
            // add 30 to compat score
            compatScore = compatScore + Q1_YES_POINTS;
            System.out.println("Excellent, me too! Let's go find those Raptors.");
            System.out.println("You earned " + Q1_YES_POINTS + " points.");

            // ********************************************
            // QUESTION 2: Bike type
            // ********************************************
            System.out.println("Q2: Choose your bike type: Type the number and press enter:");
            System.out.println("1. Honda");
            System.out.println("2. Yamaha");
            System.out.println("3. Kawasaki");
            System.out.println("4. Ducati");
            System.out.println("5. Harley");
            System.out.println("6. Other");
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                // Honda
                compatScore = compatScore + 70;
            } else if (userResponse == 2){
                // Yamaha
                compatScore = compatScore + 60;
            } else if (userResponse == 3){
                // Kawasaki
                compatScore = compatScore + 50;
            } else if (userResponse == 4){
                // Ducati
                compatScore = compatScore + 40;
            } else if (userResponse == 5){
                // Harley
                compatScore = compatScore + 30;
            } else {
                compatScore = compatScore + 10;
            } // end chained ifs for q2 motocycle type
            
        } else { // this block runs if user entered not 1 (desn't want to bike in jungle
            compatScore = compatScore + Q1_NO_POINTS;
            System.out.println("Oh, shame, you're too risk averse for me!");
            System.out.println("Your compat score was reduced: " + Q1_NO_POINTS);
        } // close q1 if/else
        
        // this logic will run regardless of previous question's answers
        System.out.println("You accumulated " + compatScore + " points.");
        System.out.println("Checking friend compatability...");
        
        if(compatScore >= COMPAT_THRESHOLD){
            passedThreshold = true;
            System.out.println("Excellent, let's find ourselves a jungle!");
        } else {
            System.out.println("We have low friend compatibility, sorry.");
        } // close if/else for overall compat checking
        
        System.out.println("Thanks for using the Own Grady compatibility robot!");
        
        
    } // close main
    
    
} // close class DinoFriends
