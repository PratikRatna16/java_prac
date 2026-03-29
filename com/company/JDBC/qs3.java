/* 3.Aim of the program - Write a java program which will insert a record, update and delete
a particular record in the student table.
	Input :		Enter rollno to be inserted : 2205650
			Enter name	: Aditya Bajaj
			Enter marks	 : 93
	Output : 	1 record inserted */

package com.company.JDBC;
import java.sql.*;
import java.util.Scanner;
class qs3 {
    public static void main(String[] args) {
        String url      = "jdbc:mysql://localhost:3306/college";
        String user     = "root";
        String password = "pratik.@16";
        Scanner sc = new Scanner(System.in);
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            // INSERT
            System.out.print("Enter rollno to be inserted: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            int inserted = stmt.executeUpdate(
                    "INSERT INTO student VALUES (" + rollNo + ", '" + name + "', " + marks + ")"
            );
            System.out.println(inserted + " record inserted");
            // UPDATE
            System.out.print("\nEnter rollno to update: ");
            int updateRoll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();
            int updated = stmt.executeUpdate(
                    "UPDATE student SET name='" + newName + "', marks=" + newMarks +
                            " WHERE roll_no=" + updateRoll
            );
            System.out.println(updated + " record updated");
            // DELETE
            System.out.print("\nEnter rollno to delete: ");
            int deleteRoll = sc.nextInt();
            int deleted = stmt.executeUpdate(
                    "DELETE FROM student WHERE roll_no=" + deleteRoll
            );
            System.out.println(deleted + " record deleted");
            stmt.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Close error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
