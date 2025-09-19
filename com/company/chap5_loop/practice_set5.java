package com.company.chap5_loop;

import java.util.Scanner;

public class practice_set5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    /*    System.out.println("Q1). WAP to print a pattern.");
        for(int i=0;i<5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        } */

    /*    System.out.println("Q2). WAP to sum first 'n' number using while loop.");
        System.out.print("Enter the value of 'n' upto which u want to add consicutively: ");
        int n = s.nextInt();
        int i = 1, sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first " + n + " input numbers are: " + sum); */

        System.out.println("Q3). WAP to print a multiplication Table.");
        System.out.print("Enter the number for table: ");
        int n = s.nextInt();
        System.out.print("Enter upto which table must be(like 10): ");
        int m = s.nextInt();
        System.out.println("The Table is:");
        for(int i=1;i<=m;i++){
            int multi = n * i;
            System.out.println(n + " X " + i + " = " + multi);
        }
    }
}
