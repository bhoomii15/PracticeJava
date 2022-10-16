package com.company;
import java.util.Scanner;


//To find Volume Of Pyramid
public class Q318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side of the pyramid: ");
        float a = in.nextFloat();
        System.out.println("Enter the length of the height of the pyramid: ");
        float h = in.nextFloat();

        float v = (float)(Math.pow(a, 2)*h/3);
        System.out.println("The volume of the given pyramid is: " + v);



    }
}
