package com.company.chap6_arrays;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of row 'n': ");
        int n = s.nextInt();
        System.out.print("Enter the size of column 'm': ");
        int m = s.nextInt();
        int [][] array = new int[n][m];
        System.out.println("Enter the elements of array:");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print("arr["+i+"]["+j+"]: ");
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
