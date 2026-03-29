package com.company.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration extends JFrame implements ActionListener {
    JTextField nameField, mobileField;
    JRadioButton male, female;
    JComboBox<Integer> day, year;
    JComboBox<String> month;
    JTextArea address;
    JCheckBox terms;
    JButton submit, reset;
    JLabel output;

    public Registration() {
        setTitle("Registration Form");
        setSize(500, 500);
        setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(150, 10, 200, 30);
        add(title);

        JLabel name = new JLabel("Name:");
        name.setBounds(30, 50, 100, 20);
        add(name);

        nameField = new JTextField();
        nameField.setBounds(120, 50, 150, 20);
        add(nameField);

        JLabel mobile = new JLabel("Mobile:");
        mobile.setBounds(30, 80, 100, 20);
        add(mobile);

        mobileField = new JTextField();
        mobileField.setBounds(120, 80, 150, 20);
        add(mobileField);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(30, 110, 100, 20);
        add(gender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(120, 110, 70, 20);
        female.setBounds(200, 110, 80, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        JLabel dob = new JLabel("DOB:");
        dob.setBounds(30, 140, 100, 20);
        add(dob);

        Integer[] days = new Integer[31];
        for (int i = 0; i < 31; i++) days[i] = i + 1;

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Integer[] years = new Integer[50];
        for (int i = 0; i < 50; i++) years[i] = 1980 + i;

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);

        day.setBounds(120, 140, 50, 20);
        month.setBounds(180, 140, 60, 20);
        year.setBounds(250, 140, 70, 20);

        add(day);
        add(month);
        add(year);

        JLabel addr = new JLabel("Address:");
        addr.setBounds(30, 170, 100, 20);
        add(addr);

        address = new JTextArea();
        address.setBounds(120, 170, 150, 60);
        add(address);

        terms = new JCheckBox("Accept Terms and Conditions");
        terms.setBounds(30, 240, 250, 20);
        add(terms);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        submit.setBounds(50, 270, 100, 30);
        reset.setBounds(170, 270, 100, 30);

        add(submit);
        add(reset);

        output = new JLabel();
        output.setBounds(30, 320, 400, 100);
        add(output);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String name = nameField.getText();
            String mobile = mobileField.getText();

            // Mobile validation
            if (!mobile.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Mobile must be 10 digits");
                return;
            }

            // DOB validation
            int d = (int) day.getSelectedItem();
            int y = (int) year.getSelectedItem();

            int m = month.getSelectedIndex() + 1;

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date selectedDate = sdf.parse(d + "-" + m + "-" + y);
                Date limitDate = sdf.parse("01-01-2010");

                if (!selectedDate.before(limitDate)) {
                    JOptionPane.showMessageDialog(this, "DOB must be before 1 Jan 2010");
                    return;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            if (!terms.isSelected()) {
                JOptionPane.showMessageDialog(this, "Accept terms first");
                return;
            }

            String gender = male.isSelected() ? "Male" : "Female";

            String data = "Name: " + name +
                    ", Mobile: " + mobile +
                    ", Gender: " + gender;

            output.setText(data);
        }

        if (e.getSource() == reset) {
            nameField.setText("");
            mobileField.setText("");
            address.setText("");
            terms.setSelected(false);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Registration();
    }
}
