/* 2.Aim of the program-  Write a Java program to handle an ArithmeticException using try,
 catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block */

package com.company.Exception_Handeling;
class excpt2{
    public static void main(String[] args){
        try{
            int a = 0;
            int y = 15/a;
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally{
            System.out.println("Exception handled"); }
    } }

