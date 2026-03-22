/* 2.Aim of the program -Write a program in java which will display
 the working of two threads in synchronization. */
package com.company.threads;

class ABC{
     synchronized void xyz(String message) {
        System.out.print("[ " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print(" ]");
    }
}
class sync_thread implements Runnable {
    Thread t;
    String s;
    ABC ab;

    sync_thread(ABC t1, String s1) {
        this.s = s1;
        ab = t1;
        t = new Thread(this);
    }

    public void run() {
        synchronized (ab) {
            ab.xyz(s);
        }
    }
}
public class syncronization {
    public static void main(String[] args){
        ABC t1 = new ABC();
        sync_thread t12 = new sync_thread(t1, "Hello");
        sync_thread t13 = new sync_thread(t1, "World");
        sync_thread t14 = new sync_thread(t1, "KIIT");
        t12.t.start();
        t13.t.start();
        t14.t.start();
    }
}
