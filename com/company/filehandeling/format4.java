package com.company.filehandeling;

import java.io.*;
import java.sql.SQLOutput;


class format4 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        System.out.println(br.readLine());
        br.close();

        BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        System.out.println(bis.readLine());
        bis.close();
    }
}
