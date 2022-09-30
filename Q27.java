package com.company;
import java.util.Scanner;


//To calculate Fibonacci Series up to n numbers.
public class Q27 {

    static int fibo(int n){
        if(n ==0){
            return 0;
        }
        if(n ==1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }

    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<=n; i++){
            System.out.print(fibo(i) + " ");
        }

    }
}
