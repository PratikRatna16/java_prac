package com.company.GUI;

import java.awt.*;
import javax.swing.*;
class string_Demo {
    public static void main(String args[]){
        JFrame jf = new JFrame(" My First UI");
        jf.setLayout(null);

        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb = new JButton("Click Me");
        jf.add(jb);
        jb.setBounds(500,100,100,100);
    }
}
