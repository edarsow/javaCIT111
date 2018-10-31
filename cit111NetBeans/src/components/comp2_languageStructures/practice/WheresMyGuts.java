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
package components.comp2_languageStructures.practice;

/**
 *
 * @author delores
 */
public class WheresMyGuts {
    
    public static int findMyGuts1(int a, int b, int c){
        int m1 = java.lang.Math.max(a, b);
        int m2 = java.lang.Math.max(m1, c);
        return m2;
        
        
    }

    public static String findMyGuts2(double a, String b, int c){
        long r = java.lang.Math.round(a);
        long t = r + c;
        StringBuilder sb = new StringBuilder();
        long counter = 0;
        while(counter < t){
            sb.append(b);
            counter = counter + 1;
        }
        return sb.toString();
    }
    
    public static int findMyGuts3(float a, float b, float c){
        int a_rounded = java.lang.Math.round(a);
        int b_rounded = java.lang.Math.round(b);
        int c_rounded = java.lang.Math.round(c);
        return a_rounded + b_rounded + c_rounded;
    }
    
    public static String findMyGuts4(String a, String b, String c){
        a = a.toUpperCase();
        b = b.toLowerCase();
        if(c.length() > 3){
            c = c.substring(2);
            return a + b + c;
        }
        if(a.length() >5 && b.length() > 5 && c.length() > 5 ){
            return a.substring(3) + b.substring(2) + c.substring(1);
        }
        return c;
    }
    
    public static String findMyGuts5(String a, String b, int c){
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        if(a.length() > 3){
            while(counter < c){
                sb.append(a.substring(3).toLowerCase());
                sb.append(b.toUpperCase());
                counter = counter + 1;
            }
            return sb.toString();
        }
        return a.toUpperCase() + b.toLowerCase();
    }
    
}
