package com.company;
import java.util.Scanner;


//Perimeter Of Circle

public class Q38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        float p = 2f*3.14f*r;

        System.out.println("The perimeter of the given circle is: " + p);


    }
}
