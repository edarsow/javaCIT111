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
public class ScopeBasicsPrettyPrint {
    // our first member variable: this named chunk of data can be read from and 
    // written to by any code in this class--meaning any method!
    private static String classScopedVar = "I'm accessible to the entire class";
    
    public static void main(String[] args) {
        
        System.out.println("** Inside main **");
        
        // declaration and initialziation of a local variable to main
        String localScopeVar = "I'm local to main: no other methods can see me";
        
        System.out.println("Reading localScopeVar:\n   " + localScopeVar);
        System.out.println("Reading classScopedVar:\n   " + classScopedVar);
        System.out.println("Calling demonstrateCoreConcepts() method...");
        
        // call a method that will operate on a class-scoped variable
        demonstrateScope();
        
        System.out.println("\n** Back Inside main **");
        // we see the changes we made in demosntrateScopeConcepts here in main!
        System.out.println("Reading classScopedVar again:\n   " + classScopedVar);
    } // close main
    
    public static void demonstrateScope(){
        
        System.out.println("\n** Inside demonstrateScopeConcepts **");
        
        // This print won't compile since the method testVariableScope is located outside
        // main's method scope and cannot access localScopeVar
        // Uncomment this line and study the error message carefully!
        
        // System.out.println(localScopeVar); // <-- try UN-commenting this line!
        
        System.out.println("Writing new content to classScopedVar");
        
        // write a new value to our class-scoped variable
        classScopedVar = "My content was changed in demonstrateScopeConcepts";
        
        System.out.println("Reading classScopedVar:\n   " + classScopedVar);
    } // clsoe demonstrateScope    
} // close class
