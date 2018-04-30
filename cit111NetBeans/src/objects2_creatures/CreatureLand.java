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
package objects2_creatures;

/**
 * Class which demonstrates the creation
 * and manipulation of Java Objects
 * @author delores
 */







public class CreatureLand { 
    public static void main(String[] args) {
        Creature penguin;
        penguin = new Creature();
        // writing member variable values
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        // NOTE: no sizeLimit member var or setter method
        // on simplified Creature objects
        penguin.setBiteSizeInPercent(5);
        
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Chloe";
        donutForPenguin.sizeInmm = 32;
        
        // pass an instance of a SizedDonut object into 
        // the eatDonut method on our Creature object
        penguin.eatDonut(donutForPenguin);
    } // close main
} // close class