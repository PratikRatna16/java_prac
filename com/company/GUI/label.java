package com.company.GUI;
import java.awt.*;
import javax.swing.*;

class label {
    public static void main(String[] args) {
        JFrame jf = new JFrame("WOh! cool");
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        ImageIcon img = new ImageIcon("stop.jpg");
        JLabel jl1 = new JLabel(img);
        JLabel jl2 = new JLabel("Stop",img,JLabel.CENTER);
        JButton jb = new JButton("Stop");
        jb.setBounds(200,200,200,200);
        jl1.setBounds(0,0,150,150);
        jl2.setBounds(0,160,150,150);
        jf.add(jb);
        jf.add(jl1);
        jf.add(jl2);
        jf.setVisible(true);
    }
}
