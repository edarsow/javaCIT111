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
package week4;

import java.util.Scanner;

/**
 * Impelments speed testing logic against defined min and max speeds
 * @author Eric Darsow
 */
public class SpeedEnforcement {
    
    public static void main(String[] args) {
        // setup our speed limits
        final int MIN_SPEED = 40;
        final int MAX_SPEED = 55;
        // working speed variable
        int carSpeed;
        // create a Scanner object for getting car speed from console
        Scanner userInputScanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter speed of vehicle in mph and press enter:");
        // grab integer from console
        carSpeed = userInputScanner.nextInt();
        
        // implement decision logic
        if(carSpeed < MIN_SPEED){
            System.out.println("Car is moving too slowly");
        } else if(carSpeed > MAX_SPEED){
                System.out.println("Car is traveling over the limit");
            } else {
                System.out.println("Car is within appropriate speed range");
        } // close chained if/else blocks
        
    } // close main method
} // close class SpeedEnforcement
