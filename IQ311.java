package com.company;
import java.util.Scanner;

//Compound Interest Java Program
public class IQ311 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        float p = sc.nextFloat();

        System.out.println("Enter the interest rate: ");
        float r = sc.nextFloat();

        System.out.println("Enter the number of time periods elapsed: ");
        int t = sc.nextInt();


        float ci = p* ((float) Math.pow((1+ r/100),t));

        System.out.println("The compound inetrest is: " + ci);

    }

}
