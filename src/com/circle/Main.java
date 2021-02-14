package com.circle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main (String [] args){

        MainFrame main = new MainFrame(125, 125);

        main.redrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                main.circlePanelWrapper.removeAll();
                main.circlePanelWrapper.revalidate();
                main.circlePanelWrapper.repaint();

                String ScircleR1 = main.radiusInput1.getText();
                int circleR1 = Integer.parseInt(ScircleR1.trim());
                int circleR1T = circleR1 / 2;

                String ScircleR2 = main.radiusInput2.getText();
                int circleR2 = Integer.parseInt(ScircleR2.trim());
                int circleR2T = circleR2 / 2;

                main.setCircle(circleR1T, circleR1T);
                main.setCircle1(circleR2T, circleR2T);

                System.out.println("New Circle");
            }
        });

    }
}
