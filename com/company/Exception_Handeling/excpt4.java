/* 4.Aim of the Program: Write a program to create user defined exceptions called HrsException,
 MinException and SecException. Create a class Time which contains data members hours, minutes,
 seconds and a method to take a time from user which throws the user defined
 exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).
		Input:  Enter hours: 4
Enter minutes: 54
Enter seconds: 34
		Output: Correct Time-> 4:54:34

		Input:  Enter hours: 30
Enter minutes: 65
Enter seconds: 65
		Output: Caught the exception
Exception occurred:  InvalidHourException:hour is not greater than 24
Exception occurred:  InvalidMinuteException:hour is not greater than 60
Exception occurred:  InvalidSecondException:hour is not greater than 60 */

package com.company.Exception_Handeling;
import java.util.Scanner;
class HrsException extends Exception{
    HrsException(String s){
        super(s);
    }}
class MinException extends Exception{
    MinException(String s){
        super(s);
    }}
class SecException extends Exception{
    SecException(String s){
        super(s);
    }}
class Time{
    Scanner sc = new Scanner(System.in);
    int hr;
    int min;
    int sec;
    void checkhour() throws HrsException{
        System.out.print("Enter Hours: ");
        hr = sc.nextInt();
        if( hr<0 || hr>24){
            throw new HrsException("hour is not greater than 24 or less than 0");
        }}
    void checkmin() throws MinException{
        System.out.print("Enter Minutes: ");
        min = sc.nextInt();
        if( min <0 || min>60){
            throw new MinException("Minutes is not greater than 60 or less than 0");
        }}
    void checksec() throws SecException{
        System.out.print("Enter Seconds: ");
        sec = sc.nextInt();
        if(sec <0 || sec > 60){
            throw new SecException("Seconds is not greater than 60 or less than 0");
        }}
    void show(){
        System.out.println("Correct Time-> "+hr+":"+min+":"+sec);
    }}
class excpt4 {
    public static void main(String[] args) {
        Time t = new Time();
        boolean error = false;
        try {
            t.checkhour();
            t.checkmin();
            t.checksec();
        } catch (HrsException e) {
            error = true;
            System.out.println(" InvalidHourException: " + e);
        }
        catch (MinException e) {
            error = true;
            System.out.println(" InvalidMinuteException: " + e);
        }
            catch (SecException e) {
            error = true;
            System.out.println(" InvalidSecondException: " + e);
        }
        if (!error) {
            t.show();
        } else {
            System.out.println("Can't give the time as time given is incorrect");
        }
    }
}

