package com.circle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainFrame extends JFrame {

    Point currentLocation;
    Point currentScreenLocation;
    private Object Rectangle;

    public MainFrame(){

        super("Circle Generator");
        initUI();

    }

    public void initUI(){

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

        titlePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        Circle circle = new Circle();
        Circle circle1 = new Circle();

        //mainFrame.setLayout(new GridBagLayout());
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        mainFrame.setBackground(Color.WHITE);
        mainFrame.setSize(600, 600);

        titleLabel.setText("Two circle intersect? NO");
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);
        titlePanel.setPreferredSize(new Dimension(50, 50));
        titlePanel.setVisible(true);
        titlePanel.setBackground(Color.blue);
        titlePanel.setSize(600, 100);

        //Circle Panel Wrapper
        //circlePanel.setPreferredSize(new Dimension(50, 400));
        circlePanelWrapper.setLayout(new GridLayout(1,2));
        circlePanelWrapper.add(circle);
        circlePanelWrapper.add(circle1);
        circlePanelWrapper.setBounds(0, 0, 600, 100);
        circlePanelWrapper.setVisible(true);
        //circlePanelWrapper.setBackground(Color.RED);
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
        //mainFrame.add(circlePanelWrapper, BorderLayout.CENTER);
        mainFrame.add(footerPanel, BorderLayout.SOUTH);

        circle.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                currentLocation = e.getPoint();
                //System.out.println(e.getPoint());
            }
        });

        circle.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                currentScreenLocation = e.getLocationOnScreen();
                //System.out.println(e.getLocationOnScreen());
                double currentScreenlocationX = currentScreenLocation.getX();
                double currentScreenlocationY = currentScreenLocation.getY();
                double currentLocationX = currentLocation.getX();
                double currentLocationY = currentLocation.getY();
                double calX = currentScreenlocationX - currentLocationX;
                double calY = currentScreenlocationY - currentLocationY;
                int calXInt = (int) calX;
                int calYInt = (int) calY;
                if(calXInt > 550){ calXInt = 500; }
                if(calYInt > 550){ calYInt = 500; }
                Point position = new Point(calXInt, calYInt-70);
                System.out.println(position);
                circle.setLocation(position);
                Rectangle bounds = circle.getBounds();
                Rectangle bounds1 = circle1.getBounds();

                if(bounds.intersects(bounds1)){
                    System.out.println("intersects");
                    //titleLabel.setText("Two circle intersect? Yes");
                }else{
                    //titleLabel.setText("Two circle intersect? NOO");
                }

            }
        });

        circle1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                currentLocation = e.getPoint();
                //System.out.println(e.getPoint());
            }
        });

        circle1.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                currentScreenLocation = e.getLocationOnScreen();
                //System.out.println(e.getLocationOnScreen());
                double currentScreenlocationX1 = currentScreenLocation.getX();
                double currentScreenlocationY1 = currentScreenLocation.getY();
                double currentLocationX1 = currentLocation.getX();
                double currentLocationY1 = currentLocation.getY();
                double calX1 = currentScreenlocationX1 - currentLocationX1;
                double calY1 = currentScreenlocationY1 - currentLocationY1;
                int calXInt1 = (int) calX1;
                int calYInt1 = (int) calY1;
                if(calXInt1 > 550){ calXInt1 = 500; }
                if(calYInt1 > 550){ calYInt1 = 500; }
                Point position1 = new Point(calXInt1, calYInt1-70);
                System.out.println(position1);
                circle1.setLocation(position1);

                Rectangle bounds = circle.getBounds();
                Rectangle bounds1 = circle1.getBounds();

                if(bounds.intersects(bounds1)){
                    System.out.println("intersects");
                    //titleLabel.setText("Two circle intersect? Yes");
                }else{
                    //titleLabel.setText("Two circle intersect? NOO");
                }

            }
        });

    }

}
