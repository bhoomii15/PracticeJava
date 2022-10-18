package com.company;
import java.util.Scanner;


// Factorial Program In Java
public class IQ31 {
    public static void main(String[] args) {
        //Take input of the number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
// using for loop
        if(n ==0){
            System.out.println(fact);
        }
        else{
            for(int i =1; i <=n; i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }

        //using while loop
        int i =1;
        if(n ==0){
            System.out.println(fact);
        }
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
