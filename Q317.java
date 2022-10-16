package com.company;
import java.util.Scanner;

// To find Volume Of Sphere
public class Q317 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        float r = in.nextFloat();

        float v = (float)(Math.pow(r, 3)*1.33*3.14);
        System.out.println("The volume of the given sphere is: " + v );


    }
}
