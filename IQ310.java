package com.company;
import java.util.Scanner;

//Calculate CGPA Java Program
public class IQ310 {
// take input of numbers and the number of subjects
    static double CGPA(double [] marks, int n){

        // array to store the grade in
        double [] grades = new double[n];
        //calculating grades and storing them in the array
        for(int i=0; i<n; i++){
            grades[i] = (marks [i]/10);
        }
        // calculating sum of grades
        double sum =0;
        for(int i =0; i<n; i++){
            sum += grades[i];
        }
        //calculating cgpa;
        double cg = 0;
        cg = sum/n;

        return cg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] mark = new double[n];
        for (int i = 0; i < n; i++) {
            //initialise marks
            mark = new double[n];
            mark[i] = sc.nextInt();
        }

        double cgpa = CGPA(mark, n);
        System.out.println(cgpa);

    }

}
