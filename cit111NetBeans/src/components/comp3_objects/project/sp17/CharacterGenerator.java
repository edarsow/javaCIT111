/*
 This program will allow you to create a character of your own design:
 */
package components.comp3_objects.project.sp17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @author Derek */
 class CharGenerator {  
    double str = 1; double dex = 1; double con = 1;  
    double acu = 1; double wis = 1;  double cha = 1; 
    public String item1 = "Nothing";public String item2 = "Nothing";
    public String item3 = "Nothing";public String item4 = "Nothing";
    public String item5 = "Nothing";public String item6 = "Nothing";
    
    int hungry; int thirst; int energy;
    double weapon = 1;
    public int numericChoice;
    public int setAtt;
    public int chosenOne;
    String userName;
    String className;
    public boolean dysentery; boolean genderDisphoria;
    boolean cholera; boolean choices;   
////////////////////////////////////////////////////////////////////////////////    
    public double setProfile()throws IOException{          
                  
       try {
        BufferedReader lineReader = new BufferedReader
        (new InputStreamReader(System.in));  
        numericChoice = Integer.parseInt(lineReader.readLine());
        } catch (IOException e) {
        System.out.println("THIS ISN'T A NUMBER: " + e.getMessage());   
        } catch (NumberFormatException e) {
        System.out.println("THIS ISN'T A NUMBER: " + e.getMessage());     
        }

        
        if(numericChoice <= 6 && numericChoice >= 1){   
           } else {
           System.out.println("You serious fam? try following the rules."
                   + " SMH >:(");
           }         
                
        return numericChoice;
    }        
///////////////////////////////////////////////////////////////////////////////        
    public double setAtt()throws IOException{   
        
        System.out.println("how much do you want to raise this stat by?");
        System.out.println("-------------------------------------------");
        BufferedReader lineReader = new BufferedReader       
        (new InputStreamReader(System.in));  
        
        setAtt = Integer.parseInt(lineReader.readLine());            
        
        return setAtt;
    }
///////////////////////////////////////////////////////////////////////////////    
    public String setClass()throws IOException{
        System.out.println("Make a class name for your character");
        BufferedReader classReader = 
                new BufferedReader(new InputStreamReader(System.in));
        String madeClass = classReader.readLine();
        return madeClass;
    }
////////////////////////////////////////////////////////////////////////////////
    public String setName()throws IOException{
        System.out.println("Make a name for your character:");           
        BufferedReader nameReader = 
                new BufferedReader(new InputStreamReader(System.in));
        String madeName = nameReader.readLine();
        return madeName;
    }
////////////////////////////////////////////////////////////////////////////////
    public void totalRecall(){
    str = 1; dex = 1; con = 1; acu = 1; wis = 1; cha = 1;  
    }
////////////////////////////////////////////////////////////////////////////////
    public void headerPiece(){
    System.out.println("=====++--;CHAR-GEN ONE;--++===");
    System.out.println("=========++=============================================");
    System.out.println("========/  \\\\===========================================");
    System.out.println("=======/    \\\\==========================================");
    System.out.println("===== /____ _\\\\=========================================");
    System.out.println("=====/\\===== /\\\\========================================");
    System.out.println("====/  \\==  /  \\\\=======================================");
    System.out.println("===/____\\_ /____\\\\======================================"); 
    System.out.println("========================================================");
    }
//////////////////This shows what your attributes do////////////////////////////
    public void attributions(){
    System.out.println("ATTACK:------ "
            + str * weapon + " (STRength x Weapon Value: the damage you do.)");
    System.out.println("DODGE CHANCE: "
            + dex + "% (DEXterity: your chance to... dodge.)");
    System.out.println("HEALTH:------ " + con*4 
            + " (CONstituion x 4: Your pool of health)");
    System.out.println("FORTITUDE:--- " + con 
            + "% (CONstituion: resistance to ill-effects)");
    System.out.println("IQ:---------- " + (acu*10+50) 
            + " (INTelligence x 10 + 50: Intelligence Quotient)");
    System.out.println("AWARENESS:--- " + wis*5 
            + "% (WISdom x 5: chance to be aware)");
    System.out.println("HOTNESS:----- " + cha 
            + " (CHArisma: Your rank on the hotness scale)");
    }
///////////////////////////CHAR INVENTORY///////////////////////////////////////
    public String[] inventoryinit(){
           String[] invArray;   
           invArray = new String[7];
       invArray[6] = item6;invArray[1] = item1;invArray[2] = item2;
       invArray[3] = item3;invArray[4] = item4;invArray[5] = item5;
  System.out.println("1." + invArray[1]);System.out.println("2." + invArray[2]);
  System.out.println("3." + invArray[3]);System.out.println("4." + invArray[4]);
  System.out.println("5." + invArray[5]);System.out.println("6." + invArray[6]);
        return  invArray;
    }
//////////////////////==FEELINGS==//////////////////////////////////////////////
public void hunger(int hungry){  
            if(hungry >= 25 && hungry < 50){
            System.out.println("You're a might peckish.");   
            } 
            if(hungry >= 50 && hungry < 75){
            System.out.println("You're hungry.");
            }     
            if(hungry >= 75 && hungry < 100){
            System.out.println("YOU ARE HANGRY!!!");
           
            }
            if(hungry >= 100){
            System.out.println("You starved");
            } 
            if (hungry < 25){
            System.out.println("Your hunger is sated.");    
            }
    }
public String thirst(int thirst){
    String thirstString = "";
    
            if(thirst >= 25 && thirst < 50){
            thirstString = "Your throat is dry.";
            }
            if(thirst >= 50 && thirst < 75){
            thirstString = "You're thirsty.";
            }
            if(thirst >= 75 && thirst < 100){
            thirstString = "Bruh, you thirsty.";
            }
            if(thirst >= 100){
            System.out.println("You are a dessicated husk");
            } 
    System.out.println(thirstString);
    return thirstString;
}
public String fatigue(int energy){
    String fatigueString = "";
            if(energy >= 75 && energy < 100){
            fatigueString = "You're a little sluggish.";
            }
            if(energy >= 50 && energy < 75){
            fatigueString = "You could use a nap.";
            }
            if(energy >= 75 && energy < 100){
            fatigueString = "You are SUUUPER sleepy.";
            }
            if(energy >= 100){
            System.out.println("You are woke AF.");
            } 
    System.out.println(fatigueString);
    return fatigueString;
}
///////////////////////ROOM LOGS////////////////////////////////////////////////
public int currentRoom(int x, int y)throws IOException{
String roomDesc; 
chosenOne = 0;
    switch (x){
           case 1: x = 1; y = 1;
           roomDesc = "It's a stone room. There's a wooden table that's"
                   + "got some stuff on it.";
           System.out.println(roomDesc);
           System.out.println("What will you eat from the table?");
           System.out.println("1. A jar of Yoohoo-esque fluid");
           System.out.println("2. A canteen of water labled \"clean\" with "
                   + "quotes.");
        
           System.out.println("3. A fistful of blue and pink pills.");
           System.out.println("4. back away");
           setProfile();
           if(numericChoice == 1){
           System.out.println("Like a child, you test the thing on the table "
                   + "by placing it in your mouth."); 
           System.out.println("It has a nice chocolatey taste that reminds you "
                   + "of the nineties.");
           System.out.println("");
           System.out.println("But yea, you definitely have dysentery.");
           
           chosenOne = 1;
           }
           if(numericChoice == 2){
           System.out.println("It says clean so you drink it.");
           cholera = false;
           System.out.println("So there's no need to see how you're feeling"); 
           chosenOne = 2;
           }
           if(numericChoice == 3){
           System.out.println("You don't feel any different.");
           genderDisphoria = false;
           chosenOne = 3;
           }
           else{
           System.out.println("You back away from the table of things.");    
           }         
           }   
    return numericChoice;
}


}//End of Class: CharGenerator   
    ////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////
//////////////////////////--Public and Main--///////////////////////////////////       ////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////
//////////////////////////--Public and Main--///////////////////////////////////   
       
    public class CharacterGenerator{         
        public static void main(String[] args) throws IOException {
           CharGenerator dudeOne = new CharGenerator(); 
          
            
           
            dudeOne.headerPiece();
            int x = 1; int y = 1;
            dudeOne.hungry = 50;dudeOne.energy = 100;dudeOne.thirst = 50;
            dudeOne.dysentery = false;
            dudeOne.cholera = false;
            dudeOne.genderDisphoria = true;
          
           int pointPool = 25;
           for(int f = 25; f > 0;){        
           System.out.println("1. STRength: --- " + dudeOne.str + "           /===||===\\        =");
           System.out.println("2. DEXterity: -- " + dudeOne.dex + "          /====||====\\       =");
           System.out.println("3. CONstitution: " + dudeOne.con + "         /=====||=====\\      =");
           System.out.println("4. INTelligence: " + dudeOne.acu + "        /======||======\\     =");
           System.out.println("5. WISdom: ----- " + dudeOne.wis + "       /=======||=======\\    =");
           System.out.println("6. CHArisma: --- " + dudeOne.cha + "      /===== ==||== =====\\   =");
           
           System.out.println("You have " + pointPool + " attribute points.");
           System.out.println("Select a number corresponding to what you want "
                                 + "to improve.");
           System.out.println("----------------------------------------------");
////////////////////choose the attribute you will modulate////////////////////////
           dudeOne.setProfile();
           System.out.println("----------------------------------------------");           
           switch (dudeOne.numericChoice) {
            case 1:  dudeOne.numericChoice = 1;
            dudeOne.str = dudeOne.str + dudeOne.setAtt(); 
                     break;
            case 2:  dudeOne.numericChoice = 2;
            dudeOne.dex = dudeOne.dex + dudeOne.setAtt(); 
                     break;
            case 3:  dudeOne.numericChoice = 3;
            dudeOne.con = dudeOne.con + dudeOne.setAtt();
                     break;
            case 4:  dudeOne.numericChoice = 4;
            dudeOne.acu = dudeOne.acu + dudeOne.setAtt(); 
                     break;
            case 5:  dudeOne.numericChoice = 5;
            dudeOne.wis = dudeOne.wis + dudeOne.setAtt();
                     break;
            case 6:  dudeOne.numericChoice = 6;
            dudeOne.cha = dudeOne.cha + dudeOne.setAtt();  
                     break;
            }
////////////////////////////////////////////////////////////////////////////////           
           f = f - dudeOne.setAtt;
           pointPool = f; 
////Resets the pool if you go over the attribute limit like a stupid dumbhead///                      
                if(f < 0){
                    System.out.println("You f****** nerd, you had one job. what"
                    + " did you think would happen if you went over the limit?"
                            + " \n I'm reseting everything now...");
                       
                    f = 25; pointPool = 25;
                    dudeOne.totalRecall();
                }
////////////////////////////////////////////////////////////////////////////////                
           }           
        System.out.println("----------------------------------------------");   
        System.out.println("Your final stats are:____________________________________________ ");
           System.out.println("1. STRength: --- " + dudeOne.str + "       /===||===\\");
           System.out.println("2. DEXterity: -- " + dudeOne.dex + "      /====||====\\");
           System.out.println("3. CONstitution: " + dudeOne.con + "     /=====||=====\\");
           System.out.println("4. INTelligence: " + dudeOne.acu + "    /======||======\\");
           System.out.println("5. WISdom: ----- " + dudeOne.wis + "   /=======||=======\\");
           System.out.println("6. CHArisma: --- " + dudeOne.cha + "  /===== ==||== =====\\");
          
        System.out.println("");
        dudeOne.userName = dudeOne.setName();
        dudeOne.className = dudeOne.setClass();        
        System.out.println("Congratulations hero! I now dub thee:");
        System.out.println(dudeOne.userName.toUpperCase() 
                + " THE " + dudeOne.className.toUpperCase());
///////////////////////////=Begin the Journey=//////////////////////////////////
        int choice = 1;
        while(choice == 1){      
         System.out.println("It's time to choose what to do next."
        + "\n The numbers correspond to your choices.");
        System.out.println("(1)-What are my abilities?");
        System.out.println("(2)-What do I own?");
        System.out.println("(3)-What do I see?");
        System.out.println("(4)-How do I feel?");
        System.out.println("(5)Nothing");
        System.out.println("(6)-Exit.");
        
            dudeOne.setProfile();           
           switch (dudeOne.numericChoice) {
            case 1:  dudeOne.numericChoice = 1;
            dudeOne.attributions();
                     break;
            case 2:  dudeOne.numericChoice = 2;
            System.out.println("=========================================");
            dudeOne.inventoryinit();
            System.out.println(); 
                     break;
            case 3:  dudeOne.numericChoice = 3;
            int choiciestchoice = dudeOne.currentRoom(x, y);
            if (choiciestchoice == 1){
                dudeOne.dysentery = true;
                dudeOne.hungry = dudeOne.hungry + 25;
                dudeOne.thirst = dudeOne.thirst + 25;
            }if (choiciestchoice == 2){
                dudeOne.cholera = true;
                dudeOne.hungry = dudeOne.hungry + 25;
                dudeOne.thirst = dudeOne.thirst + 25;
            }if (choiciestchoice == 3){
                dudeOne.genderDisphoria =false;
            }
                    break;       
            case 4:  dudeOne.numericChoice = 4;
            dudeOne.hunger(dudeOne.hungry);
            dudeOne.thirst(dudeOne.thirst);
            dudeOne.fatigue(dudeOne.energy);
            System.out.println("Your hunger meter is: " + dudeOne.hungry + "%");
            System.out.println("Your thirst meter is: " + dudeOne.thirst + "%");
            System.out.println("Your energy meter is: " + dudeOne.energy + "%");
            System.out.println("Gender:" + dudeOne.genderDisphoria);
            System.out.println("Dysentery: " + dudeOne.dysentery);
            System.out.println("Cholera: " + dudeOne.cholera);
                     break;
            case 5:  dudeOne.numericChoice = 5;
            System.out.println("        /....................\\");
            System.out.println("       /......................\\");
            System.out.println("      /........................\\");
            System.out.println("     /..........................\\");
            System.out.println("    /............................\\");
            System.out.println("   /..............................\\");
            System.out.println("  /................................\\");
            System.out.println(" /..................................\\");
            System.out.println("/....................................\\");
            System.out.println("Look at all this nothing you just found.");
            
            
                     break;
            case 6:  dudeOne.numericChoice = 6;
            System.out.println("One of those matrix telephone booths shows up "
                    + "and Neo saves you");
              choice = 0;
                     break;
            }
        System.out.println("==================================================");   
        }
         
        }//endof main

  
    }//endof Public class
