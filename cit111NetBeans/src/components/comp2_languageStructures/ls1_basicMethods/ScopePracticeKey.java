/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package components.comp2_languageStructures.ls1_basicMethods;

/**
 * Variable scoope practice exercise loosely drawn from the film Inception
 * @author delores
 */
public class ScopePracticeKey {
    
    // member variables (aka fields, class members)
    private static String hatType = "Baker's hat";
    private static boolean davidInSubstrate = false; 
    private static String alarm = "System alert!";
    
    public static void main(String[] args) {
        System.out.println("[begin execution in main]");
        locateDanceStudio();
        turnKnobLeft();
        accessPumpingStation();
        System.out.println("[end execution in main]");
    } // close main
    
    public static void locateDanceStudio(){
        System.out.println("Elise!");
    } // close method locateDanceStudio
    
    public static void turnKnobLeft(){
        knockOffHat();
        toggleDavidCondition();
        String bigBoss = "chairman";
        System.out.println("Visit the " + bigBoss);
        
    } // close method turnKnobLeft
    
    public static void knockOffHat(){
        System.out.println("Knocking off " + hatType);
        System.out.println(alarm);
        
    } // close method knockOffHat
    
    public static void accessPumpingStation(){
        toggleDavidCondition();
        String alarm = "Unauthorized entry!";
        System.out.println(alarm);
    } // close access pumping station
    
    private static void toggleDavidCondition(){
        davidInSubstrate = !davidInSubstrate;
        System.out.println("[toggled davidInsubstrate to " 
                + davidInSubstrate + "]");
    } // close toggleDavidCondition method
    
} // close class ScopePracticeKey
