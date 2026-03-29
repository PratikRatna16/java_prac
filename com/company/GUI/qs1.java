/* 1.Aim of the program - Write a java program which will accept students details like Student RollNo, Name, Subject, Marks
 from the keyboard using scanner class, stored the same in a file. Again open the file, read the content and display all.
Input: Enter student details -   Rollno, name, subject, marks
       	   Enter the name of existing file to which student details will be written.
Output: Display the content of existing file */

package com.company.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class qs1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RegistrationForm");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Label + TextField (Name)
            JLabel nameLabel = new JLabel("Name:");
            nameLabel.setBounds(50, 50, 100, 30);
            frame.add(nameLabel);
            JTextField nameField = new JTextField();
            nameField.setBounds(150, 50, 200, 30);
            frame.add(nameField);
            // Label + TextField (Email)
            JLabel emailLabel = new JLabel("Email:");
            emailLabel.setBounds(50, 100, 100, 30);
            frame.add(emailLabel);
            JTextField emailField = new JTextField();
            emailField.setBounds(150, 100, 200, 30);
            frame.add(emailField);
            // TextArea (Address)
            JLabel addressLabel = new JLabel("Address:");
            addressLabel.setBounds(50, 150, 100, 30);
            frame.add(addressLabel);
            JTextArea addressArea = new JTextArea();
            addressArea.setBounds(150, 150, 200, 60);
            frame.add(addressArea);
            // Radio Buttons (Gender)
            JLabel genderLabel = new JLabel("Gender:");
            genderLabel.setBounds(50, 230, 100, 30);
            frame.add(genderLabel);
            JRadioButton male = new JRadioButton("Male");
            male.setBounds(150, 230, 80, 30);
            JRadioButton female = new JRadioButton("Female");
            female.setBounds(230, 230, 100, 30);
            ButtonGroup bg = new ButtonGroup();
            bg.add(male);
            bg.add(female);
            frame.add(male);
            frame.add(female);
            // CheckBox (Hobbies)
            JLabel hobbyLabel = new JLabel("Hobbies:");
            hobbyLabel.setBounds(50, 280, 100, 30);
            frame.add(hobbyLabel);
            JCheckBox reading = new JCheckBox("Reading");
            reading.setBounds(150, 280, 100, 30);
            JCheckBox sports = new JCheckBox("Sports");
            sports.setBounds(250, 280, 100, 30);
            frame.add(reading);
            frame.add(sports);
            // Image
            ImageIcon icon = new ImageIcon("image.jpg"); // put image in same folder
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setBounds(350, 20, 100, 100);
            frame.add(imageLabel);
            // Button
            JButton submit = new JButton("Submit");
            submit.setBounds(180, 350, 100, 40);
            frame.add(submit);
            // Button Action
            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String email = emailField.getText();
                    String address = addressArea.getText();
                    String gender = "";
                    if (male.isSelected()) gender = "Male";
                    if (female.isSelected()) gender = "Female";
                    String hobbies = "";
                    if (reading.isSelected()) hobbies += "Reading ";
                    if (sports.isSelected()) hobbies += "Sports";
                    JOptionPane.showMessageDialog(frame,
                            "Name: " + name +
                                    "\nEmail: " + email +
                                    "\nAddress: " + address +
                                    "\nGender: " + gender +
                                    "\nHobbies: " + hobbies);
                }
            });
            frame.setVisible(true);
        }
    }