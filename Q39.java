package com.company;
import java.util.Scanner;


//Perimeter Of Equilateral Triangle

public class Q39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side: ");
        float a = sc.nextFloat();
        System.out.println("Enter the length of the second side: ");
        float b = sc.nextFloat();
        System.out.println("Enter the length of the third side: ");
        float c = sc.nextFloat();
        float p;

        if(a == b && b == c){
            p = 3f*a;
            System.out.println("The perimeter of the given triangle is: " + p);
        }
        else{
            System.out.println("The given triangle is not equilateral!");
        }

    }
}
