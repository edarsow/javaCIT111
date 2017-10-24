/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutland;

/**
 *
 * @author delores
 */
public class Donut {
    
     // member variables
    private int percRemaining = 100;
    public String name;
    
    // "member" method to model the donut getting eaten
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // accessor method for the private member variable
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
}
