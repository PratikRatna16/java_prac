package com.company.filehandeling;

import java.io.*;
class filereader {
    public static void main (String [] args) throws IOException {
        // FileReader is a char stream type

        FileReader fr = new FileReader("input.txt"); // reads the input.txt file charcter wise .
        FileWriter fw = new FileWriter("output.txt"); // copy the content of input.txt file to output.txt
        int d;
        while((d = fr.read()) != -1){
            fw.write(d);
        }
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        br.readLine();
        fr.close();
        fw.close();
    }
}
