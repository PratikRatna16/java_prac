/* 4.Aim of the program -Write a java program that displays the number of characters, no. of lines and no. of words
 present in a text file whose name is given by the user.
	Input: Name of the file - filename
	Output: No. of characters - A,
		    No .of  lines  - B
		    No . of words - C
 */

package com.company.filehandeling;
import java.io.*;
import java.util.Scanner;
class qs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();

        int characters = 0;
        int lines = 0;
        int words = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                lines++; // count line
                characters += line.length(); // count characters
                String wordArray[] = line.split("\\s+"); // split words
                words += wordArray.length;
            }
            br.close();
            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}
