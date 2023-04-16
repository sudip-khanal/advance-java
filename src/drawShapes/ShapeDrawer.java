package drawShapes;

/*
swing program to draw circle, ellipse and a rectangle and fill it with different colors.
*/

import javax.swing.*;
import java.awt.*;

public class ShapeDrawer extends JFrame {
    public ShapeDrawer() {
        setTitle("Shape Drawer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));

        add(new DrawPanel());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShapeDrawer();
            }
        });
    }

    private static class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw circle
            g.setColor(Color.RED);
            g.fillOval(50, 50, 100, 100);

            // Draw ellipse
            g.setColor(Color.GREEN);
            g.fillOval(200, 100, 150, 100);

            // Draw rectangle
            g.setColor(Color.BLUE);
            g.fillRect(100, 250, 200, 100);
        }
    }
}
