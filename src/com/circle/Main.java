//Mak Yen Wei 1181203334

package com.circle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main (String [] args){

        MainFrame main = new MainFrame();

        //Set redraw button action
        main.redrawButton.addActionListener(e -> { //Using lambda because the anonymous class has one method only

            ///Repaint
            main.circlePanelWrapper.removeAll();
            main.circlePanelWrapper.repaint();
            main.circlePanelWrapper.setLayout(null);

            //Get value from input text field and set default value when it is empty
            String ScircleR1 = main.radiusInput1.getText();
            int circleR1;
            if( ScircleR1.equals("") ){ circleR1 = 60; }else{ circleR1 = Integer.parseInt(ScircleR1.trim()); }
            int circleR1T = circleR1;

            String Sx1 = main.xInput1.getText();
            int x1;
            if( Sx1.equals("") ){ x1=0; }else{ x1=Integer.parseInt(Sx1.trim()); }

            String Sy1 = main.yInput1.getText();
            int y1;
            if( Sy1.equals("") ){ y1=50; }else{ y1=Integer.parseInt(Sy1.trim()); }

            String ScircleR2 = main.radiusInput2.getText();
            int circleR2;
            if( ScircleR2.equals("") ){ circleR2 = 60; }else{ circleR2 = Integer.parseInt(ScircleR2.trim()); }
            int circleR2T = circleR2;

            System.out.println(circleR1T);
            System.out.println(circleR2T);

            String Sx2 = main.xInput2.getText();
            int x2;
            if( Sx2.equals("") ){ x2=150; }else{ x2=Integer.parseInt(Sx2.trim()); }

            String Sy2 = main.yInput2.getText();
            int y2;
            if( Sy2.equals("") ){ y2=50; }else{ y2=Integer.parseInt(Sy2.trim()); }

            //Draw a new circle based on user input
            main.setCircle(circleR1T, x1, y1, circleR2T);
            main.setCircle1(circleR1T, x2, y2, circleR2T);

            System.out.println("New Circle");

        });

    }
}
