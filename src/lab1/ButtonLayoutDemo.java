package lab1;

/*
swing program to add some buttons and display them in flow, border and grid layouts.
*/

import javax.swing.*;
import java.awt.*;

public class ButtonLayoutDemo extends JFrame {
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    public ButtonLayoutDemo() {
        // Set up the JFrame
        setTitle("Button Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        button6 = new JButton("Button 6");
        button7 = new JButton("Button 7");
        button8 = new JButton("Button 8");
        button9 = new JButton("Button 9");

        // Create the JPanel and set its layout to FlowLayout
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());
        flowPanel.add(button1);
        flowPanel.add(button2);
        flowPanel.add(button3);

        // Create another JPanel and set its layout to BorderLayout
        JPanel borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(button4, BorderLayout.NORTH);
        borderPanel.add(button5, BorderLayout.SOUTH);
        borderPanel.add(button6, BorderLayout.CENTER);

        // Create a third JPanel and set its layout to GridLayout
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));
        gridPanel.add(button7);
        gridPanel.add(button8);
        gridPanel.add(button9);
        gridPanel.add(new JLabel(""));
        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);
        gridPanel.add(button5);

        // Create a JTabbedPane and add the JPanels to it
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Flow Layout", flowPanel);
        tabbedPane.addTab("Border Layout", borderPanel);
        tabbedPane.addTab("Grid Layout", gridPanel);

        // Add the JTabbedPane to the JFrame
        add(tabbedPane);

        // Show the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonLayoutDemo();
    }
}
