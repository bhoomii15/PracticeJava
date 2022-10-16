package com.company;
import java.util.Scanner;


//To find Area Of Isosceles Triangle

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base length: ");
        float b = sc.nextFloat();
        System.out.print("Enter the height length: ");
        float h = sc.nextFloat();
        System.out.println("Enter the length of the second side: ");
        float a = sc.nextFloat();
        System.out.println("Enter the length of the third side: ");
        float c = sc.nextFloat();
        float ar;

        if(a == b || b == c || a==c ){
            ar = 0.5f*h*b;
            System.out.println("The area of the given triangle is: " + ar);
        }
        else{
            System.out.println("The given triangle is not isosceles");
        }

    }
}
