package essentials; //make sure this program is placed in your essentials 
                    //source package!
 
import java.util.Scanner; //allows use of Scanner object to receive keyboard
                          //input

/*
The purpose of this class is to perform integer base conversion for numeral 
bases 2-10. Likely for as long as we have been exposed to numbers, the majority 
of us have used only the decimal system - or base 10. In our common base, there
are a total of 10 possible digits (0-9) and each digit place from right to left
represents a value multiplied by an increasing power of 10. For example, given 
the decimal value 621, broken down, we really interpret that value as 1 * 10^0
(1) + 2 * 10^1 (20) + 6 * 10^2 (600). 

Prepare to gain a greater appreciation for just how stupid a computer really is,
and how far we've come in terms of computer language development. We're capable
of understanding numbers in ways that a computer is not, and so in order to 
provide us with the types of mathematical feats we demand of technology, 
computers must perform numeral base conversion.

Computers don't use our decimal numbering system, because they don't understand
numbers past 1. For as intricate and complex as technology has become, at the 
core, computers understand only 2 things: 1, and 0. That's it. Therefore a 
computer must use base 2 in order to interpret numbers, because it has only 2
digits available to it. This base 2 is more commonly known as the binary system,
the fundemental language of all computing systems. When you look at the code 
below, when you're watching your favorite netflix show, or answering a text,
and you take a moment to realize that all of it has been derived from 
1's and 0's, it's really rather incredible. 

Let's shed some light on this whole base thing, because if your education was 
like mine, not once in any math class was the concept of base conversion 
introduced. They teach quadratics and pythagorean theorems but never bother with 
perhaps the paramount idea behind understanding the technology around us.
*/
public class BaseConverter {
    
    /*
    Remember back to the Krusty Krab Training video? If you wanted to be a good
    frycook, you'd better understand P.O.O.P - People Order Our Patties.
    
    Well my friend, if you want to be a good Java programmer, youv'e got to 
    understand P.I.E - Polymorphism Inheritence Encapsulation. Hopefully in here
    I'll be able to point out an example or two of each, to make the terms
    stick. 
    */
    
    
    /*here's perhaps the most common example of encapsulation. Notice these
      instance variables are marked as private. Were you to instantiate (new) 
    this class and use the access operator (.) on an object of this type, 
    you won't be able to get at any of these variables. They're very sensitive.
    I can't have you filling them with invalid input or the whole program's a 
    bust. So if you want to change them, you're gonna have to go through my 
    error catching methods. And those methods are gonna make darn sure that I'm 
    cool with what you're putting in. These variables are protected from you.
    They're ENCAPSULATED. Thats encapsulation.
    */
    
    private String startValue = "";//this needs to be initialized because I'm
                                   //adding things to it the next time I use it 
                                   //in an expression
    
    private int startBase; //an object of this type will know the starting base
    private int endBase;    //and the ending base
    private int errorCounter = 0; //records the number of times you give me bad
                                  // input, and works to print a hint message to
                                  // the screen if it's >= 2
    public int getStartBase(){
       
        Scanner scan = new Scanner(System.in); //create new Scanner object
        
        do{ //in a do-while control structure, the boolean condition is tested
            //AFTER the loop iterates once, not before like a regular while loop
            System.out.print("Please enter the starting base (2-10): ");
            startBase = baseIsValid(scan); //this returns 0 if input is invalid
        } while (startBase == 0); //move on with bad input? Forget about it.
                                  //You're staying right here until I'm happy
                                  //with what you put in.
        
        return startBase; //ok. NOW you can have the startBase value. 
    }
    public String getStartValue(){
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.print("Please enter the starting value in base "
            + startBase + ": ");
        } while (!(valueIsValid(scan))); /*the parentheses in a loop represent 
                                         a condition which must equate to true
                                         or false (boolean). However, there's
                                         nothing saying you have to put a 
                                         direct expression in there. 
                                         valueIsValid returns a boolean, so 
                                         it'll work just fine too. 
                                         Also take note of the ! operator to
                                         the outside left of the condition.
                                         This is the "opposite" operator.
                                         If it wasn't there and you gave 
                                         good input such that valueIsValid 
                                         returned true, the loop condition
                                         would be true and you'd still be in the 
                                         loop. We don't want that. I want the 
                                         loop condition to be the opposite of 
                                         whatever valueIsValid returns.
                                         
                                         */
                                         
        
        int temp = (int)Double.parseDouble(startValue);
        /* Now here's an interesting statement. Let's see what's happening here.
            parseDouble is a public method available to the Double class in Java
            that takes a String parameter and effectively converts the String
            into type double provided that the String contains only digits and
            a decimal. If the String can't be converted, the method throws an
            exception, but I'm not worried about that here because by this point
            I've already checked the startValue to ensure it contains valid 
            input. But hold on, we're not quite done. This program doesn't 
            support non integers (YET), and I may potentially need to take a 
            ".0" off the end of startValue before I can use it in the conversion
            method. See the (int) to the left of the Double up there? That's 
            called a cast. I'm CASTING the double returned by that parseDouble
            method down to an int, where it is stored in the declared int temp.
            
        
        */
        startValue = Integer.toString(temp);
        /*
            Oh, but in case that's not confusing enough, I still need startValue
            to be a String. The above method toString takes an int parameter 
            and converts it to a String. Could I have achieved this a little 
            more simply? Probably. But hey. It works. 
        */
        return startValue; //now we're ready to ship back the startValue
    } 
    public int getEndBase(){
          //this guy does effectively the same thing as getStartBase,
          //except now its asking for input and checking for the endBase
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Please enter the base to convert to (2-10): ");
            endBase = baseIsValid(scan);
        } while (endBase == 0);
        
        return endBase;      
    } 
    public String convertToBase(int sBase, int eBase, String sValue){
        
      //go to the BaseConversionPractice class and read my instructions for 
      //converting between bases. That's exactly what this method does, and,
      //after a lot of tweaking and debugging, she's got a pretty good track 
      //record.
        
      int total = 0;  
      int placeValue;
      String eValue = "";
      boolean ansIsNeg = false;
      
      StringBuilder digits = new StringBuilder();
      //I need to work through the String sValue as if it were an array of
      //characters, because I need to perform an operation for each individual
      //digit. This StringBuilder object allows me to do that.
      digits.append(sValue); //take the contents of sValue and stick it in
                            //my StringBuilder object digits
      if (Integer.parseInt(sValue) < 0){
          ansIsNeg = true;
          digits.deleteCharAt(0);
      }
      
          
      digits.reverse(); //reverse the order of the digits in the StringBuilder
           
      for (int i = 0; i < digits.length(); i++){
          //here we have a for loop. A for loop differs from other loops in that
          //you're assumed to know exactly how many times you want the loop to
          //iterate. There's 3 parts to a for loop, and they're separated by
          //semi colons. The first part is the variable declaration, which the 
          //loop manipulates to control the iterations. The declared variable
          //is local to the for loop, meaning it can't be used elsewhere.
          //The second part is the boolean condition, used to determine how long
          //the loop runs. The declared variable is nearly always used in the 
          //boolean condition. The last piece is the iteration statement, and
          //this part isn't followed by a ;. This statement executes once per
          //iteration of the loop, and is often used to increment or decrement
          //the declared loop variable. Common usage is to name this for loop
          //variable 'i'. 
          //So, with this is mind, in the above loop declaration, I'm saying
          //FOR as long as int i is less than the number of digits in my 
          //StringBuilder, do what's inside this loop, and increase i by 1 each
          //time you do it. 
          
          placeValue = (int)(digits.charAt(i) - '0');
          total += placeValue * (int)Math.pow(sBase, i);
          //these statements grab the current digit being iterated through the 
          //StringBuilder of digits, converts the digit to an int, multiplies 
          //that int by a power of the starting base, and stores that value in
          //the total. 
      }
      
        int decInput = total; //the total value, which at this point is in base
                              //10, is now stored in decInput where it can be 
                              //converted to a non-decimal base. 
       
        digits = new StringBuilder(); //reset the StringBuilder digits.
                                      //this is one of the cool things about 
                                      //Java. I've now set the reference 
                                      //variable digits equal to a new
                                      //StringBuilder. The old StringBuilder no
                                      //longer has a reference variable pointing
                                      //to it. Java's going to trash it. And
                                      //that's just fine, because I don't need 
                                      //it anymore. 
        
        while (true){
            //only two ways to ever get out of a while true loop folks: 
            //a break statement, and a return statement. This isn't one of my 
            //prouder moments in the program as this structure is generally 
            //considered bad practice as it poses the risk of creating an
            //infinite loop. But, if you're QUITE sure that there's a way out of 
            //the loop, it can save you the trouble of having to come up with
            //a proper loop condition.
          
            digits.append((char)('0'+ (decInput % eBase) )); 
            //stick the remainder of decInput divided by the end base into
            //the digits StringBuilder
             
            if (decInput < eBase)
                //notice at this point I haven't yet reassigned decInput the 
                //value of itself divided by the end base. This is important
                //to the way this loop works, and also why I can't have this
                //if condition be the condition for the whole loop. Because once
                //decInput is less than eBase, I STILL NEED THE LOOP TO RUN ONE
                //MORE TIME.
                break;
                        
            decInput /= eBase;
        } 
        
        digits.reverse(); //reverse the order of the digits in the StringBuilder
         
        if (ansIsNeg)
            digits.insert(0, "-");
        
        for (int i = 0; i < digits.length(); i++){
            //another for loop, rather similar to the other one at that. 
            eValue += digits.charAt(i);
            //eValue is the String I'm shipping back from this method. I'm 
            //sticking the contents of the digits StringBuilder in eValue,
            //then returning the eValue.
        }    
         
        return eValue;
    }
    public boolean existsInThisBase(String sVal, int sBase){
        
        //a number in any given base must not contain digits greater than or 
        //equal to the base itself. This for loop runs through all the digits 
        //in a String of digits, and if any of them aren't compatible with the 
        //base, Sorry! Gonna have to give me a starting value that actually
        //exists in the base you're starting from. 
       
        for (int i = 0; i < sVal.length (); i++) {            
            if ((int)(sVal.charAt(i) - '0') >= sBase)
                return false;
        }

        return true; 
    }
     
    private int baseIsValid(Scanner sc){
        //now right off the bat here's something a little odd - a METHOD 
        //declared as private. Why is that? Well, because the only thing that
        //needs to use this method are my methods for setting the start and end
        //bases. You don't! Those methods already have access to this method 
        //because they're in the same class, so we're good!
        
        double test;
        
        if (sc.hasNextDouble()){ //if the input you gave can be interpretted as 
                                 //a double...
            test = sc.nextDouble();//store the input in a double variable
            if (test == Math.floor(test)){ //if its an integer...
                if (test >= 2 && test <= 10)//and within the bounds...
                    return (int)test; //ok now you can store it in the base
                else{ //but if it's out of bounds...
                    System.out.print("Error - specified value is"
                    + " out of bounds.");
                    }
            }
            else{//or if it's not an integer...
                System.out.print("Error - decimal values not "
                + "allowed here.");
                }
        }
        else //or if it isnt even a number...
            System.out.print("Error - non-numeric elements detected.");
        
        
        sc.nextLine();//clear the Scanner
        
        System.out.print("\n");
                
        return 0; //your input stinks! Take 2!             
    }
    private boolean valueIsValid(Scanner sc){
          //another private error catching method like the one above. This guy's
          //here to make sure you don't try converting a "pepperoni pizza slice"
          //in base 3 to base 4. Cause like, I don't know. That doesn't sound
          //like a good outcome.
        double test;
        byte tooLarge = 0;

        if (sc.hasNextDouble()){
            test = sc.nextDouble();
            if (test == Math.floor(test)){   
                startValue = Double.toString((int)test);
                if (startValue.length() >= 9){
                    System.out.println("Error - value too large.");
                    tooLarge++;
                }
                else {
                    if (existsInThisBase(startValue, startBase))
                        //even if the input is an int, better make sure it 
                        //exists in the starting base!
                        return true; 
                    else{
                        System.out.println("Error - the specified value "
                           + "does not " + "exist in base " + startBase + "."); 
                        if (++errorCounter >= 2){
                        //prints a hint if you don't seem to understand the 
                        //concept of requirements for values in a certain base
                        //Cause I'm just helpful like that.
                        System.out.println("**(HINT: Values in base "
                        + startBase + " cannot contain digits greater than or "
                        + "equal to " + startBase + ".)**");
                        }
                    }
                }                          
            }
            else 
                System.out.println("Error - decimal values are unsupported."); 
            //YET. 
        }
        else{
            sc.nextLine();
            if (tooLarge != 1)
                System.out.println("Error - non-numeric elements detected.");
            //Well, maybe once I get this thing to go up to hexadecimal...
            //nah, we'll let it be for now
        }
 
        return false;
    }     
} // end of BaseConverter class
    //that's it for the converter. Go take a look at the quiz mode class
    //and the run program class!