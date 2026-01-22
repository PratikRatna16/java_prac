package com.company.abstract_class_and_interferance;
interface ABC{
    void display();
    default void show(){
        System.out.println("KIIT");
    }
}
class C1 implements ABC{
    public void display(){
        System.out.println("LAude lag gaye");
    }
    public void show(){
        ABC.super.show();
        System.out.println("HEHE moj kardi");
    }
}
public class test3 {
    public static void main(String[] args){
        ABC c = new C1();

        c.show();
        c.display();
    }
}
