/*    1. Aim of the program - Write a program in Java using multi-threading which will display
 a counter value within a specified range with a gap of 5 milliseconds after setting it’s name as given by the user.
    Input : Name of the thread - First
      Lower range of counter - 10
      Upper range of counter - 15
    Output : Thread - First
      Counter - 10   11  12  13  14  15
*/

package com.company.multithread;
import java.util.Scanner;
class qs1 {
        public static void main(String[] args) {
            Thread t;
            t = Thread.currentThread();
            Scanner nm = new Scanner(System.in);
            System.out.println("Enter name of the thread: ");
            t.setName(nm.nextLine());
            System.out.println("Enter lower value: ");
            int lower_range =Integer.parseInt(nm.nextLine());
            System.out.println("Enter upper value: ");
            int upper_range =Integer.parseInt(nm.nextLine());
            System.out.println("Thread name: "+t.getName());
            System.out.print("Counter: ");
            for(int i =lower_range;i<=upper_range;i++){
                try {
                    System.out.print(i+" ");
                    t.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("Thread Exception occurred !!");
                }
            }
        }
    }
