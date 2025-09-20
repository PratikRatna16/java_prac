package com.company.chap6_arrays;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // three ways to write an array
    /*     1).
        int[] marks = {1,2,3,4};
        System.out.println(marks[2]); */
    /*     2).
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        System.out.println(marks[2]); */
    /*    2).
        int [] marks;
        marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        System.out.println(marks[2]); */
    //    array can be of string or float;
        float [] marks = {1.1f,1.2f,1.3f};
        System.out.println(marks[2]);
        String [] name = {"pratik","chayan","devansh"};
        System.out.println(name[1]);
        System.out.println("The lenght of array name is: " + name.length);
    }
}
