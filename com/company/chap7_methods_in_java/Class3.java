package com.company.chap7_methods_in_java;

import java.util.Scanner;

public class Class3 {
    static void changes(int [] arr){
        arr[0] = 50;// changing the original value of arr[0].
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // IN case of array, reference is passed
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter value of array: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        changes(arr);
        System.out.println("\nThe value of the arr[0] after changes it is " + arr[0]);
    }
}
