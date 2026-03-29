// 4.Aim of the program -Write a java program which will display all the records from the student table along with the column heading.

package com.company.JDBC;
import java.sql.*;

class qs4 {
    public static void main(String[] args) {
        String url      = "jdbc:mysql://localhost:3306/college";
        String user     = "root";
        String password = "pratik.@16";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs   = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con  = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs   = stmt.executeQuery("SELECT * FROM student");

            ResultSetMetaData meta = rs.getMetaData();
            int colCount = meta.getColumnCount();

            System.out.println("------------------------------------------");
            for (int i = 1; i <= colCount; i++) {
                System.out.printf("%-20s", meta.getColumnName(i));
            }
            System.out.println();
            System.out.println("------------------------------------------");

            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.printf("%-20s", rs.getString(i));
                }
                System.out.println();
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
