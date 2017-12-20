
package playground;

import java.util.Scanner;

/**
 *
 * @author delores
 */
public class Playground {

    
    public static void main(String[] args) {
        boolean flag = true;
         
        do{
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nWhere would you like to go?\n");
            System.out.println("1. Bar\n2. Bakery\n3. Inn\n4. Blacksmith\n" 
                   + "5. Bank\n6. Farm\n"
                   + "Enter a number to pick a building to enter: ");
        int choice = in.nextInt();
        //String input = in.nextLine();
        //add a loop 
        exploreBuilding enter = new exploreBuilding();
        
        switch (choice) {
            case 1 :
                System.out.println("You are in the bar talking to Varic"
                + " the bartender\n");
                  //put in class
                enter.exploreBar();
                //System.out.println("You enter the bar");
                //System.out.println("You see the bartender, ");
                //Varic is the bartender
                //Bar options?: order drink, ask for info, exit
                //System.out.println("What do you do?\n1. Order drink.\n2. "
                //    + "Ask for information.\n3. Exit\n>");
                
                
                //call a method goToBuilding that will manage a process
                // public static void exploreBuilding (int buildingChoice)
                // method that contains questions specific to building
                
                break;
            
            
            //BAKERY:
            //while()
            case 2 :
                enter.exploreBakery();
                
                /*System.out.println("You enter the bakery.");
                System.out.println("You see  the baker Solma"); //+ bakery.owner +
                //Solma is the baker, also was attacked by banshee
                //options: buy bread(hp system later?), ask for info, exit
                System.out.println("What do you do?\n1.Buy bread\n2."
                        + " Ask for info"
                        + "\n3.Exit\n>");
                */
                
                
            
            
            
            case 3 :
                enter.exploreInn();
                /*System.out.println("You enter the Inn.");
                System.out.println("You see the innkeep Nicole"); //+ inn.owner
                //Nicole is the innkeep, saw wizard last month
                //options: ask for info, exit
                System.out.println("What do you do?\n"
                        + "1. Ask for info\n2. Exit\n>");
                */
                
            
            
            
            case 4 :
                enter.exploreBlacksmith();
                /*System.out.println("You enter the Blacksmith's.");
                System.out.println("You see the blacksmith "); // + blacksmith.owner
                //Belgrax is blacksmith
                //options: buy armor, weapons, ask for info, exit
                System.out.println("What do you do?\n"
                        + "1. Buy armor\n2. Buy weapons\n>"
                        + "3. Ask for info\n4. Exit");
                */
                
                
            
            
            
            case 5 :
                enter.exploreBank();
                /*System.out.println("You enter the bank.");
                System.out.println("You see the banker ");// + bank.owner
                //Grinwald is the banker 
                //options: withdraw gold, exit
                System.out.println("What do you?\n1. Withdraw gold\n2. Exit\n>");
                */
                
            
            
            case 6 :
                enter.exploreFarm();
                /*System.out.println("You enter the farm");
                System.out.println("You see the farmer ");// + farm.owner
                //Zhok The Broad is the first to be attacked
                System.out.println("What do you do?\n1.Ask for info\n2. Exit\n>");
                */
        }       
            
            
        }while(flag);
    }
}













class exploreBuilding {

    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    //private boolean flag = true;
    
    public void exploreBar() {
        //System.out.println("You enter the bar, and approach Varic"
        //        + " the bartender\n");
        System.out.println("\tWhat do you do?\n1. Order drink.\n2. "
                    + "Ask for information.\n3. Exit\n>");
        
        input = in.nextLine();
                
                
                if(input.equals("1")) {
                    System.out.println("Varic pours you some wine. "
                            + "Wine can restore 10 HP.\n");
                }
                else if (input.equals("2")) {
                    System.out.println("Varic tells you ........");
                }
                else if (input.equals("3")) {
                    System.out.println("You exit the bar.");
                    //flag = false;
                    
                }
                else{
                    System.out.println("Invalid input, try again");
                }
    }
    
    public void exploreBakery() {
        System.out.println("You enter the bakery.");
        System.out.println("You appoach the baker Solma");
        
        System.out.println("What do you do?\n1.Buy bread\n2."
                        + " Ask for info"
                        + "\n3.Exit\n>");
        
        input = in.nextLine();
                
                if(input.equals("1")) {
                    System.out.println("Solma gives you a loaf of bread");
                    //add bread to inventory
                }
                else if(input.equals("2")) {
                    System.out.println("Solma tells you about her bakery recently "
                            + "getting attacked.\nShe shows you a wispy piece of"
                            + " cloth, the only thing the attacker left behind");
                }
                else if(input.equals("3")){
                    System.out.println("You exit the bakery");
                    }
                else{
                    System.out.println("Invalid input!");
                    }
    }
    
    public void exploreInn() {
        System.out.println("You enter the Inn.");
                System.out.println("You see the innkeep Nicole"); //+ inn.owner
                //Nicole is the innkeep, saw wizard last month
                //options: ask for info, exit
                System.out.println("What do you do?\n"
                        + "1. Ask for info\n2. Exit\n>");
                
        input = in.nextLine();
                    
                if(input.equals("1")) {
                    System.out.println("Nicole mentions that last month an ill tempered"
                    + " wizard had stayed in her inn before heading North.");
                    }
                else if(input.equals("2")) {
                    System.out.println("You exit the inn");
                    }
                else{
                    System.out.println("Invalid input!");
                    }
    }
    
    public void exploreBlacksmith() {
        System.out.println("You enter the Blacksmith's.");
                System.out.println("You see the blacksmith "); // + blacksmith.owner
                //Belgrax is blacksmith
                //options: buy armor, weapons, ask for info, exit
                System.out.println("What do you do?\n"
                        + "1. Buy armor\n2. Buy weapons\n>"
                        + "3. Ask for info\n4. Exit");
                
        input = in.nextLine();
                
                if(input.equals("1")) {
                    //armor
                    
                }
                else if(input.equals("2")) {
                    //weapon
                    
                }
                else if(input.equals("3")) {
                    System.out.println("some sort of info");
                   
                }
                else if(input.equals("4")) {
                    System.out.println("You exit the blacksmith");
                    
                }
    }
    
    public void exploreBank() {
        System.out.println("You enter the bank.");
        System.out.println("You see the banker ");// + bank.owner
        //Grinwald is the banker 
        //options: withdraw gold, exit
        System.out.println("What do you?\n1. Withdraw gold\n2. Exit\n>");
        
        input = in.nextLine();
        
            if(input.equals("1")) {
                System.out.println("You withdraw 30 gold");
                
            }
            else if(input.equals("2")) {
                System.out.println("You exit the bank");
            }
                
    }
    
    public void exploreFarm() {
        System.out.println("You enter the farm");
        System.out.println("You see the farmer ");// + farm.owner
        //Zhok The Broad is the first to be attacked
        System.out.println("What do you do?\n1.Ask for info\n2. Exit\n>");
        
        
        input = in.nextLine();
                
                if(input.equals("1")) {
                    System.out.println("INFO");
                }
                else if(input.equals("2")) {
                    System.out.println("You leave the farm");
                }
    }
}

    
