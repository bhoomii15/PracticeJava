package com.company;
import java.util.Scanner;


// Perimeter Of Parallelogram
public class Q310 {
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

        if((a == b && c == d) || (a == c && b == d) ||( a == d && b == c)){
            float pr = 2*(a + b);
            System.out.println("The perimeter of the given parallelogram is: " + pr);
        }
        else {
            System.out.println("The given figure is not a parallelogram");
        }

    }
}
