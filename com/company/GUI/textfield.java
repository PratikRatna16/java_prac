package com.company.GUI;
import java.awt.*;
import javax.swing.*;
class textfield {
    public static void main(String args[]){
        JFrame jf = new JFrame("UI");
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        JTextField jft = new JTextField(20);
        JTextField jft1 = new JTextField("Enter Name");
        jft.setBounds(400,100,200,200);
        jft1.setBounds(400,400,200,200);
        jf.add(jft);
        jf.add(jft1);
        jf.setVisible(true);

    }
}
