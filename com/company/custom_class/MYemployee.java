package com.company.custom_class;

import java.util.Scanner;

public class MYemployee {

        int salary;
        int getsalary(){
            return salary;
        }
        String name;
        String getname(){
            return name;
        }
        void setname(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Name: ");
            this.name = sc.nextLine();
        }
    }

