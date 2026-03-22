/* Copy the content of one file to another file */

package com.company.filehandeling;
import java.io.*;
class filecopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");
        int c;
        while ((c = fis.read()) != -1) {
            fos.write(c);
        }
            fis.close();
            fos.close();
            System.out.println("File copied successfully");
    }
}
