// 1.Aim of the program -Write a java program which will display all the records from the student table.
package com.company.JDBC;

import java.sql.*;
class qs1 {
    public static void main(String[] args) {
        String tableName = "student";

        String url      = "jdbc:mysql://localhost:3306/college";
        String user     = "root";
        String password = "pratik.@16"; // replace with your MySQL password

        Connection con = null;
        Statement stmt = null;
        ResultSet rs   = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con  = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs   = stmt.executeQuery("SELECT * FROM " + tableName);

            System.out.println("Records from table: " + tableName);
            System.out.println("------------------------------------------");
            System.out.printf("%-10s %-20s %-5s%n", "Roll No", "Name", "Marks");
            System.out.println("------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-10d %-20s %-5d%n",
                        rs.getInt("roll_no"),
                        rs.getString("name"),
                        rs.getInt("marks"));
            }

            System.out.println("------------------------------------------");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (rs   != null) rs.close();
                if (stmt != null) stmt.close();
                if (con  != null) con.close();
            } catch (SQLException e) {
                System.out.println("Close error: " + e.getMessage());
            }
        }
    }
}
