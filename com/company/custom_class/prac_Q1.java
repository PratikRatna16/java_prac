package com.company.custom_class;

import java.util.Scanner;

class MYemployee {
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
class cellphone{
    void ringing(){
        System.out.println("Ringing...........");
    }
    void vibrate(){
        System.out.println("vibrating...........");
    }
}
class square{
    int value;
    void side(){
        System.out.print("Enter the value of sides: ");
        Scanner sc = new Scanner(System.in);
        this.value = sc.nextInt();
    }
     void areaOfSquare(){
        int area = this.value * this.value;
         System.out.println(area);
    }
    void perimeterOfSquare(){
        int perimeter = 4 * this.value;
        System.out.println(perimeter);
    }
}
class TommyVecetti{
    void hitting(){
        System.out.println("hitting the enemy");
    }
    void running(){
        System.out.println("Run from enemy");
    }
    void firing(){
        System.out.println("Enemy incoming, fire! ");
    }
}
public class prac_Q1 {
    public static void main(String[] args){
// Qs 1)
/*        MYemployee pratik = new MYemployee();
        pratik.name = "pratik";
        pratik.salary = 100000;
        System.out.println("Name: " + pratik.getname());
        System.out.println("salary: "+pratik.getsalary());
        pratik.setname();
        System.out.println(" Changed name to: "+pratik.getname());

// QS 2)
        cellphone mi = new cellphone();
        mi.ringing();
        mi.vibrate();
// QS 3)
        square ar = new square();
        ar.side();
        System.out.print("The area of Square is: ");
        ar.areaOfSquare();
        System.out.print("The perimeter: ");
        ar.perimeterOfSquare();
// QS 5)
          TommyVecetti game = new TommyVecetti();
          game.hitting();
          game.running();
          game.firing(); */
    }
}
