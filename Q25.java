package com.company;
import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            System.out.println("The largest number is: " + a);
        }
        else{
            System.out.println("The largest number is: " + b);
        }
    }
}
