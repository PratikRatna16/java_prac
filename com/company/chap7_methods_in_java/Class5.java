package com.company.chap7_methods_in_java;

import java.util.Scanner;

public class Class5 {
    static int facto(int x){
        if(x == 1) return 1;
        return x * facto(x-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value 'n' for factorial: ");
        int n = s.nextInt();
        System.out.println("The Factorial is: " + facto(n));
    }
}
