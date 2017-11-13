
package components.comp3_objects.project.sp17;

import java.util.Scanner;


public class BlueToothRadio {

    boolean radioStatus; // radio on or off
    boolean auxPlay; //allows user to connect phone to radio to aux
    boolean blueTooth; //alows user to connect to bluetooth
    double volumeControl; //prohibits user form going over 13
    String radioPresets; //radio presets
    String volume; //allows user to set specific volume 
    
    
    String radioFunctions(int numInt){ //allows user to get a preset station and return a call
		String stations = radioPresets;
		
		if(numInt == 1){
			stations = "Now playing 93.7 the fan ";
		} else if(numInt == 2) {
			stations = "Now playing 94.5 3ws ";
		} else if(numInt == 3) {
			stations = "Now playing 96.1 kiss fm ";
		} else if(numInt == 4) {
			stations = "Now playing 100.1 early morning ";
                } else if(numInt == 5){
                        stations = "Now playing 100.7 star ";
		} 		
		return stations;
       }
     String setVolume(int numInt){ //allows user to choose from 1-13 for a set volume
		String work = volume;
		
		if(numInt == 1){
			work = "Volume set to 1";
		} else if(numInt == 2) {
			work = "Volume set to 2";
		} else if(numInt == 3) {
			work = "Volume set to 3";
		} else if(numInt == 4) {
			work = "Volume set to 4 ";
                } else if(numInt == 5){
                        work = "Volume set to 5";
		} else if(numInt == 6) {
			work = "Volume set to 6";
		} else if(numInt == 7) {
			work = "Volume set to 7";
		} else if(numInt == 8) {
			work = "Volume set to 8 ";
                } else if(numInt == 9){
                        work = "Volume set to 9";
		} else if(numInt == 10) {
			work = "Volume set to 10";
		} else if(numInt == 11) {
			work = "Volume set to 11";
		} else if(numInt == 12) {
			work = "Volume set to 12 ";
                } else if(numInt == 13){
                        work = "Volume set to 13";
		}
                return work;
     }
     
    private String volumeKnob(double amt){ //if volume is greater then 15 it will say sorry no higher volume set
    volumeControl += amt;
        if(volumeControl > 13){
            volumeControl = 13;
        }    
            return "No higher volume set, sorry.";
    }
    
    
    private String radioOn() { //turns radio on
        radioStatus = true;
        //if rado is on it will come up true
        return "Radio on";
     }
    
    private String radioOff() { //turns radio off
        radioStatus = false;
        //if radio is off it will come up false
        return "Unable to toggle your input .... sorry try again later.";
    }
    
    private String auxOn(){ //turns aux on
        auxPlay = true;
                
        return "Aux now Connected ";
    }
    
     private String auxOff(){ //turns aux off
        auxPlay = false;
        
        return " Aux malfunction ";
    }
    
     private String bluetoothOn(){ //turns bluetooth off
        blueTooth = true;
        
        return "Bluetooth Connected ";
    }
    
     private String bluetoothOff(){ //truns bluetooth off
         blueTooth = false;
         
         return "Sorry, not able to connect to bluetooth, please try again. ";
     }
    
     
    public static void main(String[] args){        //main method 
        BlueToothRadio radio = new BlueToothRadio(); //new radio
      Scanner in = new Scanner(System.in); //input scanner
                
      String a; //set of strings
      String b;
      String c;
      String d;
      String e;
      String f;
      String g;
      
      
      
      System.out.println("Welcome to your New 2017 Chevy Cruze"); //user interface for radio
    boolean control = true;
    while(control){
      System.out.println("Would you like the radio turned on ?");
      a = in.nextLine();
      if(a.equals("yes")){
          control = false;
          System.out.println(radio.radioOn());
      }else if (a.equals("no")){        
          System.out.println(radio.radioOff());         
       }else{
          System.out.println("Not Valid a Input!!!");
      }
      }
      
    boolean work = true;
    while(work){
        System.out.println("Would you like the bluetooth connected to your phone?"); //user interface for bluetooth
        c = in.nextLine();
        if(c.equals("yes")){
        work = false;
        System.out.println(radio.bluetoothOn());
        } else if (c.equals("no")){
        System.out.println(radio.bluetoothOff());
        }else{
        System.out.println("Not Valid a Input!!!");
        }
               }
     boolean back = true;
     while(back){
        System.out.println("Would you like to shutoff bluetooth and connect your phone to AUX"); //user interface for aux
        d = in.nextLine();
        if(d.equals("yes")){
        back = false;
        System.out.println(radio.bluetoothOff() + radio.auxOn());
        } else if (d.equals("no")){
        System.out.println("Bluetooth still connected, " + radio.auxOff());
        }else{
        System.out.println("Not a Valid Input");
        }
     
     }
     boolean half = true;
     while(half){
         System.out.println("What preset station would you like to tune to, 1-5? "); //user interface for preset station
         e = in.nextLine();
         if(e.equals("1")){
             half = false;
             System.out.println(radio.radioFunctions(1));
         }else if(e.equals("2")){
             half = false;
             System.out.println(radio.radioFunctions(2));
         }else if (e.equals("3")){
             half=false;
             System.out.println(radio.radioFunctions(3));
         }else if(e.equals("4")){
             half = false;
             System.out.println(radio.radioFunctions(4));
         }else if(e.equals("5")){
             half = false;
             System.out.println(radio.radioFunctions(5));
         }else {
             System.out.println("crackle, pop , crackle , crackle! ");
         
        }
    }
     boolean volume = true;
     while(volume){
         System.out.println("Would you like your volume set to ?" ); //volume interface set to 
         f = in.nextLine();
         if(f.equals("1")){
            volume = false;
            System.out.println(radio.setVolume(1));
         }else if(f.equals("2")){
            volume = false;
            System.out.println(radio.setVolume(2));
        }else if(f.equals("3")){
            volume = false;
            System.out.println(radio.setVolume(3));
        }else if(f.equals("4")){
            volume = false;
            System.out.println(radio.setVolume(4));
        }else if(f.equals("5")){
            volume = false;
            System.out.println(radio.setVolume(5));
        }else if(f.equals("6")){
            volume = false;
            System.out.println(radio.setVolume(6));
        }else if(f.equals("7")){
            volume = false;
            System.out.println(radio.setVolume(7));
        }else if(f.equals("8")){
            volume = false;
            System.out.println(radio.setVolume(8));
        }else if(f.equals("9")){
            volume = false;
            System.out.println(radio.setVolume(9));
        }else if(f.equals("10")){
            volume = false;
            System.out.println(radio.setVolume(10));
        }else if(f.equals("11")){
            volume = false;
            System.out.println(radio.setVolume(11));
        }else if(f.equals("12")){
            volume = false;
            System.out.println(radio.setVolume(12));
        }else if(f.equals("13")){
            volume = false;
            System.out.println(radio.setVolume(13));
        }else
             System.out.println(radio.volumeKnob(13));
         
     }
     
     boolean status = true;
     while(status){
         System.out.println("Would you like to see your Radio Status ?" ); //status of radio user interface
         g = in.nextLine();
         if(g.equals("yes")){
            status = false;
            System.out.println(radio.getRadioStatus());
         }else{
             System.out.println("Goodbye");
                     status = false;
         }
     }
    }
     private String getRadioStatus(){ //prints out the radio status
        String aboutRadio;
        aboutRadio = "\n****Radio STATUS***" +
                "\nRadio On: " + radioStatus +
                "\nBluetooth On: " + blueTooth + 
                "\nAux Connected: " + auxPlay +
                "\nVolume:" + volume+
                "\nRadio Preset: " + radioPresets +
                "\n*********************";
        return aboutRadio;
    }
  
}
        
       
 
        


        
    



