package com.company;
import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).

public class Q323 {
    public static void main(String[] args) {
        //take input of the number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The factors of the given number are: " );
        for(int i =1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }


    }
}
