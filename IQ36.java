package com.company;
import java.util.Scanner;

//Calculate Commission Percentage
public class IQ36 {
    static double CommPerc(int s, int c){
        // sales price and commission amount
        double Perc = c*100/s;
        return Perc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sales price: ");
        int a = sc.nextInt();

        System.out.println("Enter the commission price: ");
        int b = sc.nextInt();

        System.out.println("The commission percentage for the given sales is: " + CommPerc(a,b) + "%");
    }
}
