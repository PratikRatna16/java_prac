/* Write a program to create 2 threads performing 2 activity using a userdefined class */
package com.company.threads;

class NewThread1 extends Thread{
    Thread t;
    NewThread1(String s) {
        t = new Thread(this, s);
    }
    public void run(){
        if(t.getName().equals("First")){
            System.out.println("print 100 to 1");
        }else{
            System.out.println("print 1 to 100");
        }
    }
}
class test3 {
    public static void main(String[] args) {
        NewThread1 nt1 = new NewThread1("First");
        NewThread1 nt2 = new NewThread1("Second");

        nt1.start();
        nt2.start();
    }

}
