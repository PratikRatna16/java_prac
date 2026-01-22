package com.company.abstract_class_and_interferance;

abstract class animal{
    void sleep(){
        System.out.println("bellowing !! bellowing !!");
    }
    abstract void sound();
}
interface  move{
   void move();
}
class cow extends animal implements move {
    void sound(){
        System.out.println("MOO !! MOO !!");
    }
    void slow(){
        System.out.println("FREW !! FREW!!");
    }
    public void move(){
        System.out.println("Runnnig...... ");
    }
}
public class interface_class {
    public static void main(String[] args){
//        animal a = new cow();
//        a.sleep();
//        a.sound();

        cow c = new cow();
        c.sleep();
        c.sound();
        c.slow();
        c.move();
    }
}
