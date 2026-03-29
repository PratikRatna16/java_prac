package com.company.GUI;
import javax.swing.*;
import java.awt.*;
class imagebutton {
    public static void main(String[] args) {
        JFrame jf  = new JFrame();
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        ImageIcon img = new ImageIcon("stop.jpg");
        JButton bt  =  new JButton(img);
        JToggleButton tb  = new JToggleButton("on/off");
        bt.setBounds(0, 0, 150, 150);
        tb.setBounds(0, 160, 100, 50);
        jf.add(bt,BorderLayout.NORTH);
        jf.add(tb,BorderLayout.CENTER);
        jf.setVisible(true);

    }
}
