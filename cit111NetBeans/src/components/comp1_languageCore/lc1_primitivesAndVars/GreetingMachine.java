
package components.comp1_languageCore.lc1_primitivesAndVars;

import java.util.Scanner;

public class GreetingMachine {
    
    public static void main(String[] args) {
       System.out.println("Please enter your name");
       Scanner scan = new Scanner(System.in);
       String name = scan.next();
       System.out.println("Whoa, " + name + " What an interesting name card you have!");
    } // Close main()
} // close class GreetingMachine