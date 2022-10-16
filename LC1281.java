package com.company;
import java.util.Scanner;


// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
public class LC1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number desired: ");
        int n = sc.nextInt();
        int temp;
        int sum = 0;
        int pdc = 1;
        while (n>0){
            temp = n%10;
            sum = sum + temp;
            pdc = pdc * temp;
            n = n/10;
        }
        System.out.println(pdc - sum);
    }
}

//LEETCODE SOLUTION:
/*class Solution {
    public int subtractProductAndSum(int n) {
        int temp;
        int sum = 0;
        int pdc = 1;
        while (n>0){
            temp = n%10;
            sum = sum + temp;
            pdc = pdc * temp;
            n = n/10;
        }
        return(pdc - sum);

    }
}*/
