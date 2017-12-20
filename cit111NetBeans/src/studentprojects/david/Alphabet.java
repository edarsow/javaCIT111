
package studentprojects.david;

/**
 * Models the behavior of an alphabet of characters
 * 
 * @author David & Xan
 */
public class Alphabet {
    
    private int[] alphabet;
    
    /**
     * When creating a new Alphabet Object,
     * Pass in an integer array which becomes the original 
     * alphabet sequence stored in this object.
     * 
     * @param alf the original sequence to get stored
     */
    public Alphabet(int[] alf){
        alphabet=alf;
    }
    
    /**
     * Get this object's internal alphabet back as an integer array
     * @return 
     */
    public int[] getAlphabet(){
        return alphabet;
  
    }
    
    /**
     * A utility method for determining the length of the internal
     * alphabet held by this object
     * 
     * @return the internal alphabet's length
     */
    public int getAlphabetLength(){
        // TODO: Write my guts
        return 0;
    }
  
    /**
     * Append a given integer array to this class's internal
     * alphabet. This method creates an entirely new array
     * that can fit both the internal alphabet and the chunk
     * to be added. Both smaller alphabets are copied into
     * this new array and then the internal array is overwritten
     * 
     * @param chunkToAdd the integer sequence to add to the internal alphabet
     */
    public void addChunk(int[] chunkToAdd){
        
        // determine how long my internal alphabet is
        int lengthOfInternalAlphabet = alphabet.length;
        
        // determine the size of the chunk I'm supposed to add
        // to my internal alphabet
        int lengthOfChunkToAdd = chunkToAdd.length;
        
        // create a new array that will fit both smaller arrays
        int[] extendedAlphabet = 
                new int[lengthOfInternalAlphabet + lengthOfChunkToAdd];
        
        // now copy over my original alphabet into the first segment
        // of the new alphabet
        for(int i = 0; i < lengthOfInternalAlphabet; i = i + 1){
            // place them next to one another and move each value over
            extendedAlphabet[i] = alphabet[i];
        } // close for
        
        // fill in the rest of our new array with the chunkToAdd
        // start i at the length of internal alphabet
        int i = lengthOfInternalAlphabet;       
        int z = 0; // this is for indexing the chunkToAdd
        for(; i < extendedAlphabet.length; i = i + 1){
            extendedAlphabet[i] = chunkToAdd[z];
            z = z + 1;
        } // close for
        
        // now that we have a nice new extended alphabet, 
        // replace the shorter alphabet with it
        alphabet = extendedAlphabet;
      
    }  // close method
    
    
    /**
     * This method returns this object's internal alphabet transformed
     * into a char array which represents the underlying sequence with
     * letters a-z.
     * 
     * @return the Object's internal alphabet as a char[]
     */
    public char[] getAlphabetAsCharArr(){
       char[] charVersion = null;
       // TODO: Write my guts
       return charVersion;
    }
    
    /**
     * Returns the internal alphabet reflected over its median.
     * The internal structure of the alphabet in this object remains
     * unchanged.
     * 
     * @return the reflected version of Alphabet
     */
    public int[] reflectAlphabet(){
        //TODO: Write my guts!
        int[] x = {1,2};
        
        return x;
    }
    
    
    
    
    /**
     * TODO: Write this java doc comment for removeDuplicates
     *  BUT DO THIS later since this is tricky
     * @return 
     */
    public int[] removeDuplicates(){
        // TODO: Write my guts!
        return alphabet;
    }
    
    
    
    
} // close class
