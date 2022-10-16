package com.company;
import java.util.Scanner;



// To find Area Of Triangle
public class Q32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Taking inputs of 3 sides
        System.out.print("Enter the length of the base: ");
        double a = sc.nextDouble();
        System.out.print("Enter the length of the perpendicular, if perpendicular is not known enter the length of the second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double c = sc.nextDouble();
        double ar;

        if (c == 0){
            ar = (0.5f * a * b);
        }
        else{
            double s = (a+b+c)/2f;
            ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        System.out.println("Area of the given triangle is: "+ ar);
    }
}
