package com.company;
import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Q49 {
    static int fact(int n){
        int fact = 1; 
        if(n == 0 || n == 1){
            fact = 1;
        }
        if(n>1){
            for(int i = 1; i<=n; i++){
                
                fact = i * fact(n-1);
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println("The factorial of the given number is: " + fact(a));
    }
}
