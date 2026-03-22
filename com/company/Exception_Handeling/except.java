/* 1.Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException
and handle it using catch statement.
Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread"main" java.lang.ArrayIndexOutOfBoundsException:4  */

package com.company.Exception_Handeling;

import java.util.Scanner;

class except{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements: ");

        try{
            for(int i = 0;i<=n;i++){
                array[i] = sc.nextInt();
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("Exception handled");
    }
}
