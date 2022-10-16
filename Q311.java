package com.company;
import java.util.Scanner;

//Perimeter Of Rectangle

public class Q311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides in an adjacent manner");
        System.out.println("Side 1: ");
        float a = sc.nextFloat();
        System.out.println("Side 2: ");
        float b = sc.nextFloat();
        System.out.println("Side 3: ");
        float c = sc.nextFloat();
        System.out.println("Side 4: ");
        float d = sc.nextFloat();

        if( a == c && b == d){
            float pr = 2*(a+b);
            System.out.println("The perimeter of the given rectangle is: " + pr);
        }
        else{
            System.out.println("The given figure is not a rectangle!");
        }
    }
}
