package com.company;
import java.util.Scanner;

//Perfect Number In Java
public class IQ322 {

    static void PerfNo(int n){
    int sum = 0;
    for(int i = 1; i<n; i++){
        if( n%i == 0){
            sum = sum + i;
        }
    }
        if (n == sum){
            System.out.println("Its a perfect number");
        }
        else System.out.println("It's not a perfect number");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        PerfNo(x);
    }
}
