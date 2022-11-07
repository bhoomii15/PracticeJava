package com.company;
import java.util.Scanner;

// To calculate Power In Java
public class IQ37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        int temp = n;
        while(p>1){
            temp = temp*n;
            p--;
        }
        System.out.println(temp);

    }
}
