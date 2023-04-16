package lab1;

/*
 Swing program Display a button named "Click me" and a counter. Each time the button is clicked, the counter value is increased by 1.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterDemo extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private int count;

    public CounterDemo() {
        // Set up the JFrame
        setTitle("Counter Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create the button and add an ActionListener
        button = new JButton("Click me");
        button.addActionListener(this);

        // Create the counter label
        label = new JLabel("Count: " + count);

        // Create a JPanel and add the button and label to it
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        // Add the JPanel to the JFrame
        add(panel);

        // Show the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Increase the count and update the label
        count++;
        label.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new CounterDemo();
    }
}
