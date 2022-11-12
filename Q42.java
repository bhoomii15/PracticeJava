package com.company;
import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Q42 {

    static void evenOdd(int a){
        if(a% 2 == 0){
            System.out.println("The given number is even.");
        }
        else System.out.println("The given number is odd.");
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
}
