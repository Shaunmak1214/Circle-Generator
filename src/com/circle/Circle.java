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
        setOpaque(false);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        setSize(width, height);
        g.drawOval(0,0,width,height);
    }

}