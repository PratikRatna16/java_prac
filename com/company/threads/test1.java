package com.company.threads;

class NewThread extends Thread{
    Thread t;
    NewThread(){
        t = new Thread(this,"DemoThread");
    }
    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child thread: "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Child thread interrupted"+e);
        }
    }
}
public class test1 {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        try{
        for(int i=5;i>1;i--){
        System.out.println("Main thread: "+i);
        Thread.sleep(1000);
        }
        } catch(InterruptedException e){
        System.out.println("Main thread interrupted"+e);
        }
    }
    }