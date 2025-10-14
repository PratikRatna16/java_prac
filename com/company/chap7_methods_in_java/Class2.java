package com.company.chap7_methods_in_java;

import java.util.Scanner;

public class Class2 {
    // method of writing function or methods in java using "calling of method by creating object"
    float sum(int x, int y){
        float val;
        if(x>y){
            val = x*y;
        }
        else{
            val = (float)y/x;
        }
        return val;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = s.nextInt();
        System.out.print("Enter value of b: ");
        int b = s.nextInt();
        // ITS HEAP memory method
        Class2 obj = new Class2();// creating object
        float c = obj.sum(a,b);// syntax is to use obj.function name
        System.out.println("value of c: "+c);
    }
}
