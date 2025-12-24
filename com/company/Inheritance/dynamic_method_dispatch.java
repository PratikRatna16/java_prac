package com.company.Inheritance;

class one{
    void greet(){
        System.out.println("Good Morning");
    }
    void name(){
        System.out.println("This is java");
    }
}
class two extends one{
    void nalla(){
        System.out.println("Tum nalle ho yaar");
    }
    @Override
    void name(){
        System.out.println("THis is java in class Two");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args){
//        one o = new one();
//        o.name();
//        two t = new two();
//        t.name();
        one o = new two(); // allowed
        // two t = new one(); // not allowed
        o.greet();
        o.name();


    }
}
