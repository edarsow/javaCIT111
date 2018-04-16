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


class EBook{
    public String title;
    public int numPages;
    public int numPagesRead;
    public double minutesReading;
} // close class EBook


public class PaperObjects1 {
    public static void main(String[] args) {
        EBook javaBook = new EBook();
        EBook pythonBook = new EBook();
        
        javaBook.title = "Thinking In Java";
        javaBook.numPages = 950;
        javaBook.numPagesRead = 400;
        javaBook.minutesReading = 1289.22;
        
        pythonBook.numPages = 1400;
        pythonBook.numPagesRead = 12;
        pythonBook.minutesReading = 111.3;
        
        int delta = javaBook.numPages - pythonBook.numPages;
        System.out.println(delta);
        javaBook.numPages = pythonBook.numPages;
        delta = javaBook.numPages - pythonBook.numPages;
        System.out.println(delta);
        System.out.println(pythonBook.title);
        System.out.println(javaBook.title.toUpperCase());
        
    } // close main
} // close class PaperObjects1
