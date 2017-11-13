/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.comp3_objects.project.sp17;

import java.awt.*;
import javax.swing.*;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author vanja
 */

class Rocket {

    
    private double velocity;
    // angle to launch from. vertex at origin with initial side at x-axis. 
    private double azimuth;
    private Point.Double location;
    //distance from origin
    private double distance;
    private boolean engineStatus;
    private double time;
    // Seconds in day and scaling factor. 1 unit is 200,000 km
    private final int SEC_DAY = 86400;
    private final double SCALE = 200000;
    
    
    public Rocket() {
        location = new Point.Double();
    }
    
    
    
    //calculates hypotenuse length and computes x,y of endpoint from angle
    public void computeCourse() {
        double x;
        double y;
        
        setDistance((getVelocity()*getTime()*SEC_DAY) / SCALE);
        
        x = Math.cos(azimuth) * getDistance();
        y = Math.sin(azimuth) * getDistance();
        
        Point.Double endpnt = new Point.Double(x, y);
        
        location = endpnt;
        
       
        
        
        
    }

    /**
     * @return the velocity
     */
    public double getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     * 
     * Confused about restricting input so settled with this. 
     */
    public void setVelocity(double velocity) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (velocity > 0) {
            this.velocity = velocity;
        } else {
            System.out.println("Enter a positive value");
            setVelocity(Double.parseDouble(reader.readLine()));
        }
    }

    /**
     * @return the azimuth
     */
    public double getAzimuth() {
        return azimuth;
    }

    /**
     * @param azimuth the azimuth to set
     * checks if measure is <= 90 degrees then converts and stores the radian measure
     */
    public void setAzimuth(double azimuth) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (azimuth >= 0 && azimuth <= 90) {
            
            this.azimuth = Math.toRadians(azimuth);

        } else {
          System.out.println("Out of bounds. Enter a new heading. ");  
          setAzimuth(Double.parseDouble(reader.readLine()));
          
        }
        
        
    }

    /**
     * @return the location
     */
    public Point.Double getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Point.Double location) {
        this.location = location;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * @return the engineStatus
     */
    public boolean isEngineStatus() {
        return engineStatus;
    }

    /**
     * @param engineStatus the engineStatus to set
     */
    public String setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
        if (engineStatus == true) {
        return "Main engines engaged..";
        } else {
            return "Main engines shutdown..";
        }
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (time > 0) {
            this.time = time;
        } else {
            System.out.println("In this house we obey the laws of Relativity. Enter a positive value..");
            setTime(Double.parseDouble(reader.readLine()));
            
        }
    }
    
    
    //reads back course settings before computing the course
    public String readoutNavSettings() {
        return "Rocket launch azimuth: " + getAzimuth() + " radians." + "\nRocket velocity: " + getVelocity() + " Km/s." +
                "\nRockets's travel time: " + getTime() + " days.";
    }
    

    // alt method for distance in km to origin
    public double convertDist() {
        return distance*SCALE;
    }
    
    // takes planets as input and uses distance method on location to give distances 
    public String computePlanetDistances(Point.Double terra, Point.Double tau, Point.Double epsilon, Point.Double psi) {
        return "Distance from origin (Terra): " + location.distance(terra)*SCALE + " kilometers.\nDistance from Tau: " +
                location.distance(tau)*SCALE + " kilometers.\nDistance from Epsilon: " + location.distance(epsilon)*SCALE +
                " kilometers.\nDistance from Psi: " + location.distance(psi)*SCALE + " kilometers.";
        
        
    }
    
    //sets ship location to random point in grid
    public void engageInfiniteImprobabilityDrive() {
        Random rand = new Random();
        location.setLocation(rand.nextInt(1850), rand.nextInt(1000));
    }
    
    
    
    
    
}







public class RocketNavigation extends Canvas /*extends Graphics2D*/ {
    
    //planets with terra as origin
    final Point.Double TERRA = new Point.Double();
    final Point.Double TAU = new Point.Double(700, 254);
    final Point.Double EPSILON = new Point.Double(1456, 567);
    final Point.Double PSI = new Point.Double(1050, 976);
    
    public static void main(String[] args) throws InterruptedException, IOException {
        
        RocketNavigation moon = new RocketNavigation();
        
        JFrame frame = new JFrame();
        frame.setSize(1850, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(moon);
        frame.setVisible(true);
        
        Rocket rocket = new Rocket();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter launch azimuth - 0-90 degrees: ");
        
        rocket.setAzimuth(Double.parseDouble(reader.readLine()));
        
        System.out.println("Enter velocity in km/s to accelerate to: ");
        
        rocket.setVelocity(Double.parseDouble(reader.readLine()));
        
        System.out.println("Enter time in days to travel: ");
        
        rocket.setTime(Double.parseDouble(reader.readLine()));
        
        System.out.println(rocket.readoutNavSettings());
        
        System.out.println("Rocket location: " + rocket.getLocation());
        
        System.out.println("Press enter to engage main engines and set course ");
        
        reader.readLine();
        
        System.out.println(rocket.setEngineStatus(true));
        
        for (int i = 0; i < 4; i++ ) {
            System.out.println("Accelerating...");
            Thread.sleep(1000);
        }
        
        System.out.println(rocket.setEngineStatus(false));
        
        
        
        rocket.computeCourse();
        
        System.out.println("Rocket location: " + rocket.getLocation());
        
        System.out.println("Altitude: " + rocket.convertDist() + " Kilometers.");
        
        System.out.println(rocket.computePlanetDistances(moon.TERRA, moon.TAU, moon.EPSILON, moon.PSI));
        
        System.out.println("Press Enter to engage the Infinite Improbability Drive.. ");
        
        reader.readLine();
        
        rocket.engageInfiniteImprobabilityDrive();
        
        System.out.println("Don't panic, the ship is now a toaster! Toaster location: " + rocket.getLocation());
        
        System.out.println(rocket.computePlanetDistances(moon.TERRA, moon.TAU, moon.EPSILON, moon.PSI));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
    }
    
    
    
   
    
    
    
    public void paint(Graphics graphics) {
        
        
        
        
        
        //graphics.setColor(Color.black);
        //graphics.drawLine(40, 30, 330, 380);
        
    }

    
  
}

