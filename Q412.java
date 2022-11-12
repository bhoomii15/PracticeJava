package com.company;
import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class Q412 {
    static int sumOfN(int n){
        int sum  = 0;
        for(int i = 0; i <=n; i++){
            sum = sum + i;
        }
        return  sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("The sum of the natural numbers till n is: " + sumOfN(a));
    }
}
