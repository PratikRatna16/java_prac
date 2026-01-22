package com.company.abstract_class_and_interferance;

abstract class payment{
    abstract void pay(double amount);
}
class cash extends payment{
    void pay(double amount){
        System.out.println("amount paid "+amount+" by cash");
    }
}
class upi extends payment{
    void pay(double amount){
        System.out.println("amount paid "+amount+" by UPI");
    }
}
public class abstract_class {
    public static void main(String[] args){
        payment p;
        p = new cash();
        p.pay(500);

        p = new upi();
        p.pay(6000);

    }
}
