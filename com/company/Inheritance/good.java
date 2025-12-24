package com.company.Inheritance;
import java.util.Scanner;
import java.util.Random;

class Game{
    int num;
    int inputNumber;
    int numOfGuesses;
    public int getNumOfGuesses() {
        return numOfGuesses;
    }
    public void setNumOfGuesses(int numOfGuesses) {
        this.numOfGuesses = numOfGuesses;
    }
    Game(){
        Random r = new Random();
        this.num = r.nextInt(100);
    }
     void isUserInput(){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input Number: ");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        if(inputNumber== num){
            return true;
        }
        else if(inputNumber < num){
            System.out.println("The number is too less");
        }
        else if(inputNumber > num ){
            System.out.println("The number is too high");
        }
            return false;
    }
}
public class good {
    public static void main(String[] args) {
        Game g =  new Game();
        while (b) {
            g.isUserInput();
            boolean b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
