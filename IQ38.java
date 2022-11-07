package com.company;
import java.util.Scanner;

//Calculate Depreciation of Value


public class IQ38 {

    static float SD(int c, int r, int l ){
        int s = (c - r)/l;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int l = sc.nextInt();

        System.out.println(SD(c,r,l));
    }

}
