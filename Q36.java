package com.company;
import java.util.Scanner;

//Area Of Rhombus

public class Q36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter the length of the second diagonal: ");
        float d2 = sc.nextFloat();
        float ar;

        ar = d1*d2/2;
        if(d1 ==0 || d2 == 0){
            System.out.print("Enter the length of the base: ");
            float b = sc.nextFloat();
            System.out.print("Enter the length of the height: ");
            float h = sc.nextFloat();
            ar = b*h;
        }
        System.out.println("The area of the given rhombus is: " + ar);
    }
}

