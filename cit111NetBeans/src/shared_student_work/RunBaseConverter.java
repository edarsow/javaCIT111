package essentials;

import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class RunBaseConverter {
    
    static int modeChoice;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        
        
        System.out.println("***WELCOME TO THE BASE CONVERTER!***");
        do{
            System.out.println("**********");
            System.out.println("CALC MODE: 1 \nQUIZ MODE: 2");
            System.out.println("**********");
            System.out.print("Please select a mode by entering the corresponding "
                + "number: ");
        
            modeChoice = getModeChoice(scan);//sets modeChoice
            
            System.out.println("**********");//extensive cosmetic endeavors
        
            if (modeChoice == 1){
                //if calc mode is selected
                int startBase;
                int endBase; //variables that will be filled by 
                            //method calls from a BaseConverter object
                String startValue;
                System.out.println("CALC MODE");
                do{
                    
                    BaseConverter bc = new BaseConverter();
                    //object oriented programing ladies and gents!
                    //instantiating the class to create an object of that type
        
                    startBase = bc.getStartBase();
                    //now I can simply invoke the object's methods to do what
                    //I want
                    startValue = bc.getStartValue();
                    endBase = bc.getEndBase();
                    System.out.println("The result is " + 
                        bc.convertToBase(startBase, endBase, startValue));
                        //print the result
                }while (goAgain() && modeChoice != 0); //go again?
            }
            else{
                //if quiz mode is selected
                System.out.println("QUIZ MODE");
                do{
                    //same idea as the above function.
                    //Instantiate the class, create the object, and invoke
                    //its methods.
                    BaseConversionPractice bcq = new BaseConversionPractice();
                    bcq.getDifficulty();
                    bcq.getQuizParameters();
                    bcq.getQuizStartValue();
                    bcq.getCorrectAnswer();
                    bcq.askQuestion();
                    bcq.displayResults();
                }while (goAgain() && modeChoice != 0);       
            
            } 
        }while(modeChoice == 0);
        
        System.out.println("Thank you for using the Base Converter!");
        System.exit(0); //THE END!
    }
    
    public static boolean goAgain(){
        //this method uses something called recursion, which is pretty confusing
        //if it's the first time you've seen it. In short a recursive method is 
        //a method that calls itself. This can work to multiple effects. In
        //this context, I'm using recursion to save myself the trouble of making 
        //another boolean class to control the major pieces of the program,
        //since the whole program is a nested do while loop, 2 do whiles, 1 for 
        //each program function, nested in a big do while loop to control 
        //the whole program running again. See if the logic flow makes sense 
        //here.
        
        //very important to remember that the first time this loop executes,
        //we're evaluating the condition for one of the function do while's
        //not the main program do while
        String response;
        Scanner scan = new Scanner (System.in);
        
        switch (modeChoice){
            //remember the mode selection variable from aboce? You could only 
            //enter 1 or 2. So the only way it could ever be 0 is if something 
            //happens to change it...
            case 0:{
                //if you've already opted out of the function you were in
                //and may want to exit the whole program
                System.out.print("Return to menu? (y/n): ");
                break;
            }
            case 1:{
                //if you were in calc mode
                System.out.print("Convert another number? (y/n): " );
                break;
            }
            case 2:{
                //or quiz mode
                System.out.print("Try another question? (y/n): ");
                break;
            }
            default:
                break;
        }
   
        while (true){
            //while true - remember the only way out is a break or a return 
            //statement.
            response = scan.next();
        
            if (response.equalsIgnoreCase("y")){
                return true;
            }
            else if (response.equalsIgnoreCase("n")){
                if (modeChoice == 0){
                    modeChoice++;//increments modeChoice to falsify the 
                                //condition for the program's big do while.
                    return false;//and returns false to get out of the 
                                //current program function
                    //using one boolean method, we've handled 2 nested
                    //conditions. The power of recursion. 
                }
                else{
                    modeChoice = 0;
                    return goAgain();
                    //so...the goAgain() boolean method is going to return...
                    //itself? Sounds like an infinite loop scenario. But wait,
                    //when we enter the method again, something won't be quite 
                    //the same...
                }
            }
            else{
                scan.nextLine();
                System.out.println("Error - please enter 'y' or 'n' only.");  
            }        
        }    
        
    }
    public static int getModeChoice(Scanner sc){
        //tests modeChoice input for validity
        String test;
        
        while(true){
            test = sc.next();
            if (test.equals("1") || test.equals("2"))
                return Integer.parseInt(test);
            else{
                sc.nextLine();
                System.out.print("Error - please enter 1 or 2 only: ");
            }
        }
    }      
}

