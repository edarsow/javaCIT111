package essentials;

/**
 * A class for practicing the fundamentals of the Java language.
 * Mini-tasks are spread throughout the code, so start at the top
 * and work to the bottom!
 * @author Eric Darsow
 */
public class JavaParts {
    
    final static int MULTIPLIER = 3;
    
    public static void main(String[] args){
        // declare three int-type variables
        int macUsers, pcUsers, linuxUsers;
        // assign values to these variables using the constant multiplier
        macUsers = 10;
        pcUsers = macUsers * MULTIPLIER;
        linuxUsers = pcUsers * MULTIPLIER;
        // display their output to the console with the println() method
        System.out.println("We've got " + macUsers + " Mac Users");
        System.out.println("Therefore, we've also got " + pcUsers + " PC Users");
        System.out.println("Ands should have " + linuxUsers + " Linux Users!");
    } // close method
} // close class
