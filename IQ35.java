package com.company;
import java.util.Scanner;

// To Calculate Distance Between Two Points
public class IQ35 {
    static double Distance(int a, int b){
        int d;
        if(a>b){
            d = a-b;
        }
        else{
            d = b-a;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first point: ");
        int p = sc.nextInt();

        System.out.println("Enter the second point: ");
        int q = sc.nextInt();

        System.out.println("The distance between the given points is: " + Distance(p,q) + " units.");

    }
}
