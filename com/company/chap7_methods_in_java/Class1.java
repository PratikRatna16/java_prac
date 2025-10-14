package com.company.chap7_methods_in_java;

import java.util.Scanner;

public class Class1 {
    // method of writing function or methods in java using "STATIC
    // // static memory method"
    static float sum(int x, int y){
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
        float c = sum(a,b);
        System.out.println("value of c: "+c);
    }
}
