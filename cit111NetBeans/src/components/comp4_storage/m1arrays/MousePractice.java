/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author edarsow
 */
public class MousePractice extends Frame 
        implements MouseListener, MouseMotionListener {
    
    String msg = "";
    int mouseX = 0, mouseY =0;
    
    // constructor for our MousePractice class
    public MousePractice(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    } // closes constructor
    
    @Override
    public void mouseClicked(MouseEvent e){
        msg = msg + " click received";
        repaint();
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Entered";
        repaint();
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        // do nothing -- write guts later
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "button down";
        repaint();
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        // I do nothing at all!!!!!
    }
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        // I also do nothing
    }
    
    @Override
    public void mouseMoved(MouseEvent e){
        msg = "Mouse moving at " + e.getX() + ", " + e.getY();
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
    
    public static void main(String[] args){
        MousePractice mp = new MousePractice();
        mp.setSize(new Dimension(400,400));
        mp.setTitle("Very Gooey Program");
        mp.setVisible(true);
    } // close main()
    
} // closes public class

class MyWindowAdapter extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
