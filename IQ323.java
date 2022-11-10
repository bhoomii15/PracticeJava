package com.company;
import java.util.Scanner;

//Check Leap Year Or Not
public class IQ323 {
    static void LeapYear(int n){
        if((n%4 == 0 || n%100 != 0) || n% 400 == 0 ){
            System.out.println("Its a leap year");
        }
        else System.out.println("Its not a leap year");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        LeapYear(x);
    }
}
