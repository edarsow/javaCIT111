package essentials;

import java.util.Random; //allows use of Random object used to randomize quiz
                        //parameters
import java.util.Scanner;

/**
 RULES FOR BASE CONVERSION:
 * 
 * Converting to base 10 (difficulty  1-3): 
 *      1. From right to left, each digit in the starting value is multiplied by 
 *          the quantity of the starting base raised to an increasing power.
 *          This power starts at 0 and increases by one with each digit place 
 *          going left. 
 *      2. Add these values together for the end value in base 10.
 *      3. Let's get a visual. Take the value 101 in base 2. Starting from the 
 *         far right, we multiply the digit in the current place (1) by the 
 *         quantity of the current base (2) raised to the number of digit places 
 *         we are from the far right (0). 1*2^0 is 1, so we record that. 
 *      4. Moving to the next digit over from the right, once again we multiply
 *         the digit in the current place (0) WAIT. STOP. Save yourself some
 *         time. Anything multiplied by 0 is 0. So add 0 to the previous outcome
 *         of 1.
 *      5. Last digit place is a 1, and we're 2 places away from the far right 
 *         digit. So we're gonna do 1 * the quantity of the base we're in (2)
 *         raised to the number of digit places away from the far right (2), or 
 *         1 * 2^2, which is 4. We finally add 4 to our previous resulting value
 *         total of 1 for our final answer of 5. 101 in base 2 is represented as
 *         5 in our common decimal base.
 * 
 * Converting to a non-decimal base (difficulty 4-5):
 *      1. Perform the exact same process as above to convert the starting value
 *         to base 10.
 *      2. Now it gets interesting. Pay attention. What you've got to do is to 
 *         divide your new value in base 10 by the base you're going to. So for 
 *         instance if you have 621, and you're going to base 8, you divide 621
 *         by 8, and get 77 remainder 5. 
 *      3. This remainder is what we're interested in, so write it down. Now,
 *         with the result of 77 from the previous devision, divide again by 
 *         the end base, which in this case is 8. We get 9 remainder 5. 
 *      4. Now here's what happens - you take the new remainder of the most
 *         recent division, and stick it TO THE LEFT OF your previous remainder.
 *         Don't do any sort of operation with the remainders, you just stick
 *         them next to each other, each one to the LEFT of the previous.
 *      5. One last time, I need to be (no just kidding) we're going to divide 
 *         9 by the end base 8. 1 remainder 1. The 1 goes on the end to the left
 *         of our previous 2 remainders, so that our remainders should now read 
 *         155. 
 *      6. Now here's the cherry on top - now that our quotient (1) is now LESS 
 *         THAN the end base (8), we stick the QUOTIENT ITSELF on the left end 
 *         of our remainder sequence. Now we should have 1155. 
 *         There ladies and gentlemen is how the value we know as 621 is 
 *         expressed in base 8. But don't take my word for it - go see for  
 *         yourself. Run this project, enter 1 for Calculate mode, enter 10 for 
 *         the starting base, 621 for the starting value, and 8 for the end 
 *         base. The result will be 1155. Don't have faith in my program? It's
 *         cool, I didn't either. That's why I continuously tested the outputs
 *         against online base conversion tools while debugging. Go try another
 *         base converter. You'll get the same thing.
 *      7. ONE IMPORTANT SIDENOTE - if
 *         while performing these division operations the quotient becomes 
 *         EQUAL TO the end base, divide one last time to get 1 remainder 0, but 
 *         then stick the QUOTIENT, NOT THE REMAINDER on the left end of your
 *         remainder sequence for your final answer. Only do this if division by
 *         the end base results in 1 remainder 0. Because if you think about it,
 *         thats the only way to represent the value since a 0 at the left most 
 *         end of an integer value really doesn't mean anything. 
 */
public class BaseConversionPractice extends BaseConverter {
    //Remember P.I.E? Well, here's the I - Inheritence. Important part of this
    //declaration is the "extends" keyword. This means that this class INHERITS
    //from the BaseConverter class. Every public method and instance variable 
    //a BaseConverter object can use, a BaseConversionPractice object can use 
    //too!
    
    private String quizStartValue;
    private int quizStartBase;
    private int numDigits;
    private int quizEndBase;
    private int difficulty;
    private String correctAns;
    private String userAnswer;
    //quiz parameters. Some of these changed based on desired difficulty
 
    public void getDifficulty(){
        //gets difficulty choice 1-5 
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Please enter the desired difficulty (1-5): ");
            difficulty = checkDifficulty(scan); //makes sure input is valid
        }while (difficulty == 0);    
    }
    public void getQuizParameters(){
        Random rand = new Random(); //Random class instantiation 
        switch (difficulty){
            //switch statement! concept is pretty straightforward. The () of a
            //switch takes a variable that might hold several different values.
            //each of the cases represent a possible value of the variable.
            //each case must be followed by a break statement to make sure the 
            //other cases don't execute. The default keyword is what executes if
            //none of the cases execute, but in this instance I already know
            //that difficulty will hold good input by the time I'm here.
            case 1: {
                quizStartBase = 2; //parameters change based on difficulty
                quizEndBase = 10;
                numDigits = rand.nextInt(2) + 2;
                break;
            }
            case 2:{
                quizStartBase = rand.nextInt(2) + 2; 
                quizEndBase = 10;
                numDigits = rand.nextInt(3) + 3;   
                break;
            }
            case 3:{
                quizStartBase = rand.nextInt(3) + 2;
                quizEndBase = 10;
                numDigits = rand.nextInt(3) + 3;
                break;
            }
            case 4:{
                quizStartBase = rand.nextInt(4) + 2;
                quizEndBase = rand.nextInt(6) + 4;
                numDigits = rand.nextInt(2) + 4;
                break;
            }
            case 5:{
                quizStartBase = rand.nextInt(8) + 2;
                quizEndBase = rand.nextInt(9) + 1;
                numDigits = rand.nextInt(2) + 5;
                break;
            }
            default:
                break;
        }
        
        if (quizStartBase == quizEndBase){
            //sorry, ain't lettin' ya off easy. If the random number object
            //gives me a value for the end base the same as the start, now that
            //wouldn't be too challenging to answer now would it?
           if (quizStartBase >= 2 && quizStartBase <= 5)
               quizStartBase++;
           else
               quizStartBase--;
        }    
    }    
    public void getQuizStartValue(){
        //gets a starting value for the question. It's a little less involved
        //since the program generates it itself instead of getting it from
        //keyboard input, but there's still certain requirements it has to meet. 
        StringBuilder digits = new StringBuilder();
        //there's that StringBuilder again
        Random rand = new Random();
        
        for (int i = 0; i < numDigits; i++){                  
            digits.append(Integer.toString(rand.nextInt((quizStartBase))));
            //once again the value in any base can't contain any digits >= 
            //the starting base.
        }
        quizStartValue = digits.toString();//converts the StringBuilder to a 
        //regular String and stores the value in quizStartValue
        
        if (quizStartValue.startsWith("0")){
            quizStartValue = quizStartValue.substring(1);
            quizStartValue = "10" + quizStartValue;
            //as mentioned in the above conversion rules, a 0 to the far left 
            //of an integer value doesn't give any value or mean anything, so
            //if the random object puts one there, I'm replacing it with a "10"
            //instead
        }   
    }
    public void getCorrectAnswer(){
        //here's why this class needs to inherit from the BaseConverter - it 
        //uses the same conversion method the BaseConverter does! By inheriting
        //from BaseConverter, this class also has access to this method!
        correctAns = convertToBase(quizStartBase, quizEndBase, quizStartValue);
        //That's not a method in this class, but we can still use it!
        //Inheritence, man
    } 
    public void askQuestion(){
        //ok, we've got all the values in place, now it prints the question
        Scanner scan = new Scanner (System.in);
        System.out.print("What is the value " + quizStartValue + " in base " +
                quizStartBase + " represented as in base " + quizEndBase + 
                "? ");
        userAnswer = getUserAnswer(scan);
    }
    public void displayResults(){
        if (checkAnswer()) //returns true if your answer equals the correct ans
            System.out.println("Correct! Well done!");
        else
            System.out.println("Sorry, incorrect. Remember to refer to your"
                    + " conversion rules!");
                    //they're right up top of this class. Don't be afraid to 
                    //take a look!
    }
    public boolean checkAnswer(){
        
        return (userAnswer.equals(correctAns));  
        //note that return statements don't have to be direct expressions.
        //Since I'm returning a boolean here, and .equals returns a boolean,
        //I can simply return that method from the original method.

    }
    
    private String getUserAnswer(Scanner sc){
        //very similar to valueIsValid from the BaseConverter class, but 
        //slightly different. Different in that I don't need to stress over 
        //making sure the input is valid. Here, just about anything you type in
        //will do fine because the checkAnswer method will simply return false
        //if your input isn't equal to the correct answer.
        double test;
      
        if (sc.hasNextDouble()){
            test = sc.nextDouble();
            if (test == Math.floor(test)){
                return Integer.toString((int)test);
            }
            else{
                return sc.next();
            }
        }
        else
            return sc.next();
      
    }   
    private int checkDifficulty(Scanner sc){
        //checks for valid difficulty input
        double test;
        
        if (sc.hasNextDouble()){ 
            test = sc.nextDouble();
            if (test == Math.floor(test)){
                if (test >= 1 && test <= 5)
                    return (int)test; 
                else{
                    System.out.print("Error - specified value is"
                    + " out of bounds.");
                    }
            }
            else{
                System.out.print("Error - decimal values not "
                + "allowed here.");
                }
        }
        else
            System.out.print("Error - non-numeric elements detected.");
        
        
        sc.nextLine();
        
        System.out.print("\n");
                
        return 0;              
    }
}//end of quiz class

