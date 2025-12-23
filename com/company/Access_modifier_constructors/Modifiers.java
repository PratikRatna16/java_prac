package com.company.Access_modifier_constructors;


class myemployee {

    public myemployee(){// use for object in modifier so it will not so error while being in use as a constructor in another class
        id = 348;
      name = "devansh";
    }
    public myemployee(int newid){
        id = newid;
    }
    public myemployee( String newname, int newid){
        id = newid;
        name = newname;
    }
    private int id;
    int getid(){
        return id;
    }
    void setid(int i){
        this.id = i;
    }
    private String name;
    String getname(){
        return name;
    }
     void setname( String n){
        this.name = n;
    }
}

public class Modifiers {
    public static void main(String[] args){
        myemployee laura = new myemployee();
        laura.setid(368);
        System.out.println("The set id is: "+laura.getid());
        laura.setname("Pratik");
        System.out.println("The name is: "+laura.getname());
    }
}
