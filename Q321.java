package com.company;
import java.util.Scanner;

//Fibonacci Series

public class Q321 {

    static int fibo(int a){
        if(a == 0){
            return 0;
        }
        if( a == 1){
            return 1;
        }
        else{
            return fibo(a-1) + fibo(a-2);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want the series");
        int n  = sc.nextInt();
        System.out.println(fibo(n));

        // to print the whole series
        for(int i = 2; i<=n; i++){
            System.out.print(fibo(i) + " ");
        }


    }
}
