package com.company;
import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Q41 {

    static int maxNum(int a, int b, int c){
        int max;
        max = a;
        if(b>a){
            max = b;
        }
        if(c>b){
            max = c;
        }
        return max;
    }

    static int minNum(int a, int b, int c){
        int min;
        min = a;
        if(b<a){
            min = b;
        }
        if(c<b){
            min= c;
        }
        return  min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("The maximum of the three numbers is: " + maxNum(num1, num2, num3));
        System.out.println("The minimum of the three numbers is: " + minNum(num1, num2, num3));
    }
}
