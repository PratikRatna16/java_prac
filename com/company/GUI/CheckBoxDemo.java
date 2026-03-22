package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class CheckBoxDemo {
    public static void main(String args[]) {
        JFrame jf = new JFrame("CheckBox");
        JCheckBox c1 = new JCheckBox("Programming using Java");
        JCheckBox c2 = new JCheckBox("Programming in C++");
        JCheckBox c3 = new JCheckBox("Programming in Python");
        jf.setLayout(new FlowLayout());
        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.setSize(300, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
