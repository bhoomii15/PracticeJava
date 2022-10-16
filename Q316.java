package com.company;
import java.util.Scanner;

// To find Volume Of Cylinder
public class Q316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float h = sc.nextFloat();

        float v = (float) (Math.pow(r, 2)*3.14*h);
        System.out.println("The volume of the given cylinder is: " + v);

    }
}
