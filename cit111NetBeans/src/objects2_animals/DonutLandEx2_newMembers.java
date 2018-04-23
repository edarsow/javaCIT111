package objects2_animals;

import components.comp3_objects.oop1_javadonuts.*;
import objects1_donuts.Donut;
import objects1_donuts.Donut;

/**
 * 
 * @author delores
 */
public class DonutLandEx2_newMembers {
    
        static final int FURRY_ANIMAL_BITE_SIZE = 10;
        static final int WATERY_ANIMAL_BITE_SIZE = 15;
   
    public static void main(String[] args){
        Donut firstDonut = new Donut();
       firstDonut.name = "Chloe";
        
        System.out.println("Before sending " + firstDonut.name + " to get eaten, " 
                + "the percent remaining is " + firstDonut.getPercRemaining());
        
        System.out.println("Furry Animals Bite Size: " + FURRY_ANIMAL_BITE_SIZE);
        
        furryAnimalEatsSomeDonut(firstDonut);
        
        System.out.println("Perc remaining after " + firstDonut.name 
                + " is nibbled on by a furry animal: " 
                + firstDonut.getPercRemaining());
       
        System.out.println("------------------------------------------------");
        
        System.out.println("Before sending " + firstDonut.name + " to get eaten, " 
                + "the percent remaining is " + firstDonut.getPercRemaining());
        
        System.out.println("Watery Animals Bite Size: " + WATERY_ANIMAL_BITE_SIZE);
        
        wateryAnimalEatsSomeDonut(firstDonut);
        
        System.out.println("Perc remaining after " + firstDonut.name 
                + " is nibbled on by a watery animal: " 
                + firstDonut.getPercRemaining());
                
    }
    
    public static Donut furryAnimalEatsSomeDonut(Donut donutToEat){
        System.out.println("....mmmm..for us furry animals, donuts "
                + "are the cornerstone of any nutrituous breakfast");
        donutToEat.simulateEating(FURRY_ANIMAL_BITE_SIZE);
        return donutToEat;
    }
    
    public static Donut wateryAnimalEatsSomeDonut(Donut donutToEat){
        System.out.println("....mmmm..for us watery animals, donuts "
                + "are the much sweeter than fish");
        donutToEat.simulateEating(WATERY_ANIMAL_BITE_SIZE);
        return donutToEat;
        
    }
    
}
