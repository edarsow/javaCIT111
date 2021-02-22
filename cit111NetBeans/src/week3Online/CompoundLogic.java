/*
 * Copyright (C) 2021 Eric Darsow <edarsow@ccac.edu>
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
package week3Online;

/**
 *
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class CompoundLogic {
    
    public static void main(String[] args) {
        int f = 45;
        int k = 30;
        int w = 31;
        int p = 18;
        
        if(f < k){
            System.out.println("F is less than K");
        }
        
        if((k == w) || (f > p)){
            System.out.println("K is equal to W OR F is greater than P");
        }
        
        System.out.println("End program");
    }
    
}
