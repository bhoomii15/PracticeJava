package com.company;
import java.util.Scanner;


// To find Curved Surface Area Of Cylinder
public class Q319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        float h = sc.nextFloat();

        float v = (float)(2*3.14*r*h);
        System.out.println("The curved surface area of the given cylinder is: " + v);

    }
}
