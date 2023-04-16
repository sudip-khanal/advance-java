package lab1;

/*
swing program to display 5 options in a radio button. when user clicks submit, the selected option should be displayed.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame {
    private JRadioButton option1, option2, option3, option4, option5;
    private JButton submitButton;
    private JLabel resultLabel;

    public RadioButtonDemo() {
        // Set up the JFrame
        setTitle("Radio Button Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the radio buttons
        option1 = new JRadioButton("Option 1");
        option2 = new JRadioButton("Option 2");
        option3 = new JRadioButton("Option 3");
        option4 = new JRadioButton("Option 4");
        option5 = new JRadioButton("Option 5");

        // Create the radio button group
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        group.add(option5);

        // Create the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = "You selected: ";
                if (option1.isSelected()) {
                    result += "Option 1";
                } else if (option2.isSelected()) {
                    result += "Option 2";
                } else if (option3.isSelected()) {
                    result += "Option 3";
                } else if (option4.isSelected()) {
                    result += "Option 4";
                } else if (option5.isSelected()) {
                    result += "Option 5";
                }
                resultLabel.setText(result);
            }
        });

        // Create the result label
        resultLabel = new JLabel("");

        // Create the JPanel and add the components to it
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);
        panel.add(option5);
        panel.add(submitButton);
        panel.add(resultLabel);

        // Add the panel to the JFrame
        add(panel);

        // Show the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
