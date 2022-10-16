package com.company;
import java.util.Scanner;


//To find Area Of Parallelogram

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the first side: ");
        float a = sc.nextFloat();

        System.out.println("Enter the length of the base: ");
        float b = sc.nextFloat();

        System.out.println("Enter the length of the third side: ");
        float c = sc.nextFloat();

        System.out.println("Enter the length of the fourth side: ");
        float d = sc.nextFloat();

        System.out.println("Enter the length of the height: ");
        float h = sc.nextFloat();


        if( a == b || b == c || c == d || d == a) {
            float ar = b * h;
            System.out.println("The area of the given parallelogram is: " + ar);
        }
        else{
            System.out.println("That is not a parallelogram");
        }





    }
}
