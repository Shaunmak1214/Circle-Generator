//Mak Yen Wei 1181203334

package com.circle;

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
            if( ScircleR1.equals("") ){ circleR1 = 60; main.radiusInput1.setText(""+circleR1); }
            else{ circleR1 = Integer.parseInt(ScircleR1.trim()); }

            String Sx1 = main.xInput1.getText();
            int x1;
            if( Sx1.equals("") ){ x1=80; main.xInput1.setText(""+x1); }
            else{ x1=Integer.parseInt(Sx1.trim()); }

            String Sy1 = main.yInput1.getText();
            int y1;
            if( Sy1.equals("") ){ y1=100; main.yInput1.setText(""+y1); }
            else { y1=Integer.parseInt(Sy1.trim()); }

            String ScircleR2 = main.radiusInput2.getText();
            int circleR2;
            if( ScircleR2.equals("") ){ circleR2 = 60; main.radiusInput2.setText(""+circleR2); }
            else{ circleR2 = Integer.parseInt(ScircleR2.trim()); }

            String Sx2 = main.xInput2.getText();
            int x2;
            if( Sx2.equals("") ){ x2=150; main.xInput2.setText(""+x2); }
            else{ x2=Integer.parseInt(Sx2.trim()); }

            String Sy2 = main.yInput2.getText();
            int y2;
            if( Sy2.equals("") ){ y2=100; main.yInput2.setText(""+y2); }
            else{ y2=Integer.parseInt(Sy2.trim()); }

            //Draw a new circle based on user input
            main.setCircle(x1, y1, circleR1, circleR2);
            main.setCircle1(x2, y2, circleR1, circleR2);

            main.checkIntersection(circleR1, circleR2);

            System.out.println("New Circle");
            System.out.println("X1: "+x1);
            System.out.println("Y1: "+y1);
            System.out.println("X2: "+x2);
            System.out.println("Y2: "+y2);
            System.out.println("Radius 1: "+circleR1);
            System.out.println("Radius 2: "+circleR2);
        });

    }
}
