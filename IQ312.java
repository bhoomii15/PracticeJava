package com.company;
import java.util.Scanner;

//Calculate Average Marks
public class IQ312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double [] marks = new double[n];
        for(int i =0; i<n; i++){
            marks[i]= sc.nextInt();
            sum += marks[i];
        }
        double avg = sum/n;
        System.out.println(avg);

    }
}
