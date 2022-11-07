package com.company;
import java.util.Scanner;


//Reverse A String In Java
public class IQ316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        char[] ch = a.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }

        System.out.println(rev);
    }

}
