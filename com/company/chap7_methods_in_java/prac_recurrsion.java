package com.company.chap7_methods_in_java;

import java.util.Scanner;

public class prac_recurrsion {
    static void fibona(int n,int x, int y){
        if(n == 0){
            return; }
        System.out.print(y+" ");
        x = y-x;
        y = x + y;
        n = n-1;
        fibona(n,x,y);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int i = 0;
        int t = 1;
        System.out.print("The Fibonacci number is: 1 ");
        fibona(n,i,t);
    }
}
