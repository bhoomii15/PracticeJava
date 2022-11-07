package com.company;
import java.util.Scanner;


//Find Ncr & Npr
public class IQ315 {

    static int fact(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int r = sc.nextInt();

        int ncr = (fact(n)/(fact(r)*fact(n-r)));
        int npr = (fact(n)/(fact(n-r)));

        System.out.println(ncr);
        System.out.println(npr);
    }
}
