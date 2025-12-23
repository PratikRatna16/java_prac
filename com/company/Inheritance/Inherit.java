package com.company.Inheritance;
class box{
   public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting x.");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am Constructer");
    }
}
class Derived extends box{
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am setting value of y");
        this.y = y;
    }
}
public class Inherit {
    public static void main(String[] args){
        // created object of box class
        box b = new box();
        b.setX(4);
        System.out.println(b.getX());

    // created an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
