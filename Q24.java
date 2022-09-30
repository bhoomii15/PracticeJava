package com.company;
import java.util.Scanner;


//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        char a = sc.next().charAt(0);

        if( a == '+'){
            System.out.println(p + q);
        }
        else if ( a == '-'){
            System.out.println(p-q);
        }
        else if ( a == '*'){
            System.out.println(p*q);
        }
        else if( a == '/'){
            System.out.println(p/q);
        }
        else{
            System.out.println("ERROR");
        }
    }
}
