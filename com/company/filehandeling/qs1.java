/* 1.Aim of the program - Write a java program which will accept students details like
 Student RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in a file.
  Again open the file, read the content and display all.
Input: Enter student details -   Rollno, name, subject, marks
     Enter the name of existing file to which student details will be written.
Output: Display the content of existing file
 */

package com.company.filehandeling;
import java.io.*;
import java.util.Scanner;
class qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {  // Input student details
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();
                // File name input
                System.out.print("Enter the name of existing file: ");
                String filename = sc.nextLine();
                // Write to file
                FileWriter fw = new FileWriter(filename, true);
                fw.write("Roll No: " + roll + "\n");
                fw.write("Name: " + name + "\n");
                fw.write("Subject: " + subject + "\n");
                fw.write("Marks: " + marks + "\n");
                fw.write("----------------------\n");
                fw.close();
                // Read from file
                System.out.println("\nContent of the file:");
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            sc.close();
        }
    }

