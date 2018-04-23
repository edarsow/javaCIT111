package objects2_animals;

import components.comp3_objects.oop1_javadonuts.*;
import objects1_donuts.Donut;
import objects1_donuts.Donut;


public class DonutLandAndAnimals {
    
        static final int FURRY_ANIMAL_BITE_SIZE = 10;
        static final int WATERY_ANIMAL_BITE_SIZE = 15;
   
    public static void main(String[] args){
        // create a new Donut (an instance of the Donut Class)
        Donut firstDonut = new Donut();
        // store the name "Chloe" in Donut firstDonut's name member variable
        firstDonut.name = "Chloe";
        
        
        
        
        // print a test of Chloe's member variable values
        System.out.println("Before sending " + firstDonut.name + " to get eaten, " 
                + "the percent remaining is " + firstDonut.getPercRemaining());
        
        
        
//        


//        // provide the bite size to the user as a courtesy
//        System.out.println("Furry Animals Bite Size: " + FURRY_ANIMAL_BITE_SIZE);
//        
//        // send firstDonut to get eaten by a furry animal
//        furryAnimalEatsSomeDonut(firstDonut);
//        
//        // print another output of Chloe's member variables
//        System.out.println("Perc remaining after " + firstDonut.name 
//                + " is nibbled on by a furry animal: " 
//                + firstDonut.getPercRemaining());   
//        // divider for the reader
//        
//    System.out.println("-------SENDING FIRSTDONUT TO GET EATEN-----------------");
//    System.out.println("------------BY A WATERY ANIMAL-------------------------");
//        
//        // Provide the bite size for the user's reference
//        System.out.println("Watery Animals Bite Size: " + WATERY_ANIMAL_BITE_SIZE);
//        
//        // send the firstDonut to the static method in this class
//        // which will call the Donut's simulateEating() method
//        wateryAnimalEatsSomeDonut(firstDonut);
//        
//        // verify that Chloe was eaten a second time
//        System.out.println("Perc remaining after " + firstDonut.name 
//                + " is nibbled on by a watery animal: " 
//                + firstDonut.getPercRemaining());
    
    } // close main
    
    
    
    
    
    
    
    
    
    
    
    // models a furry animal eating donut
    public static void furryAnimalEatsSomeDonut(Donut donutToEat){
        System.out.println("....mmmm..for us furry animals, donuts "
                + "are the cornerstone of any nutrituous breakfast");
        // send the bite size to the passed in Donut's simulateEating()
        // method for processing
        donutToEat.simulateEating(FURRY_ANIMAL_BITE_SIZE);
        
    } // close method
    
    
    
    public static void wateryAnimalEatsSomeDonut(Donut donutToEat){
        System.out.println("....mmmm..for us watery animals, donuts "
                + "are the much sweeter than fish");
        donutToEat.simulateEating(WATERY_ANIMAL_BITE_SIZE);
        
    } // close method
    
    
    
    
    
} // close class





//
//
 