package com.company.filehandeling;
import java.io.*;
class printerwritter {
    public static void main(String[] args) throws IOException{
        PrintWriter pw  = new PrintWriter(System.out,true); // it is like a pen means what we write and give a destination(here system,out or terminal)
        // it shows output in terminal.
        pw.write("Java is Strong pl");
        pw.write(10);
        //pw.write(7.5);
        int i = 20;
        pw.printf("The value of i = %d",i);
        pw.close(); // for console, we don't need pw.close when we use PrintWriter , but we use .close when we do changes to a file.
    }
}
