/* 4.Aim of the program -Design a GUI application which consists of three Label named as
Red, Green and blue, three combo boxes which will consist the value from 0 to 255 and one button named as show output.
 The user will select different values from three combo boxes. When the user clicks on the button,
 the panel background will be changed accordingly as per the value passed in RGB format.
	Input: select three color value(0-255) from 3 different combo box.
	Output: The panel color will be changed accordingly  */

package com.company.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class qs4 {
        public static void main(String[] args) {
            JFrame frame = new JFrame("RGB Color Selector");
            frame.setSize(450, 350);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Labels
            JLabel l1 = new JLabel("Red:");
            l1.setBounds(50, 30, 100, 25);
            frame.add(l1);

            JLabel l2 = new JLabel("Green:");
            l2.setBounds(50, 70, 100, 25);
            frame.add(l2);

            JLabel l3 = new JLabel("Blue:");
            l3.setBounds(50, 110, 100, 25);
            frame.add(l3);

            // ComboBox values (0–255)
            Integer values[] = new Integer[256];
            for (int i = 0; i < 256; i++) {
                values[i] = i;
            }
            JComboBox<Integer> cbRed = new JComboBox<>(values);
            cbRed.setBounds(150, 30, 100, 25);
            frame.add(cbRed);

            JComboBox<Integer> cbGreen = new JComboBox<>(values);
            cbGreen.setBounds(150, 70, 100, 25);
            frame.add(cbGreen);

            JComboBox<Integer> cbBlue = new JComboBox<>(values);
            cbBlue.setBounds(150, 110, 100, 25);
            frame.add(cbBlue);

            // Button
            JButton btn = new JButton("Show Output");
            btn.setBounds(150, 160, 130, 30);
            frame.add(btn);

            // Panel
            JPanel panel = new JPanel();
            panel.setBounds(50, 210, 300, 80);
            panel.setBackground(Color.WHITE);
            frame.add(panel);
            // Button Action
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    int r = (int) cbRed.getSelectedItem();
                    int g = (int) cbGreen.getSelectedItem();
                    int b = (int) cbBlue.getSelectedItem();
                    Color color = new Color(r, g, b);
                    panel.setBackground(color);
                }
            });
            frame.setVisible(true);
        }
    }