package com.company;
import java.util.Scanner;

//
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        System.out.println(isPrime(x));

        for( int i = 100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }

            return c*c> n;
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/10;

            sum  =  sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
