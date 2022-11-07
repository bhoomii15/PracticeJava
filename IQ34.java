package com.company;
import java.util.Scanner;


// To Calculate Discount Of Product
public class IQ34 {

    static double Discount(int p, int r) {
        int d = p * r / 100;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int a = sc.nextInt();
        System.out.println("Enter the rate of discount: ");
        int b = sc.nextInt();

        System.out.println("The discounted price is: " + Discount(a,b));
    }
}
