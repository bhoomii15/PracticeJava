package com.company;
import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
public class Q48 {
    static String  grade(double a){
        String grade = null;
        if(a>=91 && a<=100){
            grade = "AA";
        }
        if(a>=81 && a<91){
            grade = "AB";
        }
        if(a>=71 && a<81){
            grade = "BB";
        }
        if(a>=61 && a<71){
            grade = "BC ";
        }
        if(a>=51 && a<61){
            grade = "CD";
        }
        if( a>=41 && a<51){
            grade = "DD";
        }
        if(a<=40){
            grade = "Fail";
        }
        return grade;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();

        System.out.println("The grade obtained by the student is: " + grade(marks));

    }
}
