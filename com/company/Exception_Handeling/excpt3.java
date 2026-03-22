/* 3.Aim of the program-  Write a Java class which has a method called ProcessInput().
 This method checks the number entered by the user. If the entered number is negative
 then throw an user defined exception called NegativeNumberException, otherwise it displays
 the double value of the entered number.
		Input: Enter a number      4
		Output: Double value:  8
		Input: Enter a number    -4
		Output:   Caught the exception
Exception occurred:  NegativeNumberException: number should be positive */

package com.company.Exception_Handeling;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String s){
        super(s);
    } }

class check{
    void processInput(int n) throws NegativeNumberException{
        if( n < 0){
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: "+n*2);
        }}
}

class excpt3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int n = sc.nextInt();
        check c = new check();
        try{
            c.processInput(n);
        } catch(NegativeNumberException e){
            System.out.println("Exception occured");
            System.out.println(e);
        }}
}


