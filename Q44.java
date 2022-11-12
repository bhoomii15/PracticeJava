package com.company;
import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Q44 {

    static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The sum of the given numbers is: " + sum(num1, num2));
    }
}
