package com.company.GUI;
import java.awt.*;
import javax.swing.*;
class FrameFormat {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Direction");
        jf.setLayout(null);

        //jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setLayout(new BorderLayout());
        JButton jb1 = new JButton("WEST");
        JButton jb2 = new JButton("NORTH");
        JButton jb3 = new JButton("EAST");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.add(jb1,BorderLayout.WEST);
        jf.add(jb2,BorderLayout.NORTH);
        jf.add(jb3,BorderLayout.EAST);

       // jf.setLayout(new GridLayout(2,3,5,5));
        jf.setVisible(true);
    }

}
