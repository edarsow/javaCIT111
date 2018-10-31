/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.comp4_storage.m1arrays;

import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author edarsow
 */
public class ColorsAndLines extends Frame implements ActionListener{
    String msg = "";
    Button printMessageButton;
    
    public ColorsAndLines(){
        setLayout(new FlowLayout());
        printMessageButton = new Button("Show Me!");
        printMessageButton.addActionListener(this);
        add(printMessageButton);
        
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
                
            }
        });
    } // close constructor
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if (str.equals("Show Me!")){
            msg = "The Atomic Number of Zinc is 30";
        }
        repaint();
    } // close action method
    
    @Override
    public void paint(Graphics g){
        g.drawLine(20, 40, 100, 100);
        g.drawString(msg, 100, 100);
    }
    
    public static void main(String[] args) {
        ColorsAndLines firstApp = new ColorsAndLines();
        firstApp.setSize(new Dimension(400,400));
        firstApp.setTitle("Colors and Lines");
        firstApp.setVisible(true);
    } // close main()
    
} // close class
