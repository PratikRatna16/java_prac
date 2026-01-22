package com.company.Inheritance;
import java.util.Scanner;
import java.util.Random;

class Game{
    int num;
    int inputNumber;
    int numOfGuesses = 0;
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
        numOfGuesses++;
        if(inputNumber== num){
            System.out.format("Yes u guessed the number right %d\n you got right in the %d attempt\n",num,numOfGuesses);
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
        boolean b = false;
        while (!b) {
            g.isUserInput();
            b = g.isCorrectNumber();
        }
    }
}
