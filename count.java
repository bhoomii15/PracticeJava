package com.company;
import java.util.Scanner;


public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count =0;
        while (n >0 ){
            int rem = n %10;
            if(rem == m) count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
