package com.company.GUI;
import javax.swing.*;
import java.awt.*;
public class TextFieldDemo {
    public static void main(String args[])
    {
        JFrame jf = new JFrame("TextField");
        JTextField t = new JTextField(20);

        JTextField t1=new JTextField("Enter Number");
        JTextField t2=new JTextField("Enter Number",20);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.add(t);
        jf.add(t1);
        jf.add(t2);
        String s=t.getText();
        System.out.println(s);// This will print nothing as event handling has not been added.
            // JTextArea
            JTextArea jta= new JTextArea(5,20);
        jf.add(jta);
            //JPasswordField - * will be displayed while typing
        JPasswordField jpf= new JPasswordField(20);
        jf.add(jpf);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
