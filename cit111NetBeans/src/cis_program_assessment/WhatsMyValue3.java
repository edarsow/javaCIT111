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
public class WhatsMyValue3 {
    
    public static void main(String[] args) {
        int turtle = 4;
        int marmot = 2;
        boolean sloth = false;
        
        while(marmot <= turtle){
            sloth = !sloth;
            marmot = marmot + 1;
        } // end while
        if(sloth){
            marmot = marmot * marmot;
        }    
        System.out.println("Turtle: " + turtle);
        System.out.println("Marmot: " + marmot);
        System.out.println("Sloth: " + sloth);
    } // close main
    
}
