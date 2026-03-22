package com.company.GUI;
import javax.swing.*;
public class JButton_Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JButton b = new JButton("Click Me");
        ImageIcon img = new ImageIcon("img.png");
        JButton b1 = new JButton(img);
        jf.add(b);
        jf.add(b1);
        jf.setSize(350, 250);
        jf.setLayout(null); // For manually positioning the components
        b.setBounds(50,20, 120, 50);
        b1.setBounds(200, 220, 130, 70);
         b.setText("Submit");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
