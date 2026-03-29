/* 2.Aim of the program - Write a java program which will display a particular record from the student table
 on the basis of RollNo supplied from the keyboard. */

package com.company.JDBC;
import java.sql.*;
import java.util.Scanner;
class qs2 {
    public static void main(String[] args) {
        String url      = "jdbc:mysql://localhost:3306/college";
        String user     = "root";
        String password = "pratik.@16";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs   = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con  = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs   = stmt.executeQuery("SELECT * FROM student WHERE roll_no = " + rollNo);

            if (rs.next()) {
                System.out.println("------------------------------------------");
                System.out.printf("%-10s %-20s %-5s%n", "Roll No", "Name", "Marks");
                System.out.println("------------------------------------------");
                System.out.printf("%-10d %-20s %-5d%n",
                        rs.getInt("roll_no"),
                        rs.getString("name"),
                        rs.getInt("marks"));
                System.out.println("------------------------------------------");
            } else {
                System.out.println("No record found for Roll No: " + rollNo);
            }

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

        sc.close();
    }
}
