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
package week5Keys;

import java.util.Scanner;
/**
 *
 * @author delores
 */
public class QuizProgramSolution {
    public static void main(String args[]) {
        final String problem = "Compute (10 % 3) * 2";
        final int answer = 2;
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("**Math Checker**");
        System.out.println("Compute the value of (10 % 3) * 2:");
        s.nextInt();
        System.out.println("Sorry, Incorrect");        
        System.out.println("(Your answer is too high)");
        System.out.println("****");
        System.out.println("Compute the value of (10 % 3) * 2:");
        s.nextInt();
        System.out.println("Sorry, Incorrect");        
        System.out.println("(Your answer is too low)");
        System.out.println("****");
        System.out.println("Compute the value of (10 % 3) * 2:");
        s.nextInt();
        System.out.println("Correct! Nice work");
        System.out.println("Solution: (10 % 3) * 2 = 1 * 2 = 2 ");
    }
    
}
