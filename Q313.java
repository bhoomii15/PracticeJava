package com.company;
import java.util.Scanner;


//Perimeter Of Rhombus
public class Q313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the rhombus: ");
        float a = sc.nextFloat();

        float pr = 4f*a;
        System.out.println("The perimeter of the given rhombus is: " + pr);
    }
}
