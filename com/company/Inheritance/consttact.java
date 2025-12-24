package com.company.Inheritance;

class year{
      year(){
        System.out.println("This is a constructor");
    }
    year(int x){
        System.out.println("The value of x in year is :"+x);
    }
}
class mon extends year{
      mon(){
          System.out.println("This is a derived constructor from year");
      }

      mon(int x,int y){
          super(x);
          System.out.println("The value of y in mon: "+y);
      }
}
class day extends mon{
    day(){
        System.out.println("This a derived constructor from mon");
    }
    day(int x, int y, int z){
        super(x,y);
        System.out.println("The value of z in day is :"+z);
    }
}
public class consttact {
    public static void main(String [] args){
//        year b = new year(5);
//        mon ob = new mon(3,6); // prints first from super class then from subclass (Inherits)
        day j = new day(3,6,7);

    }
}
