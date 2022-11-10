package com.company;
import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class IQ326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while (true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
        }
        for(int i = 0; i<=n; i++){
            if(i % 2 == 0){
                sum1 = sum1 + i;
            }
            if(i % 2 != 0){
                sum2 = sum2 + i;
            }
        }

      while(n<0){
          sum3 = sum3 + n;
      }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

}
