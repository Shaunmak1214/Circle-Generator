//Mak Yen Wei 1181203334

package com.circle;

import javax.swing.*;
import java.awt.Graphics;

//A class which used to draw a graphics
public class Circle extends JPanel {

    int diameter;

    public Circle(int diameter) {
        setSize((diameter-20),(diameter-20));
        this.diameter = diameter;
        setOpaque(false);
        setVisible(true);
    }

    //Draw a circle
    public void paint(Graphics g) {
        super.paint(g);
        setSize(diameter, diameter);
        g.drawOval(0,0,diameter,diameter);
    }

}