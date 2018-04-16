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


class PersianRug{
    public double length;
    public double width;
    public void shrinkRung(double perc){
        System.out.println("Shrinking by " + perc + "%");
        length = length - (length * (perc / 100.0));
//        width = (width * (perc / 100.0)); // err
        width = width - (width * (perc / 100.0));
    }
}
        
        
public class QuashThatBug1 {
    public static void main(String[] args) {
        PersianRug coolRug = new PersianRug();
//        length = 100.0; // err
//        width = 800.0; // err
        coolRug.length = 100; // fixed
        coolRug.width = 800; // fixed
        coolRug.shrinkRung(20.0);
//        System.out.println("Length: " + coolRug.getLength()); // err
        System.out.println("Length: " + coolRug.length); // fixed
//        System.out.println("Width: " + coolRug.setWidth()); // err
        System.out.println("Width: " + coolRug.width); // fixed
    }
}
