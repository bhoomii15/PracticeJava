package com.company;
import java.util.Scanner;

//To find Volume Of Prism

public class Q315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the base of the cone: ");
        float b = sc.nextFloat();
        System.out.println("Enter the length of the height of the cone: ");
        float h = sc.nextFloat();

        float v = b*h;
        System.out.println("Volume of the given cone is: " + v);
    }
}
