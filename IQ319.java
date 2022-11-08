package com.company;
import java.util.Scanner;

//HCF Of Two Numbers Program
public class IQ319 {
    static int GCD(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a>b){
            return GCD(b, a%b);
        }
        else{
            return GCD(a, b%a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(GCD(x,y));
    }
}
