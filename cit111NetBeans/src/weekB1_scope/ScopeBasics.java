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
package weekB1_scope;

/**
 * Demonsrates the essential principles of variable scope in Java
 * @author Eric C Darsow
 */
public class ScopeBasics {
    // our first member variable: this named chunk of data can be read from and 
    // written to by ANY code in this class--meaning any method!
    private static String classScopedVar = "All methods can access me!";

    // This method demonstrates which veariables can be 
    // accessed in its local scope: only class-scoped variables and its own
    // local variable called localScope2
    public static void demonstrateScope(){
        System.out.println("Inside demonstrateScope");
        // declaration and initialziation of a local variable to demonstrateScope
        String localScope2 = "I'm local to demonstrateScope";
        
        //System.out.println(localScope1); // localScope1 was declared in main
                                         // and cannot be accessed by any other
                                         // method
        System.out.println(classScopedVar); 
        System.out.println(localScope2); 
        
        // any method can change a class-scoped variable's value
        classScopedVar = "I can be changed in any method.";
        
    } // clsoe demonstrateScope    
    
    // Remember: the main method can be located anywhere you want--method order 
    // within a class doesn't effect the execution of the code itself.
    public static void main(String[] args) {
        System.out.println("Inside Main");
        // declaration and initialziation of a local variable to main
        String localScope1 = "I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        //System.out.println(localScope2); // localScope2 is only accessible in
                                         // the method in which it is declared:
                                         // which is demonstrateScope
                
        // call a method that will test variable scope concepts
        demonstrateScope();
        
    } // close main
    
} // close class

