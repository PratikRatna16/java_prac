package com.company.custom_class;

// import java.util.Scanner;

 class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
        System.out.println("Salary is: "+salary);
    }
}
public class My_class {
    public static void main(String[] args){
                        // here WE GIVE THE NEW EMPLOYEE THROUGH USER INPUT
    //    Scanner sc = new Scanner(System.in);
    //    employee staff = new employee();
    //    System.out.print("New employee id: ");
    //    staff.id = sc.nextInt();
    //    sc.nextLine();
    //    System.out.print("Name: ");
     //   staff.name = sc.nextLine();
                      // HERE WE GIVE THE EMPLOYEE SYSTEM BASED POINTS
        employee pratik = new employee();
        pratik.id = 01;
        pratik.name = "pratik";
        pratik.salary = 100000;
        pratik.printdetails();
        employee chayan = new employee();
        chayan.id = 02;
        chayan.name = "chayan";
        chayan.salary = 150000;
        chayan.printdetails();
    }
}
