package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class ListDemo {
    public static void main(String args[])
    {
        JFrame jf = new JFrame("JList Example");
        String course[] = {"Java","Python","C++","JavaScript"};
        JList list = new JList(course);
        jf.setLayout(new FlowLayout());
        jf.add(list);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
