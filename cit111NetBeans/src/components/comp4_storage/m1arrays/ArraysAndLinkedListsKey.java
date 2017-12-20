
package fundamentals;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class compares the functionality of linked lists versus arrays
 * @author edarsow
 */
public class ArraysAndLinkedListsKey {
    
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
        // create a new array of String objects 
        String[] dangSports = new String[5];
        dangSports[0] = "base jumping";
        dangSports[1] = "solo mountaineering";
        dangSports[2] = "skiing down a galciated volcano";
        dangSports[3] = "canyoneering in August (hot!)";
        dangSports[4] = "mountain biking in Argentia";
        
        // send this array to be printed
        printArray(dangSports);
        
        // look up a value in the array with a call to getUserChoice
        System.out.println("You chose: " + 
                dangSports[getUserChoice(dangSports.length) - 1]);
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
        for(int i = 0; i < inputArray.length; i = i + 1){
            System.out.println(inputArray[i]);
        } // close for
        System.out.println("**********************************");
    } // close method
    
    /**
     * Creates a new LinkedList, fills it, and then passes it off
     * to utility methods
     */
    public static void doLinkedLists(){
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("base jumping");
        linkedList.add("solo mountaineering");
        linkedList.add("skiing down a galciated volcano");
        linkedList.add("canyoneering in August (hot!)");
        linkedList.add("mountain biking in Argentia");
        
        // first send the list to be printed
        printLinkedList(linkedList);
        // now send the list to have an item removed
        removeItemsFromList(linkedList);
        // remove another item
        removeItemsFromList(linkedList);
        
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
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } // close method
        System.out.println("**********************************");
    }
    
    /**
     * Utility method for removing an item from the list
     * @param list 
     */
    public static void removeItemsFromList(LinkedList list){
        System.out.println("Item removal:");
        // the complicated line calls remove with an integer
        // that is retrieved with the getUserChoice method
        System.out.println("Removed: " + 
                list.remove(getUserChoice(list.size())));
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
