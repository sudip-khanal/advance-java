package lab1;

/*
swing program to display 5 options in a checkbox. when user clicks submit, the selected options should be displayed.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame {
    private JCheckBox option1, option2, option3, option4, option5;
    private JButton submitButton;
    private JLabel resultLabel;

    public CheckBoxDemo() {
        // Set up the JFrame
        setTitle("Checkbox Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the checkboxes
        option1 = new JCheckBox("Option 1");
        option2 = new JCheckBox("Option 2");
        option3 = new JCheckBox("Option 3");
        option4 = new JCheckBox("Option 4");
        option5 = new JCheckBox("Option 5");

        // Create the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = "You selected: ";
                if (option1.isSelected()) {
                    result += "Option 1, ";
                }
                if (option2.isSelected()) {
                    result += "Option 2, ";
                }
                if (option3.isSelected()) {
                    result += "Option 3, ";
                }
                if (option4.isSelected()) {
                    result += "Option 4, ";
                }
                if (option5.isSelected()) {
                    result += "Option 5, ";
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
        new CheckBoxDemo();
    }
}
