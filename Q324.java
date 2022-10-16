package com.company;
import java.util.Scanner;


// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Q324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sum =0;

        while(true){
            a = sc.nextInt();
            sum = sum + a;
            if(a == 0){
                System.out.println(sum);
                break;

            }
        }

    }
}
