package com.company;
import java.util.Scanner;


//Calculate Average Of N Numbers
public class IQ33 {

    static double Avg(int... a){
        int n = a.length;
        int sum = 0;
        for(int i =0; i >= n-1; i++){
            sum = sum + a[i];
        }
        return (sum/n) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Avg(20,40,50,70,80));
    }
}

