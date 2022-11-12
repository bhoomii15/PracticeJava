package com.company;
import java.util.Scanner;


//Define a method that returns the product of two numbers entered by user.
public class Q45 {
    static void mul(int a , int b){
        int c = a*b;
        System.out.println("The product of the given numbers is: " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to be multiplied: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        mul(num1, num2);

    }
}
