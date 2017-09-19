/*
 * Copyright (C) 2017 Eric Darsow
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
package utilities;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Random;

/**
 * Machine for creating random group assignments
 * for a class of a given size and a given group size
 * @author Eric Darsow
 */
public class PartnerPicker {
    // static variables for holding group formation parameters
    private static int totalClassMembers;
    private static int groupSize;
    private static LinkedList<Integer> students;
    private static LinkedList<Integer> notHere;
    private static int[] groupArray;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many folks are in the class?");
        totalClassMembers = scanner.nextInt();
        
        System.out.println("What group size do you want to build?");
        groupSize = scanner.nextInt();
        groupArray = new int[groupSize];
        
        notHere = new LinkedList();
        int absentStud = 0;
        
        System.out.println("Enter the ID numbers of absent students:");
        System.out.println("Input -1 when done entering absent students");
        // as long as there are more absent students to add
        while(absentStud != -1){
            absentStud = scanner.nextInt();
            // add the absent students to the array
            notHere.add(absentStud);
        } // end while loop
        
        students = new LinkedList();
        
        // build linked list of class members
        for(int i = 1; i <= totalClassMembers; i++){
            //System.out.println("... i="+i); // see inside for()
            // as long as the student is not absent, add to students list
            if(notHere.indexOf(i) == -1){
                students.add(i);
                //System.out.println("...just added "+ i);
            } // end if
        } // end for loop
        System.out.println("...done building list");
        
        // check student array  - testing
        /*
        ListIterator iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        } // end while
        */
        
        // create a random number generator the size of the class
        Random rand = new Random();
        
        ListIterator studIterator = students.listIterator();
        // as long as we have students that haven't been assigned a group...
        while(studIterator.hasNext()){
            System.out.print("Group: ");
            // build a group of the specified size
            for(int i = 0; i < groupSize; i++ ){
                // check the student list to make sure we don't generate a new 
                // group member when there are no more to assign to groups
                if(!students.isEmpty()){
                    // generate a random group member INDEX
                    int groupMemberIndex = rand.nextInt(students.size());
                    // retrieve the student number at the random index
                    System.out.print(students.get(groupMemberIndex) + ", ");
                    // once chosen, remove from our pool of unassigned students
                    students.remove(groupMemberIndex);
                } // end if
            } // close for loop
            System.out.println("");
        } // close while loop
    } // end main
} // close class
