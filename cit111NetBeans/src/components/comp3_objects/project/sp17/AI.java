package components.comp3_objects.project.sp17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Scarlett{
    public void knownInformation(String name) throws IOException{
        
        System.out.println("Hello," + name + " my name is Scarlett how may I assist you.");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean c = true;
        while (c){ 
            String answer = reader.readLine();
            if (answer.equals("when is the bulls game")) {
            System.out.println("the bulls will play at today 7:00pm");
            } else if (answer.equals("what is today's date")) {
            System.out.println("Today is March 8th 2017");
            } else if (answer.equals("im home")) {
            System.out.println("Welcome Home Shadan!!!");
             } else if (answer.equals("who is your creator")) {
            System.out.println("I was created by Shadan");
              } else if (answer.equals("turn on lights")) {
            System.out.println("lights turned on ");
            } else if (answer.equals("turn off lights")) {
            System.out.println("lights turned off");
                System.out.println("Invaild Input");
            }
        }
    }    
}// end of Scarlett

////////////////////////////////////////////////////////////////////////////////////////////

public class AI {
    public static void main (String[] args) throws IOException  { 
        Scarlett scarlett = new Scarlett();
        scarlett.knownInformation("Eric");
    }// end main
}// end of objectProject   