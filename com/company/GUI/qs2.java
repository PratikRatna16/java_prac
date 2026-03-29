/* 2.Aim of the program -Write a GUI program in Java with three Labels –
Enter the First Number, Enter the Second Number, Result, and three text fields for  -
 first number, second number and result and four buttons - Add, Sub, multiply and reset as shown below.
  On clicking of any of these buttons, the corresponding operation should be performed with input1 and input2 and
   the result should be displayed in the result box.
Input: First and second number
Output: Appropriate result will be displayed in the result text field */

package com.company.GUI;
import javax.swing.*;
import java.awt.event.*;

class qs2 {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Simple Calculator");
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Labels
            JLabel l1 = new JLabel("Enter First Number:");
            l1.setBounds(50, 30, 150, 25);
            frame.add(l1);

            JLabel l2 = new JLabel("Enter Second Number:");
            l2.setBounds(50, 70, 150, 25);
            frame.add(l2);

            JLabel l3 = new JLabel("Result:");
            l3.setBounds(50, 110, 150, 25);
            frame.add(l3);
            // TextFields
            JTextField t1 = new JTextField();
            t1.setBounds(200, 30, 120, 25);
            frame.add(t1);

            JTextField t2 = new JTextField();
            t2.setBounds(200, 70, 120, 25);
            frame.add(t2);

            JTextField t3 = new JTextField();
            t3.setBounds(200, 110, 120, 25);
            t3.setEditable(false);
            frame.add(t3);
            // Buttons
            JButton add = new JButton("Add");
            add.setBounds(50, 160, 80, 30);
            frame.add(add);

            JButton sub = new JButton("Sub");
            sub.setBounds(140, 160, 80, 30);
            frame.add(sub);

            JButton mul = new JButton("Multiply");
            mul.setBounds(230, 160, 100, 30);
            frame.add(mul);

            JButton reset = new JButton("Reset");
            reset.setBounds(140, 200, 80, 30);
            frame.add(reset);
            // Action Listeners
            add.addActionListener(e -> {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a + b));
            });
            sub.addActionListener(e -> {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a - b));
            });
            mul.addActionListener(e -> {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a * b));
            });
            reset.addActionListener(e -> {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            });
            frame.setVisible(true);
        }
    }