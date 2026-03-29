// Write a program to count the no. of sentence present in a file.
package com.company.filehandeling;
import java.io.*;
import java.io.IOException;

class sent_count2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String text = " ";
        String temp;
        while((temp = br.readLine()) != null) {
            text = text + temp + "";
        }
        String[] sentence = text.split("[. ! ?]");
        System.out.println("Length = "+(sentence.length));
    }
}
