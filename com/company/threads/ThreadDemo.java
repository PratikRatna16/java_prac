
package com.company.threads;

public class ThreadDemo {
    public static void main(String[] args){
        Thread t;
        t = Thread.currentThread();
        System.out.println("current thread: "+t);
        t.setName("My Thread");
        t.setPriority(11);
        System.out.println(t);
        System.out.println(t.isAlive());
        try{
            Thread.sleep(10000);

            for(int i = 5;i>0;i--) {
                System.out.println("Thread: " + i);
                Thread.sleep(500);
            }}catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

