
package component2structures;

/**
 * Code to illustrate core concepts related to calling methods with parameters
 * to accomplish a sort-of-useful task. This code is a companion to the Language
 * Structures Module 1 (LS1) in the http://technologyrediscovery.net CIT111: 
 * inrtroduction to programming course taught at the Community College of Allegheny
 * County in Pittsburgh, PA
 * @author Eric Darsow
 */
public class TwoNames {
    /**
     * Controller method for this class's sample methods
     * @param args not used
     */
    public static void main(String[] args){
        System.out.println("Calling a method to create a greeting:");
        greet("Helen", "Esther");
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Calling a method to recount a random interaction:");
        generateRandomInteraction("Lois", "Larz");
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Calling a method to capitalize and squish names together:");
        convertAndSquish("Gretchen", "Gordon");
    } // close main
    
    /**
     * Simulates a random interaction between two people passed in as parameters
     * @param doer The doer of the interaction
     * @param receiver The receiver of the interaction
     */
    public static void generateRandomInteraction(String doer, String receiver){
        System.out.println(doer + " just gave " + receiver + " a very cute yak!");
    } // close method
    
    /**
     * Simulates a greeting between two people passed in as parameters
     * @param greeter The person doing the greeting
     * @param greetee The person being greeted
     */
    public static void greet(String greeter, String greetee){
        System.out.println("Why hello " + greetee + ", folks call me " + greeter +"!");
    } // close method
    
    /**
     * Converts two name parameters to all upper-case characters and 
     * combines them into one silly looking name
     * @param name1 The first name to be combined
     * @param name2 The second name to be combined
     */
    public static void convertAndSquish(String name1, String name2){
        String name1Caps = name1.toUpperCase();
        String name2Caps = name2.toUpperCase();
        String combinedName = name1Caps + name2Caps;
        
        System.out.println(combinedName);
        
    } // close method
} // close class
