package com.company.abstract_class_and_interferance;
interface i1{
    void show();
}
interface i2{
    void display();
}
class A implements i1,i2{
    public void show(){
        System.out.println("KIIT");
    }
    public void display(){
        System.out.println("CSE");
    }
}
public class try_test {
    public static void main(String[] args){
        A a = new A();
        a.show();
        a.display();
    }
}
