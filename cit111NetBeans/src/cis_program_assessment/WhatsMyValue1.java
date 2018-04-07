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
package cis_program_assessment;

/**
 *
 * @author delores
 */
public class WhatsMyValue1 {
    
    public static void main(String[] args) {
        int saturn = 100;
        int mars = 20;
        int comet = saturn / mars;
        mars = comet * 10;
        saturn = mars % 10;
        System.out.println("Saturn: " + saturn);
        System.out.println("Mars: " + mars);
        System.out.println("Comet: " + comet);
    } // close main
    
}
