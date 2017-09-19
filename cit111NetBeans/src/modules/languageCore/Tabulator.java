/*
 * Copyright (C) 2017 delores
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
package modules.languageCore;

import java.util.Scanner;

/**
 * Implements a basic response tabulation system based on the user's response to
 * a question of interest. This program illustrates the use of an if() statement
 * to control the response given to the user. A while() loop is used to repeatedly
 * ask the user the same question without duplicating any code.
 * @author delores
 */
public class Tabulator {
    
    public static void main(String[] args){
        // create a scanner for gathering user input
        Scanner scanner = new Scanner(System.in);
        
        // declare and initiate our two counter variables to zero
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("LINUX USERS SURVEY");
        
        // this while loop will proceed indefinitely since the value "true"
        // will always be true, resulting in an infinte loop
        while(true){
            System.out.println(">>>>>>>>>>QUESTION<<<<<<<<<<<<");
            System.out.println("Do you regularly use Linux software? (Android == Linux!!)"); 
            System.out.println("(Enter 1 for YES and 0 for NO)");
            
            int userResponse = scanner.nextInt();
            
            // display an automated response based on the user's input
            if(userResponse == 1){
                // since they indiciated that they use linux, increment our counter
                numLinuxUsers = numLinuxUsers + 1;
                System.out.println("Yeaaah! Free Software Users Unit!");
            } else{
                System.out.println("[sad face] Visit ubuntu.com immediately!");
            } // end if/else block
            
            // increment total respondents regardless of response
            totalRespondents = totalRespondents + 1;
            
            // print summary statistics each time the question is answered
            System.out.println("*********SUMMARY************");
            System.out.println(totalRespondents  + " folks have responded.");
            System.out.println(numLinuxUsers  + " report(s) regularly using Linux.");
            // convert ints to doubles to get a correct percentage
            double linuxDouble = (double) numLinuxUsers;
            double totalDouble = (double) totalRespondents;
            double percentUsers = (linuxDouble/totalDouble) * 100;
            System.out.println("This translates into a use percentage of: " + percentUsers + "%");
            System.out.println("*********END************");
            System.out.println("");
            
        } // close while loop
    } // close main method
} // close class
