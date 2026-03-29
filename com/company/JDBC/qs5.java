/* 5.Aim of the program -Design an interface as shown below using Frame and Swing in Java
Here the user will write a query in the text field and then click on the execute query button.
 The output of the query will be displayed on another hidden text area.
*/
package com.company.JDBC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class qs5 extends JFrame implements ActionListener {
    JTextField queryField;
    JTextArea  resultArea;
    JButton    executeBtn;
    JLabel     queryLabel;

    String url      = "jdbc:mysql://localhost:3306/college";
    String user     = "root";
    String password = "pratik.@16";

    qs5() {
        setTitle("SQL Query Executor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Top panel - query input
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        queryLabel = new JLabel("Enter Query:");
        queryField = new JTextField();
        executeBtn = new JButton("Execute Query");

        executeBtn.addActionListener(this);

        topPanel.add(queryLabel,  BorderLayout.NORTH);
        topPanel.add(queryField,  BorderLayout.CENTER);
        topPanel.add(executeBtn,  BorderLayout.EAST);
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

        // Bottom panel - result display
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Query Output"));

        add(topPanel,   BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String query = queryField.getText().trim();
        if (query.isEmpty()) {
            resultArea.setText("Please enter a query.");
            return;
        }
        Connection con  = null;
        Statement  stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            // Check if SELECT or DML
            if (query.toLowerCase().startsWith("select")) {
                ResultSet rs = stmt.executeQuery(query);
                ResultSetMetaData meta = rs.getMetaData();
                int colCount = meta.getColumnCount();
                StringBuilder sb = new StringBuilder();
                // Column headers
                for (int i = 1; i <= colCount; i++) {
                    sb.append(String.format("%-20s", meta.getColumnName(i)));
                }
                sb.append("\n");
                sb.append("-".repeat(colCount * 20)).append("\n");
                // Rows
                while (rs.next()) {
                    for (int i = 1; i <= colCount; i++) {
                        sb.append(String.format("%-20s", rs.getString(i)));
                    }
                    sb.append("\n");
                }
                resultArea.setText(sb.toString());
                rs.close();
            } else {
                int rows = stmt.executeUpdate(query);
                resultArea.setText(rows + " record(s) affected.");
            }
        } catch (ClassNotFoundException ex) {
            resultArea.setText("Driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            resultArea.setText("SQL Error: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con  != null) con.close();
            } catch (SQLException ex) {
                resultArea.setText("Close error: " + ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        new qs5();
    }
}
