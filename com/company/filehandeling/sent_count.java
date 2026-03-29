/* Write a program to count the no. of sentences present in a file. */

package com.company.filehandeling;
import java.io.*;

class sent_count {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("input.txt");
        int d, count = 0;
        while ((d = fr.read()) != -1) {
            char ch = (char)d;
            if(ch == '?' || ch == '.' || ch == '!'){
                count++;
            }
        }
        System.out.println("The number of sentences is: " + count);
        fr.close();
    }
}

