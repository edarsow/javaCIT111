/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3Online;

/**
 *
 * @author delores
 */
public class Variables {
    public static void main(String[] args) {
        // delcare variables and give them a type (they are all int type)
        int yearsEleSchl = 5;
        int yearsMS = 3;
        int yearsHS = 4;
        int yearsCollege = 2;
        int totalYears;
        
        // we can operate on them as before
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // and print the value of totalYears to the console with some text
        System.out.println("Total years in school: " + totalYears);
    }
}
