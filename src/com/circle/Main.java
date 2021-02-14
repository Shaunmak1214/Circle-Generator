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
                int circleR1;
                if( ScircleR1.equals("") ){ circleR1 = 128; }else{ circleR1 = Integer.parseInt(ScircleR1.trim()); }
                int circleR1T = circleR1 / 2;

                String Sx1 = main.xInput1.getText();
                int x1;
                if( Sx1.equals("") ){ x1=0; }else{ x1=Integer.parseInt(Sx1.trim()); }

                String Sy1 = main.yInput1.getText();
                int y1;
                if( Sy1.equals("") ){ y1=0; }else{ y1=Integer.parseInt(Sy1.trim()); }

                String ScircleR2 = main.radiusInput2.getText();
                int circleR2;
                if( ScircleR2.equals("") ){ circleR2 = 128; }else{ circleR2 = Integer.parseInt(ScircleR1.trim()); }
                int circleR2T = circleR2 / 2;

                main.setCircle(circleR1T, x1, y1, circleR1T);
                main.setCircle1(circleR2T, circleR2T);

                System.out.println("New Circle");

            }
        });

    }
}
