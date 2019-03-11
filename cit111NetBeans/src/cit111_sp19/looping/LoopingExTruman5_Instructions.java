/*
 * Copyright (C) 2019 delores
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
package cit111_sp19.looping;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Challenge Truman 5:
 * Write a small algorithm that arranges the user's three-number input
 * from lowest to highest and assigns the lowest value to ctl, the middle
 * value to stepSize, and the highest value to max.
 * 
 * The proper output should occur EVEN IF the user types all three numbers in
 * a non-ascending order.
 * 
 * @author delores
 */
public class LoopingExTruman5_Instructions {
    
    public static void main(String[] args) {
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        int ctl = Integer.parseInt(tokenizer.nextToken());
        int stepSize = Integer.parseInt(tokenizer.nextToken());
        int max = Integer.parseInt(tokenizer.nextToken());
        
        System.out.println(lady);
        do {
            System.out.println(flowers);
            if(ctl % 2 > 0){
                ctl = ctl + stepSize;
            }
        } while (ctl <= max);
        System.out.println(beetle);
    }// close method
} // close class
