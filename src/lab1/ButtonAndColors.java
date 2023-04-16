package lab1;

/*
swing program to display hello world. Provide 3 buttons named red, blue and black. On clicking the buttons, the color of the text should change to the respective color.
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAndColors extends JFrame{
    private JLabel label;

    public ButtonAndColors() {
        // Set up the JFrame
        setTitle("Color Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the JLabel with the text "Hello World"
        label = new JLabel("Hello World");
        label.setFont(new Font("Serif", Font.PLAIN, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // Create the JPanel and add the label to it
        JPanel panel = new JPanel();
        panel.add(label);

        // Create the three buttons
        JButton redButton = new JButton("Red");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });

        JButton blueButton = new JButton("Blue");
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLUE);
            }
        });

        JButton blackButton = new JButton("Black");
        blackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLACK);
            }
        });

        // Add the buttons to the JPanel
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(blackButton);

        // Add the panel to the JFrame
        add(panel);

        // Show the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonAndColors();
    }
}
