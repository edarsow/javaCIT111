package javacourse;

// we need these objects to gather user input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputPractice {
    
    public static void main(String[] args) throws IOException {
        // create a fancy object called a BufferedReader which allows us
	// to gather input from the user at the console. The object is pointed to by reader
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // a basic prompt for user input    
        
        System.out.print("Please enter a string of text: ");
        String userText = reader.readLine();
        
        // Now our user input is inside userText which we can do whatever we want with
        // in this case, just send it to reverseText method and print its result.
        System.out.println("Same characters--different order: " + reverseText(userText));
        
    }
    
    // simple method for taking in a String, reversing it, and returning it to the caller
    public static String reverseText(String text){
        // a StringBuilder is a handy Object for working with text
        StringBuilder builder = new StringBuilder(text);
        // Call reverse() on a builder object, and it reverses itself. Call toString() to get
        // the string back out of the StringBuilder object
        String reversedText = builder.reverse().toString();
        return reversedText;
        
    }
    
}
