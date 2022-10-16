package com.company;
import java.util.Scanner;

public class Q312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        float a = sc.nextFloat();

        float pr = 4f*a;
        System.out.println("The perimeter of the given square is: " + pr);
    }
}
