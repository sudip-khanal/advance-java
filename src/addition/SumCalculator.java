package addition;

/*
swing program that asks the user two numbers and on clicking a button, it displays the sum of the two numbers.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton sumButton;
    private JLabel resultLabel;

    public SumCalculator() {
        setTitle("Sum Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        sumButton = new JButton("Sum");
        resultLabel = new JLabel();

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter integers only.");
                }
            }
        });

        add(new JLabel("Enter number 1:"));
        add(num1Field);
        add(new JLabel("Enter number 2:"));
        add(num2Field);
        add(sumButton);
        add(resultLabel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SumCalculator();
            }
        });
    }
}
