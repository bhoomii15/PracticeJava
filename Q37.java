package com.company;
import java.util.Scanner;


//Area Of Equilateral Triangle

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side: ");
        float a = sc.nextFloat();
        System.out.println("Enter the length of the second side: ");
        float b = sc.nextFloat();
        System.out.println("Enter the length of the third side: ");
        float c = sc.nextFloat();
        float ar;

        if(a == b && b == c){
            ar = (float) Math.sqrt(3)*a*a/4;
            System.out.println("The area of the given equilateral triangle is: " + ar);
        }
        else{
            System.out.println("The given triangle is not equilateral.");
        }

    }
}
