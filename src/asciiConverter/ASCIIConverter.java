package asciiConverter;

/*
swing program Display a text area in a frame and print the ASCII value for each character that the user enters.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASCIIConverter extends JFrame {
    private JTextArea textArea;

    public ASCIIConverter() {
        setTitle("ASCII Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        add(scrollPane, BorderLayout.CENTER);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textArea.getText();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    int ascii = (int) c;
                    result.append(c).append(" : ").append(ascii).append("\n");
                }
                JOptionPane.showMessageDialog(ASCIIConverter.this, result.toString(), "ASCII Conversion", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(convertButton, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ASCIIConverter();
            }
        });
    }
}
