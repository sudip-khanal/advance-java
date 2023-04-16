package lab1;

/*
swing program to display hello world in 3 different fonts.
*/
import javax.swing.*;
import java.awt.*;
public class FontsExample extends JFrame {

        public FontsExample() {
            // Set up the JFrame
            setTitle("Fonts");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null);

            // Create the three JLabels with different fonts
            JLabel label1 = new JLabel("Hello World");
            label1.setFont(new Font("Serif", Font.PLAIN, 24));

            JLabel label2 = new JLabel("Hello World");
            label2.setFont(new Font("Monospaced", Font.BOLD, 20));

            JLabel label3 = new JLabel("Hello World");
            label3.setFont(new Font("SansSerif", Font.ITALIC, 28));

            // Create the JPanel and add the labels to it
            JPanel panel = new JPanel();
            panel.add(label1);
            panel.add(label2);
            panel.add(label3);

            // Add the panel to the JFrame
            add(panel);

            // Show the JFrame
            setVisible(true);
        }

        public static void main(String[] args) {
            new FontsExample();
        }
    }


