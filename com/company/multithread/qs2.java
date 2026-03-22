/* 2. Aim of the program - Write a program in Java
which will display the working of two threads in synchronization.
*/

package com.company.multithread;

    class Display {
        String sentence = "I Love Java Very Much";
        String[] words = sentence.split(" ");
        synchronized void show(String name) {
            for (String word : words) {
                System.out.println("Thread " + name + " : " + word);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
            System.out.println();
        }
    }
    class MyThread extends Thread {
        Display d;
        MyThread(Display d, String name) {
            this.d = d;
            setName(name);
        }
        public void run() {
            d.show(getName());
        }
    }
    class qs2 {
        public static void main(String[] args) {
            Display d = new Display();
            MyThread t1 = new MyThread(d, "One");
            MyThread t2 = new MyThread(d, "Two");
            t1.start();
            t2.start();
        }
    }
