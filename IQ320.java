package com.company;
import java.util.Scanner;

public class IQ320 {


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

    static int lcm(int a, int b)
    {
        return (a / GCD(a, b)) * b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(lcm(a,b));
    }
}
