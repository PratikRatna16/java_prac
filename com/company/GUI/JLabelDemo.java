package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class JLabelDemo {
    public static void main(String args[])
    {
        JFrame jf = new JFrame("JLabel Demo");

        jf.setLayout(new FlowLayout());

        JLabel l = new JLabel("Welcome to Java Swing",JLabel.RIGHT);

        l.setForeground(Color.RED);
//Adding Image to a Label
        ImageIcon img=new ImageIcon("img.png");
        JLabel l1 = new JLabel("Stop",img,JLabel.LEFT);

        jf.add(l);
        jf.add(l1);
        l1.setBounds(50,50,50,50);
        String s=l.getText();
        System.out.println(s);

        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
