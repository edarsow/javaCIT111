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

public class LoopingExTruman2 {
    
    public static void main(String[] args) {
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";

        Scanner scanner = new Scanner(System.in);
        int ctl = scanner.nextInt();
        int stepSize = scanner.nextInt();
        int max = scanner.nextInt();
        
        System.out.println(lady);
        do {
            if(ctl % 2 > 0){
                System.out.println(flowers.toUpperCase());
            }
            ctl = ctl + stepSize;
        } while (ctl <= max);
        System.out.println(beetle);
    }// close method
} // close class
