package com.company.filehandeling;

import java.io.IOException;
import java.io.InputStreamReader;

class format2 {
    public static void main(String[] args) throws IOException {
        int d;
        InputStreamReader isr = new InputStreamReader(System.in);
        d = isr.read();
        System.out.println(d);
    }
}
