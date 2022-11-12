package com.company;
import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q46 {
    static void areaCircum(double a){
        double area = 3.14*a*a;
        double circum = 2*3.14*a;

        System.out.println("The area of the given circle is: " +  area);
        System.out.println("The circumference of the given circle is: " + circum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = in.nextDouble();

        areaCircum(radius);
    }
}
