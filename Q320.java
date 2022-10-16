package com.company;
import java.util.Scanner;


// To calculate Total Surface Area Of Cube
public class Q320 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        float a = in.nextFloat();

        float v = (float)(Math.pow(a, 2)*6);
        System.out.println("The total surface area of the given cube is: "+ v);

        }
    }

