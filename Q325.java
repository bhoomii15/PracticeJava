package com.company;
import java.util.Scanner;


//Take integer inputs till the user enters 0 and print the largest number from all.
public class Q325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int temp =0;
        System.out.print("Enter the numbers: ");

        while(true){
            n = sc.nextInt();
            if(n> temp){
                temp = n;
            }
            if(n == 0){
                System.out.println("The largest number of all is: " + temp);
                break;
            }
        }

    }
}
