/* 3.Aim of the program -Write a java program to compare two binary files, printing the first byte position where they differ.
Input: Specify two binary files in the program (Assume two files  are exist in the 			system)
Output: Two files are equal
Input: Specify two binary files in the program
Output: Two files are not equal: byte position at which two files differ is 30
 */

package com.company.filehandeling;
import java.io.*;
class qs3 {
    public static void main(String[] args) {
        String file1 = "file1.bin";   // first binary file
        String file2 = "file2.bin";   // second binary file
            try {
                FileInputStream f1 = new FileInputStream(file1);
                FileInputStream f2 = new FileInputStream(file2);
                int b1, b2;
                int position = 1;
                boolean equal = true;
                while (true) {
                    b1 = f1.read();
                    b2 = f2.read();
                    if (b1 != b2){
                        System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                        equal = false;
                        break;
                    }
                    if (b1 == -1 && b2 == -1){
                        break;
                    }
                    position++;
                }
                if (equal) {
                    System.out.println("Two files are equal");
                }
                f1.close();
                f2.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

