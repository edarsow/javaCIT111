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
package objects1_papercompiling;

/**
 *
 * @author delores
 */

class Battery{
    private final double POWER_USED_PER_MIN = 0.25;
    
    private double powerRemaining = 400.0;
    
    public double useBattery(double time){
        double PwrUsed = time * POWER_USED_PER_MIN;
        powerRemaining = powerRemaining - PwrUsed;
        return powerRemaining;
    }
    public void charge(){
       powerRemaining = powerRemaining + 200;
    }
    public double getPowerRemaining(){
        return powerRemaining;
    }
 } // close class

public class PaperObjects2 {
    public static void main(String[] args) {
        Battery energizer;
        Battery duracell;
        energizer = new Battery();
        duracell = new Battery();

        System.out.println("Energizer start: " + energizer.getPowerRemaining());
        System.out.println("Duracell start: " + duracell.getPowerRemaining());

        energizer.useBattery(100);
        duracell.useBattery(1000);
        energizer.useBattery(800);
        energizer.charge();
        Battery batt3 = duracell;
        batt3.charge();

        System.out.println("Energizer end: " + energizer.getPowerRemaining());
        System.out.println("Duracell end: " + duracell.getPowerRemaining());
        System.out.println("Batt3 end: " + batt3.getPowerRemaining());
    } // close main
} // close class
