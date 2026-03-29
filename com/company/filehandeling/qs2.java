/* 2.Aim of the program - Write a program in Java to copy the content of a given file to another user entered file
using character stream (using File Reader and FileWriter Classes)  and byte Stream (using FileInputStream and FileOutputStream Class).
    Input: Enter the source file name -  sourcefile.txt  (Assume Input file exists in the system)
    Enter the destination file name -   destinationfile.txt
    Output: File Copied */

package com.company.filehandeling;
import java.io.*;
import java.util.Scanner;
class qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try { // Taking file names
                System.out.print("Enter source file name: ");
                String source = sc.nextLine();
                System.out.print("Enter destination file name: ");
                String destination = sc.nextLine();
                // -------- Character Stream Copy --------
                FileReader fr = new FileReader(source);
                FileWriter fw = new FileWriter(destination);
                int ch;
                while ((ch = fr.read()) != -1) {
                    fw.write(ch);
                }
                fr.close();
                fw.close();
                System.out.println("File copied using Character Stream.");
                // -------- Byte Stream Copy --------
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(destination, true);
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
                fis.close();
                fos.close();
                System.out.println("File copied using Byte Stream.");
                System.out.println("Output: File Copied");
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            sc.close();
        }
    }
