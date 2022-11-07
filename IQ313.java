package com.company;
import java.util.Scanner;

//Sum Of N Numbers
public class IQ313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double [] marks = new double[n];
        for(int i =0; i<n; i++){
            marks[i]= sc.nextInt();
            sum += marks[i];
        }

        System.out.println(sum);
    }
}
