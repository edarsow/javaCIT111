
package donutland;

public class DonutLand {
   
    public static void main(String[] args){
        // create a new Donut (an instance of the Donut Class)
        
        // store the name "Chloe" in Donut firstDonut's name member variable
        
        // print a test of Chloe's member variable values
        
    } // close main()
} // close class








         // create a new Donut (an instance of the Donut Class)
        Donut firstDonut = new Donut();
        // store the name "Chloe" in Donut firstDonut's name member variable
        firstDonut.name = "Chloe";
        
        // print a test of Chloe's member variable values
        System.out.println("Before sending " + firstDonut.name + " to get eaten, " 
                + "the percent remaining is " + firstDonut.getPercRemaining());