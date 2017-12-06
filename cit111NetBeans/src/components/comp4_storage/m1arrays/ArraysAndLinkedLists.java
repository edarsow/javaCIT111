
package fundamentals;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class compares the functionality of linked lists versus arrays
 * @author edarsow
 */
public class ArraysAndLinkedLists {
    
    /**
     * Fires up our two chains of methods: for arrays first 
     * and then linked list
     * @param args 
     */
    public static void main(String[] args) {
        doArrays();
        doLinkedLists();
    } // close main()
    
    /**
     * Creates an array and then passes that array to utility methods
     */
    public static void doArrays(){
        // TASK A: Create an array of the rank ordered items
       
        
        // TASK B: Send the array you just made to printArray
        //printArray( -->Your array reference here<--);
        
        
        // TASK C: Make a call to getUserChoice and use this to
        // display the item the user requested. Don't forget to
        // pass in the max amount the user can choose with the
        // length property on arrays
        
    } // close method
    
    /**
     * Utility method for gathering an integer from the user
     * This facility is used for both arrays and linked lists
     * @param max the maximum index of items in the list
     * @return the integer the user chose
     */
    public static int getUserChoice(int max){
        System.out.println("*******************************");
        System.out.println("Pick a level of dangerous sport");
        Scanner scan = new Scanner(System.in);
        System.out.println("(Max is " + max + ")") ;
        int choice = scan.nextInt();
        return choice;
    } // close method
    
    /**
     * Loops through an array and prints its contents
     * @param inputArray the array to print
     */
    public static void printArray(String[] inputArray){
        System.out.println("**********************************");
        System.out.println("Printing array contents....");
        System.out.println("**********************************");
       
        // TASK D: Use a for() loop to print out your array
        
        
        System.out.println("**********************************");
    } // close method
    
    /**
     * Creates a new LinkedList, fills it, and then passes it off
     * to utility methods
     */
    public static void doLinkedLists(){
        
        // TASK E: Create your linked list of String objects
        
        // TASK F: Fill your linked list with calls to add()
        
        // first send the list to be printed
        
        //printLinkedList(linkedList);  <--Uncomment when ready
        
        // now send the list to have an item removed
        // removeItemsFromList(linkedList); <--Uncomment when ready
        // remove another item
        // removeItemsFromList(linkedList);<--Uncomment when ready
        
    } // close doLinkedList()
    
    /**
     * Utility method for printing a linked list
     * @param list the list to print
     */
    public static void printLinkedList(LinkedList list){

        System.out.println("**********************************");
        System.out.println("Printing linked list contents....");
        System.out.println("**********************************");
        // we need this ListIterator object for looping over the 
        // entire list with simple calls to next()
       
        // TASK G: Get a ListIterator object from the
        // linked list and use it in a while() loop to print
        // out the contents of your linkedList
        
        System.out.println("**********************************");
    }
    
    /**
     * Utility method for removing an item from the list
     * @param list 
     */
    public static void removeItemsFromList(LinkedList list){
        System.out.println("Item removal:");
      
        // TASK H: Remove an item from the list with remove(int i)
        // using the getUserChoice method
        
        // print out the list with the selected value removed 
        printLinkedList(list);
    } 
    
    // Task 1: Create a method called printFirstAndLastArrayItems that
    // takes in an array of Strings and prints out the first and last item in that list
    
    // --> YOUR COD HERE <--
    
    // Task 2: Create a method called printFirstAndLastListItems that takes in
    // a linked list and prints out the first and last item
    
    // --> YOUR COD HERE <--
    
    // Task 3: Create a linked list of objects you made!
    // Instead of LinkedList<String> create a LinkedList<Plane> that
    // stores planes, or any other object you've created

} // close class
