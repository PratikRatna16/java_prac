/* 3.Aim of the program -Implement a GUI application which consists of one List Box and one button.
 The list box will have four different color names. When the user will select a color from the list box
 and click on the button, the panel color will be changed to that color.
Input: Select any color from the list box
Output: Panel background color will be changed accordingly */

package com.company.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class qs3 {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Color Selector");
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // List Box (JList)
            String colors[] = {"Red", "Green", "Blue", "Yellow"};
            JList<String> list = new JList<>(colors);
            list.setBounds(50, 30, 100, 80);
            frame.add(list);
            // Button
            JButton btn = new JButton("Change Color");
            btn.setBounds(200, 50, 150, 30);
            frame.add(btn);
            // Panel
            JPanel panel = new JPanel();
            panel.setBounds(50, 150, 300, 80);
            panel.setBackground(Color.WHITE);
            frame.add(panel);
            // Button Action
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String selected = list.getSelectedValue();

                    if (selected != null) {
                        switch (selected) {
                            case "Red":
                                panel.setBackground(Color.RED);
                                break;
                            case "Green":
                                panel.setBackground(Color.GREEN);
                                break;
                            case "Blue":
                                panel.setBackground(Color.BLUE);
                                break;
                            case "Yellow":
                                panel.setBackground(Color.YELLOW);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a color");
                    }
                }
            });
            frame.setVisible(true);
        }
    }