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

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author delores
 */
public class DigitalArt {
    
    final static int NUM_LOOPS = 900000;
    
    public static void main(String[] args) {
        
        // core clock loop works here
        for(int i = 0; i < NUM_LOOPS; i++){
            generateBigRandomNum();
        }
    }
    
    public static void generateBigRandomNum(){
        
        Random random = new Random();
        // create new BigInteger at a large random value
        BigInteger bigInt = new BigInteger(100, random);
        // spit out to console
        System.out.print(bigInt);
        System.out.print("           ");
        
    }
    
    
    
    
    
}
