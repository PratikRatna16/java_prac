package com.company.abstract_class_and_interferance;
interface PQR{
    default void show(){
        System.out.println("HOLLLA");
    }
}
interface SRT{
    default void show(){
        System.out.println("NEW things to know");
    }
}
class moj implements PQR,SRT{
    public void show(){
        System.out.println("LETS see what prints");
    }
}
public class test4 {
    public static void main(String[] args){
        moj m = new moj();
        m.show();
    }
}
