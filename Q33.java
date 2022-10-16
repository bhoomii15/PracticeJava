package com.company;
import java.util.Scanner;


//Area Of Rectangle
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float b = sc.nextFloat();
        float ar;

        ar = 1.5f * l * b;

        System.out.println("The area of the given rectangle is: " + ar);

    }
}
