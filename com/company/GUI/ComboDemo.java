package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class ComboDemo {
    public static void main(String args[])
    {
        JFrame jf = new JFrame("ComboBox");
        String course[]={"Java","Python","C++"};
        JComboBox cb = new JComboBox(course);
        jf.setLayout(new FlowLayout());
        jf.add(cb);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
