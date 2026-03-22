package com.company.GUI;
import javax.swing.*;

public class MenuDemo {
    public static void main(String args[]){
        JFrame jf = new JFrame("Menu Demo");
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Save");
        m.add(i1);
        m.add(i2);
        mb.add(m);
        jf.setJMenuBar(mb);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
