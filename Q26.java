package com.company;
import java.util.Scanner;


//Input currency in rupees and output in USD.
public class Q26 {
    public static void main(String[] args) {
        float rupee;
        Scanner sc = new Scanner(System.in);
        rupee = sc.nextFloat();
        float dollar = (rupee*0.012f);

        System.out.println("Given amount in USD is:" + dollar + "$" );

    }
}
