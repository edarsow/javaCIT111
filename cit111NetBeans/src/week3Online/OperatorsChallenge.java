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
package week3Online;

/**
 * The key to the operators challenge as part of Chunk 1, Mod 3, Exercise 0
 * @author Eric Darsow
 */
public class OperatorsChallenge {
    public static void main(String[] args) {
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = "Go ask Alice";
        String line2 = "I think she'll know";
        
        int r = b /a;
        System.out.println("Variable r is: " + r);
        
        int mod = b % a;
        System.out.println("b % a is: " + mod);
        
        double rd = mod * d;
        System.out.println("Module operator divides and gives remainder: " + rd);
        
        a = a + 5;
        System.out.println("I'm aboout to compute " + b + " mod " + a);
        rd = b % a;
        System.out.println("Module operator divides and gives remainder: " + rd);
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("Combined: " + line2 + " " + line1);
        System.out.println("Or is it " + line1 + " " + line2);
    }
}
