package lab1;
/*
a swing program to display an image
*/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageShow extends JFrame{

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Acer\\Downloads\\download.png");
        BufferedImage bufferedImage = ImageIO.read(file);


        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();


        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();


        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
