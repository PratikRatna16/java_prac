package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class RadioDemo {
    public static void main(String args[]) {
        JFrame jf = new JFrame("Radio Button");
        JRadioButton r1 = new JRadioButton("B.Sc.");
        JRadioButton r2 = new JRadioButton("B.Tech.");
        JRadioButton r3 = new JRadioButton("M.Tech");

        ButtonGroup bg = new ButtonGroup(); // This group ensures that only one selection can be done
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        jf.setLayout(new FlowLayout());
        jf.add(r1);
        jf.add(r2);
        jf.add(r3);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
