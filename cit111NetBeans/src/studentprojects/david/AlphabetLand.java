
package studentprojects.david;

/**
 * Tests the behavior of the Alphabet class
 * @author David & Xan
 */
public class AlphabetLand {
    
    /**
     * Creates an instance of Alphabet and tests its functionality
     * by calling methods on that object
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        //TODO: Write careful comments above EACH line of code in this
        // method
        
        int[] testAlp = {1,2,3,4};
        
        int[] lilChunk = {5,6,7,8};
        
        System.out.println("Original Alphabet:");
        for(int r = 0; r<testAlp.length; r = r + 1){
            System.out.println(testAlp[r]);
        } // close for
        
        Alphabet alphabet = new Alphabet(testAlp);
        
        alphabet.addChunk(lilChunk);
        
        int[] transformedAlphabet = alphabet.getAlphabet();
        
        System.out.println("Extended Alphabet:");
        for(int r = 0; r<transformedAlphabet.length; r = r + 1){
            System.out.println(transformedAlphabet[r]);
        } // close for
        
        
        doMoreWithAlphabets();
        
    } // close main
    
    /**
     * TODO: Write my java doc comments
     */
    public static void doMoreWithAlphabets(){
        
        //TODO: make a few more Alphabet objects and play with them!
        
    }
    
    
} // close class
