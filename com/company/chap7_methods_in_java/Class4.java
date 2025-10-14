package com.company.chap7_methods_in_java;

public class Class4 {
    // ITS A method overloading with variable array
    static int sum(int ...arr){
        int results = 0;
        for(int i : arr){
            results += i;
        }
        return results;
    }
    static int multi(int x, int ...arr){
        int results = 1;
        for(int i : arr){
            results *= i;
        }
        return results-x;
    }
    public static void main(String[] args){
        // HERE the integer is given and accepted int function as array.
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 'a' and 'b' is: " + sum(3,5));
        System.out.println("The sum of 'a','b' and 'c' is: " + sum(3,6,4));
        System.out.println("The sum of 'a','b','c' and 'd' is: " + sum(4,2,1,4));
        System.out.println();
        System.out.println("The multi of logic is: " + multi(3));
        System.out.println("The multi of logic is: " + multi(3,5));
        System.out.println("The multi of logic is: " + multi(3,6,4));
        System.out.println("The multi of logic is: " + multi(4,2,1,4));



    }
}
