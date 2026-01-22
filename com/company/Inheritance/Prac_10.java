package com.company.Inheritance;

import java.util.Scanner;
class circle{
    int radius;
    circle(int r){
        this.radius = r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
class cylinder extends circle{
    int height;
    cylinder(int r, int h){
        super(r);
        this.height = h;
    }
     double volume(){
         return super.area() * height;
     }
}
class rectangle{
    int length, width;
//    rectangle(int l, int w){
//        this.length = l;
//        this.width = w;
//    }
    void inval(int l, int w){
        this.length = l;
        this.width = w;
    }
    double area(){
        return length*width;
    }
}
class cuboid extends rectangle{
    int height;
    double TSA,LSA;

    double getTSA() {
        return TSA;
    }

    void setTSA(int l, int w, int h) {
        super.inval(l,w);
        this.height = h;
        this.TSA = 2*(length*width + width*height + height*length);
    }

    double getLSA() {
        return LSA;
    }

    void setLSA(int l, int w, int h) {
        super.inval(l,w);
        this.LSA = 2*height * (length+width);
    }

    //    cuboid(int l, int w, int h){
//        super(l,w);
//        this.height = h;
//    }
    double volume(){
        return super.area()*height;
    }
}
public class Prac_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //    Q1.) Create a class circle and use inheritance to create another class cylinder from it.

  /*      circle c = new circle(5);
        System.out.println("The area of a Circle is: "+c.area());
        cylinder cy = new cylinder(5,7);
        System.out.println("The volume of the cylinder is: "+cy.volume()); */

        //    Q2.) Create a class Rectangle and use inheritance to create another class cuboid.

        rectangle r = new rectangle();
        r.inval(4, 5);
        System.out.println("The area of rectangle is: " + r.area());
        cuboid ob = new cuboid();
        ob.setTSA(4, 5, 8);
        ob.setLSA(4, 5, 8);
        System.out.println("The volume of the cuboid is: " + ob.volume());
        System.out.println("The Total Surface Area of the cuboid is: " + ob.getTSA());
        System.out.println("The Lateral Surface Area of the cuboid is: " + ob.getLSA());
    }
}
