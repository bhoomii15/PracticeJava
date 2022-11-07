package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class IQ314 {

    static boolean isArms(int n){
        int r;
        int sum =0;
        int temp;
        temp = n;
        int l = String.valueOf(n).length();

        while(n>0){
            r = n%10;
            sum = sum + (int)Math.pow(r,l);
            n = n/10;
        }

        if(sum == temp) {
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArms(n));

    }
}
