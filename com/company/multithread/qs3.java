/* 3. Aim of the program -Design a Stop Watch using event handling and multi-threading in Java.
     */
package com.company.multithread;
import java.util.Scanner;

    class Stopwatch extends Thread {
        int seconds = 0;
        boolean running = true;
        public void run() {
            try {
                while (running) {
                    Thread.sleep(1000);
                    seconds++;
                    System.out.println(seconds + " Sec");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    class qs3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stopwatch sw = new Stopwatch();
            sw.start();
            System.out.println("Press 's' to stop the stopwatch");
            char ch = sc.next().charAt(0);
            if (ch == 's') {
                sw.running = false;
                System.out.println("Stopwatch stopped");
            }
        }
    }
