package com.company.Inheritance;

class year{
      year(){
        System.out.println("This is a constructor");
    }
}
class mon extends year{
      mon(){
          System.out.println("This is a derived constructor");
      }
}
public class consttact {
    public static void main(String [] args){
        mon ob = new mon(); // prints first from super class then from subclass (Inherits)

    }
}
