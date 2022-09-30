package com.company;
import java.util.Scanner;



//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Q23 {
    public static void main(String[] args) {
        float P, R, T , SI;
        Scanner sc = new Scanner(System.in);
        P = sc.nextFloat();
        R = sc.nextFloat();
        T = sc.nextFloat();

        SI = (P * R * T) / 100;
        System.out.println(SI);

    }
}
