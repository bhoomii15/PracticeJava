package com.company;
import java.util.Scanner;



//Take name as input and print a greeting message for that particular name.
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Good Morning" + " " + name + "!!");
    }
}
