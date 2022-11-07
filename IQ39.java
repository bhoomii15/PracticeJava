package com.company;
import java.util.Scanner;


//Calculate Batting Average
//Batting Average, equal to runs/ (matches – notout)
public class IQ39 {

    static double BA(int r, int m, int no){
        int avg = r/(m-no);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        int matches = sc.nextInt();
        int notout = sc.nextInt();

        System.out.println(BA(runs, matches,notout));
    }
}
