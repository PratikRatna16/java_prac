package com.company.filehandeling;

import java.io.FileInputStream;
import java.io.IOException;

class ByteStream_demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        int d;
        while ((d = fis.read()) != -1) {
            System.out.print((char) d);
        }
        fis.close();
    }
}