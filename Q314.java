package com.company;
import java.util.Scanner;

//To find Volume Of Cone
public class Q314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cone: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the cone: ");
        float h = sc.nextFloat();
        //REMEBER TO CAST TO FLOAT
        float v = (float) ((Math.pow(r, 2)*3.14*h) / 3);
        System.out.println("The volume of the given cone is: " + v);
}
}