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
package week5;

/**
 * Tinkering with the while() control structure
 * @author delores
 */
public class NotAsSimpleWhile {
    public static void main(String[] args) {
        int numLoops = 0;
        
        while(numLoops <= 10){
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        } // close while
        
        System.out.println("...After the while loop");
        
    } // close main
} // close class
