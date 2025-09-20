package com.company.chap6_arrays;

import java.util.Scanner;

public class Class2 {

        public static void main (String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int n =s.nextInt();
            int [] array = new int[n];
            System.out.print("Enter the elements in array: ");
            for(int i=0;i<n;i++){
                array[i] = s.nextInt();
            }
            System.out.print("The array is: ");
            for(int i=0;i<n;i++){
                System.out.print(array[i] + " ");
            }
        }
    }

