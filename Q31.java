package com.company;
import java.util.Scanner;



// To find Area Of Circle



public class Q31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the given circle: ");
        float r = sc.nextFloat();
        int pi = (int) 3.14;
        float a = (pi * r *r);

        System.out.print("The area of the given circle is: " + a);

    }

}