package com.company.Access_modifier_constructors;

import java.util.Scanner;

public class constructors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myemployee con = new myemployee();
        myemployee con1 = new myemployee(348);
        myemployee con2 = new myemployee("bhosdiwali",349);

        System.out.println("The name is "+con.getname());
        System.out.println("The id is: "+con.getid());

        System.out.println("The id is: "+con1.getid());

        System.out.println("The name is "+con2.getname());
        System.out.println("The id is: "+con2.getid());

    }
}