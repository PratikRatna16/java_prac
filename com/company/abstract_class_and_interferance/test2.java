package com.company.abstract_class_and_interferance;
class B{
    interface x{
        void show();
    }
}
class C implements B.x{
    public void show(){
        System.out.println("KIIT");
    }
}
public class test2 {
    public static void main(String[] args){
        C b = new C();
        b.show();
    }
}
