package com.company.Inheritance;

class animal{
    void feature(){
        System.out.println("These are 4 leged animal");
        System.out.println("Eats meat");
    }
}
class dog extends animal{
    void voice(){
        System.out.println("It barks: WOOF WOOF !!!");
        System.out.println("This is friend of human , DOG");
    }
}
public class kingdom {
    public static void main(String[] args){
        dog shiro = new dog();
        shiro.feature();
        shiro.voice();
    }
}
