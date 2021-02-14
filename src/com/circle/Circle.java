package com.circle;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.Graphics;
import java.awt.Color;

public class Circle extends JPanel {

    int width, height;

    public Circle(int width, int height) {
        setSize((width-20),(height-20));
        this.width = width;
        this.height = height;
        //setBackground(Color.BLUE);
        setOpaque(false);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        //super.paint(g1);
        setSize(width, height);
        g.drawOval(0,0,width,height);
        //g.setColor(Color.RED);
        //g.fillOval(0,0,60,60);
        //g1.drawOval(50,50,100,100);
        //g1.setColor(Color.RED);
        //g1.fillOval(50,50,100,100);
    }

}