package com.company.filehandeling;

import java.io.*;

class bytestream_demo2 {
    public static void main(String[] args) throws IOException {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");

        int d;
        try{
            while((d = fis.read()) != -1){
                fout.write(d);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            fis.close();
            fout.close();
        }

    }
}
