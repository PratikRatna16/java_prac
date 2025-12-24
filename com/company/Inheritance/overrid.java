package com.company.Inheritance;

class A{
    int a;
    int meth1(){
        return 5;
    }
    void meth2(){
        System.out.println("This is the method of class A");
    }
}
class B extends A{
    @Override
    void meth2(){
        System.out.println("This the method of class B");
    }
}
public class overrid {
    public static void main(String[] args){
        A a = new A();
       // super.meth3();
      //  System.out.println("THe value of 1st method: "+a.meth1());
         // a.meth2();
        B b = new B();
        b.meth2();
    }
}
