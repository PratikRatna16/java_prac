package com.company.chap1;

import java.util.Scanner;

public class class02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks obtained by student(100):");
        System.out.print("Physics: ");
        int sub1 = s.nextInt();
        System.out.print("Chemistry: ");
        int sub2 = s.nextInt();
        System.out.print("Biology: ");
        int sub3 = s.nextInt();
        System.out.print("Maths: ");
        int sub4 = s.nextInt();
        System.out.print("Physical Education: ");
        int sub5 = s.nextInt();
        int percent = ((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.print("The percentage is: " + percent + "%");

    }
}
