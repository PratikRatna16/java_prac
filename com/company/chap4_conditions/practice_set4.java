package com.company.chap4_conditions;

import java.util.Scanner;

public class practice_set4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Q1). WAP to find out the type of website from the URL.");
        System.out.print("Enter the website URL: ");
        String str = s.next();
        if(str.endsWith(".com")){
            System.out.println(str + " is a commercial website");
        }
        else if(str.endsWith(".org")){
            System.out.println(str + " is a organization website");
        }
        else if(str.endsWith(".in")){
            System.out.println(str + " is a indian website");
        }
        else{
            System.out.println("some other website");
        }
    }
}
