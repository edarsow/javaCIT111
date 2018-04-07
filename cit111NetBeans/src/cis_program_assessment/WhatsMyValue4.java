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
package cis_program_assessment;

/**
 *
 * @author delores
 */
public class WhatsMyValue4 {
    
    public static void main(String[] args) {
        int australia = 10;
        int chile = 5;
        boolean ecuador = false;
        chile = australia + chile;
        System.out.println("Australia before call: " + australia);
        System.out.println("Ecuador before if: " + ecuador);
        if(!ecuador){
            doSimpleMath(australia);
        } // close if
        System.out.println("Chile: " + chile);
        System.out.println("Ecuador after if: " + ecuador);
    } // close main
    
    public static void doSimpleMath(int numToFlip){
        int result = (numToFlip * -1) + 15;
        System.out.println("Result: " + result);
        
    } // close doSimpleMath
    
}
