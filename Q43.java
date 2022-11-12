package com.company;
import java.util.Scanner;

//A person is eligible to vote if his/her age is
// greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Q43 {

    static void vote(int n){
    if(n>=18){
        System.out.println("The person is eligible to vote.");
    }
    else System.out.println("The person is not eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's age: ");
        int age = sc.nextInt();
        vote(age);
    }
}
