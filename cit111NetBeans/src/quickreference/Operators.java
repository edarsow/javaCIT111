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
package quickreference;

/**
 *
 * @author delores
 */
public class Operators {
  public static void main(String[] args) {
    int radiusEarth = 6000 + 378;
    int radiusMoon = 2000 - 262;
    int distBetween = 4641 - (radiusEarth + radiusMoon);
    // Is distBetween even or odd?
    // modulus operator % is the remainder after division
    boolean even = (distBetween % 2) == 0;
    double avgRadius = (double) radiusEarth / (double) radiusMoon;
    String r = "r";
    r = r.toUpperCase();
    System.out.println(r);
  }
    
}
