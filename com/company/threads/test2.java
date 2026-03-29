package com.company.threads;

class createthread extends Thread{
    createthread(){
        super("Demo Thread");
        System.out.println("child Thread"+this);
    }
    public void run(){
        try{
            for(int i=10;i>0;i--){
                System.out.println("child Thread "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class test2 {
    public static void main(String[] args){
        createthread nt = new createthread();
        nt.start();
    }
}
