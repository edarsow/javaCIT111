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
package components.comp2_languageStructures.practice;

import java.util.Random;

/**
 * Refactoring practice: study the following code based on the film The Ring
 * and avoid repeating ANY lines of code that follow a similar pattern
 * by breaking those duplicated lines into their own method and writing
 * input and output parameters such that the same output can be generated
 * as shown in the un-refactored version below.
 * 
 * @author delores
 */
public class RefactorTheRing {
    
    // chop main up and call the new methods as needed
    public static void main(String[] args) {
        int numViewersSwallowedByRing = 0;
        
        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
        
        System.out.println(viewer1 + " watched the tape; 7 days to live");
        System.out.println(viewer2 + " watched the tape; 7 days to live");
        System.out.println(viewer3 + " watched the tape; 7 days to live");
        System.out.println(viewer4 + " watched the tape; 7 days to live");
        System.out.println(viewer5 + " watched the tape; 7 days to live");
        System.out.println("****************************************");
        
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 1 named " + viewer1 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer1 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer1 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 2 named " + viewer2 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer2 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer2 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 3 named " + viewer3 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer3 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer3 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 4 named " + viewer4 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer4 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer4 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
        randomMachine = new Random();
        madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did Viewer 5 named " + viewer5 + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer5 + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer5 + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        
    } // close main
    
    // write and test your new methods here
    
} // close class
