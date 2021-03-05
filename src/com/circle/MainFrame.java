//Mak Yen Wei 1181203334

package com.circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

    Point currentLocation;
    Point currentScreenLocation;
    int width;

    JFrame mainFrame = new JFrame("Circle Generator");
    JPanel titlePanel = new JPanel();
    JPanel mainWrapper = new JPanel();
    JPanel circlePanelWrapper = new JPanel();
    JPanel userInputPanel = new JPanel();
    JPanel userInputLeftPanel = new JPanel();
    JPanel xInputPanel1 = new JPanel();
    JPanel xInputPanel2 = new JPanel();
    JPanel yInputPanel1 = new JPanel();
    JPanel yInputPanel2 = new JPanel();
    JPanel radiusPanel1 = new JPanel();
    JPanel radiusPanel2 = new JPanel();
    JPanel userInputRightPanel = new JPanel();
    JPanel footerPanel = new JPanel();

    JLabel titleLabel = new JLabel();
    JLabel titleInput1 = new JLabel();
    JLabel titleInput2 = new JLabel();
    JLabel xInputTitle1 = new JLabel();
    JLabel yInputTitle1 = new JLabel();
    JLabel xInputTitle2 = new JLabel();
    JLabel yInputTitle2 = new JLabel();
    JLabel radiusTitle1 = new JLabel();
    JLabel radiusTitle2 = new JLabel();

    JButton redrawButton = new JButton();

    JTextField xInput1 = new JTextField();
    JTextField xInput2 = new JTextField();
    JTextField yInput1 = new JTextField();
    JTextField yInput2 = new JTextField();
    JTextField radiusInput1  = new JTextField();
    JTextField radiusInput2  = new JTextField();

    Circle circle, circle1;

    //Setting of circle 1
    public Circle setCircle(int radius1, int x, int y, int radius2){

        width = radius1*2;
        circle = new Circle(width);

        circlePanelWrapper.add(circle);
        resetListener(circle, mainFrame, radius1, radius2);
        setLocation(circle, x, y);

        return circle;

    }

    //Setting of circle 2
    public Circle setCircle1(int radius1, int x, int y, int radius2){

        width = radius2*2;
        circle1 = new Circle(width);

        circlePanelWrapper.add(circle1);
        resetListener1(circle1, mainFrame, radius1, radius2);
        setLocation(circle1, x, y);
        return circle1;
    }

    public MainFrame(){

        super("Circle Generator");
        titlePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        mainFrame.setBackground(Color.WHITE);
        mainFrame.setSize(600, 600);

        //Intersect Title Label
        titleLabel.setText("Two circle intersect? No");
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);
        titlePanel.setPreferredSize(new Dimension(50, 50));
        titlePanel.setVisible(true);
        titlePanel.setBackground(Color.blue);
        titlePanel.setSize(600, 100);

        //Circle Panel Wrapper
        circle = setCircle(60, 0, 50,  60);
        circle1 = setCircle1(60, 150, 50,60);
        circlePanelWrapper.setBounds(0, 0, 600, 100);
        circlePanelWrapper.setVisible(true);
        circlePanelWrapper.setSize(new Dimension(600, 100));

        //Input wrapper panel
        userInputPanel.setVisible(true);
        userInputPanel.setBackground(Color.WHITE);
        userInputPanel.setPreferredSize(new Dimension(600,200));
        userInputPanel.setLayout(new BorderLayout());

        //Input left panel
        userInputLeftPanel.setVisible(true);
        userInputLeftPanel.setPreferredSize(new Dimension(290, 500));
        userInputLeftPanel.setBackground(Color.GRAY);

        userInputLeftPanel.setLayout(new GridLayout(4, 1));
        titleInput1.setText("Enter circle 1 info: ");
        titleInput1.setFont(new Font("Verdana",Font.BOLD,12));

        xInputPanel1.setLayout(new BorderLayout());
        xInputTitle1.setText("Center X: ");
        xInputTitle1.setFont(new Font("Verdana",Font.BOLD,12));
        xInput1.setPreferredSize(new Dimension(200, 20));
        xInputPanel1.add(xInputTitle1, BorderLayout.WEST);
        xInputPanel1.add(xInput1, BorderLayout.EAST);

        yInputPanel1.setLayout(new BorderLayout());
        yInputTitle1.setText("Center Y: ");
        yInputTitle1.setFont(new Font("Verdana",Font.BOLD,12));
        yInput1.setPreferredSize(new Dimension(200, 20));
        yInputPanel1.add(yInputTitle1, BorderLayout.WEST);
        yInputPanel1.add(yInput1, BorderLayout.EAST);

        radiusPanel1.setLayout(new BorderLayout());
        radiusTitle1.setText("Enter Radius");
        radiusTitle1.setFont(new Font("Verdana",Font.BOLD,12));
        radiusInput1.setPreferredSize(new Dimension(200, 20));
        radiusPanel1.add(radiusTitle1, BorderLayout.WEST);
        radiusPanel1.add(radiusInput1, BorderLayout.EAST);

        userInputLeftPanel.add(titleInput1);
        userInputLeftPanel.add(xInputPanel1);
        userInputLeftPanel.add(yInputPanel1);
        userInputLeftPanel.add(radiusPanel1);

        //Input right panel
        userInputRightPanel.setVisible(true);
        userInputRightPanel.setBackground(Color.green);
        userInputRightPanel.setPreferredSize(new Dimension(295, 500));

        userInputRightPanel.setLayout(new GridLayout(4, 1));
        titleInput2.setText("Enter circle 2 info: ");
        titleInput2.setFont(new Font("Verdana",Font.BOLD,12));

        xInputPanel2.setLayout(new BorderLayout());
        xInputTitle2.setText("Center X: ");
        xInputTitle2.setFont(new Font("Verdana",Font.BOLD,12));
        xInput2.setPreferredSize(new Dimension(200, 20));
        xInputPanel2.add(xInputTitle2, BorderLayout.WEST);
        xInputPanel2.add(xInput2, BorderLayout.EAST);

        yInputPanel2.setLayout(new BorderLayout());
        yInputTitle2.setText("Center Y: ");
        yInputTitle2.setFont(new Font("Verdana",Font.BOLD,12));
        yInput2.setPreferredSize(new Dimension(200, 20));
        yInputPanel2.add(yInputTitle2, BorderLayout.WEST);
        yInputPanel2.add(yInput2, BorderLayout.EAST);

        radiusPanel2.setLayout(new BorderLayout());
        radiusTitle2.setText("Enter Radius");
        radiusTitle2.setFont(new Font("Verdana",Font.BOLD,12));
        radiusInput2.setPreferredSize(new Dimension(200, 20));
        radiusPanel2.add(radiusTitle2, BorderLayout.WEST);
        radiusPanel2.add(radiusInput2, BorderLayout.EAST);

        userInputRightPanel.add(titleInput2);
        userInputRightPanel.add(xInputPanel2);
        userInputRightPanel.add(yInputPanel2);
        userInputRightPanel.add(radiusPanel2);

        userInputPanel.add(userInputLeftPanel, BorderLayout.WEST);
        userInputPanel.add(userInputRightPanel, BorderLayout.EAST);

        //Main wrapper that wraps, circlePanelWrapper, UserInputWrapper
        mainWrapper.setLayout(new BorderLayout());
        mainWrapper.setSize(new Dimension(600, 100));
        mainWrapper.add(circlePanelWrapper, BorderLayout.CENTER);
        mainWrapper.add(userInputPanel, BorderLayout.SOUTH);
        mainWrapper.setVisible(true);
        mainWrapper.setOpaque(false);

        //Footer panel
        footerPanel.setVisible(true);
        footerPanel.setBackground(Color.GRAY);
        //footerPanel.setSize(600, 90);
        footerPanel.setPreferredSize(new Dimension(600,50));
        redrawButton.setText("Redraw Circle");
        redrawButton.setPreferredSize(new Dimension(250,30));
        redrawButton.setFont(new Font("Verdana",Font.BOLD,12));
        redrawButton.setVerticalAlignment(JLabel.CENTER);
        footerPanel.add(redrawButton, BorderLayout.CENTER);

        mainFrame.add(titlePanel, BorderLayout.NORTH);
        mainFrame.add(mainWrapper, BorderLayout.CENTER);
        mainFrame.add(footerPanel, BorderLayout.SOUTH);
    }

    public void resetListener(Circle circle, JFrame frame, int radius1, int radius2){

        circle.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                currentLocation = e.getPoint();
                System.out.println(e.getPoint());
            }
        });

        circle.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                //Get the point when mouse is dragging the circle 1
                Point frameLocation = frame.getLocationOnScreen();
                double frameLocationX = frameLocation.getX();
                double frameLocationY = frameLocation.getY();
                System.out.println("frame location : " + frameLocation);
                currentScreenLocation = e.getLocationOnScreen();
                double currentScreenLocationX = currentScreenLocation.getX();
                double currentScreenLocationY = currentScreenLocation.getY();
                double currentLocationX = currentLocation.getX();
                double currentLocationY = currentLocation.getY();
                double calX = currentScreenLocationX - currentLocationX - frameLocationX;
                double calY = currentScreenLocationY - currentLocationY - frameLocationY;
                int calXInt = (int) calX;
                int calYInt = (int) calY;
                //Limit the moving area of circle
                if(calXInt > 500){ calXInt = 500; }
                if(calXInt < 0){ calXInt = 0; }
                if(calYInt > 250){ calYInt = 250; }
                if(calYInt < 0){ calYInt = 0; }
                Point position = new Point((calXInt), (calYInt-70));
                xInput1.setText(""+(calXInt+radius1));
                yInput1.setText(""+(calYInt+radius1-70));
                radiusInput1.setText(""+(radius1));
                circle.setLocation(position);

                //Get center point of circle
                Point centerCircle = circle.getLocation();
                Point centerCircle1 = circle1.getLocation();
                int x1 = (int) (centerCircle.getX()+radius1);
                int x2 = (int) (centerCircle1.getX()+radius2);
                int y1 = (int) (centerCircle.getY()+radius1);
                int y2 = (int) (centerCircle1.getY()+radius2);

                //Calculate the distance between the center point of circle 1 and 2
                int dx = x2 - x1;
                int dy = y2 - y1;
                int distance = (int)(Math.sqrt((dy*dy)+(dx*dx)));

                //Determine the intersection
                if(distance > (radius1+radius2))
                {
                    titleLabel.setText("Two circle intersect? No");
                }
                else if(distance < Math.abs(radius1 - radius2))
                {
                    titleLabel.setText("Two circle intersect? No");
                }
                else
                {
                    titleLabel.setText("Two circle intersect? Yes");
                }

            }
        });
    }

    public void resetListener1(Circle circle1, JFrame frame, int radius1, int radius2){

        circle1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                currentLocation = e.getPoint();
                //System.out.println(e.getPoint());
            }
        });

        circle1.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                //Get the point when mouse is dragging the circle 2
                Point frameLocation = frame.getLocationOnScreen();
                double frameLocationX = frameLocation.getX();
                double frameLocationY = frameLocation.getY();
                currentScreenLocation = e.getLocationOnScreen();
                double currentScreenLocationX1 = currentScreenLocation.getX();
                double currentScreenLocationY1 = currentScreenLocation.getY();
                double currentLocationX1 = currentLocation.getX();
                double currentLocationY1 = currentLocation.getY();
                double calX1 = currentScreenLocationX1 - currentLocationX1 - frameLocationX;
                double calY1 = currentScreenLocationY1 - currentLocationY1 - frameLocationY;
                int calXInt1 = (int) calX1;
                int calYInt1 = (int) calY1;
                //Limit the moving area of circle
                if(calXInt1 > 500){ calXInt1 = 500; }
                if(calXInt1 < 0){ calXInt1 = 0; }
                if(calYInt1 > 250){ calYInt1 = 250; }
                if(calYInt1 < 0){ calYInt1 = 0; }
                Point position1 = new Point(calXInt1, calYInt1-70);
                xInput2.setText(""+(calXInt1+radius2));
                yInput2.setText(""+(calYInt1+radius2-70));
                radiusInput2.setText(""+(radius2));
                System.out.println(position1);
                circle1.setLocation(position1);

                //Get center point of circle
                Point centerCircle = circle.getLocation();
                Point centerCircle1 = circle1.getLocation();
                int x1 = (int) (centerCircle.getX()+radius1);
                int x2 = (int) (centerCircle1.getX()+radius2);
                int y1 = (int) (centerCircle.getY()+radius1);
                int y2 = (int) (centerCircle1.getY()+radius2);
                int dx = x2 - x1;
                int dy = y2 - y1;
                int distance = (int)(Math.sqrt((dy*dy)+(dx*dx)));

                //Determine the intersection
                if(distance > (radius1+radius2))
                {
                    titleLabel.setText("Two circle intersect? No");
                }
                else if(distance < Math.abs(radius1 - radius2))
                {
                    titleLabel.setText("Two circle intersect? No");
                }
                else
                {
                    titleLabel.setText("Two circle intersect? Yes");
                }
            }
        });
    }

    //Set location of circle
    public void setLocation(Circle circlePassed, int x, int y){
        circlePanelWrapper.setLayout(null);
        Point positionTemp = new Point(x, y);
        //System.out.println(circle);
        System.out.println(positionTemp);
        circlePassed.setLocation(x, y);

    }

}
