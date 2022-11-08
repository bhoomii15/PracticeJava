package com.company;
import java.util.Scanner;

//Find if a number is palindrome or not
public class IQ317 {

    static void PN(int x){
        if(x == 0 ){
            System.out.println("isn't a Palindrome number");
        }

        if(x<0 || x%10 == 0){
            System.out.println("isn't a Palindrome number");
        }

        int rev_int = 0;
        while (x> rev_int){
            int temp = x%10;
            x /= 10;

            rev_int = (rev_int*10) + temp;
        }
        if(x == rev_int || x == rev_int/10){
            System.out.println("is a Palindrome number");
        }
        else{
            System.out.println("isn't a Palindrome number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PN(n);
    }

}
