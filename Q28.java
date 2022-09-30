package com.company;
import java.util.Scanner;


//To find out whether the given String is Palindrome or not.
public class Q28 {

    static boolean isPal(String str){
        //initialise an empty string so as to store the reversed string
        String rev = "";
        for(int i= str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPal(str));
    }
}
