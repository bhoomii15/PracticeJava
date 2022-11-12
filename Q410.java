package com.company;
import java.util.Scanner;


//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Q410 {
    static boolean isPalindrome(int x){
        if(x==0){
            return true;
        }

        if(x<0 || x%10 ==0){
            return false;
        }

        int reversed_int = 0;
        while(x> reversed_int){

            int pop;
            pop = x % 10;
            x /= 10;

            reversed_int = (reversed_int*10) + pop;
        }

        if( x == reversed_int){
            return true;
        }

        // to account for odd numbers

        else if(x == reversed_int/10){
            return true;
        }
        else{
            return false;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isPalindrome(num));
    }
}
