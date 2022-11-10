package com.company;
import java.util.Scanner;

//ava Program Vowel Or Consonant
public class IQ321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking char input
        char A = sc.next().charAt(0);
        // remember to put apostrophe
        if(A == 'a' || A == 'e' || A == 'i'|| A == 'o' || A == 'u' ){
            System.out.println("its a vowel");
        }
        else {
            System.out.println("Its a consonant");
        }


    }
}
