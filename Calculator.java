package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // we have to take input from the user till the user presses x so we'll take input inside the while loop
        int res = 0;

        while(true){
            // taking operator input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // take input of numbers
                System.out.print("Enter the first number:");
                int a = sc.nextInt();
                System.out.print("Enter the second number:");
                int b = sc.nextInt();

                if(op == '+'){
                    res = a + b;
                }

                if( op == '-'){
                    res = a -b;
                }

                if( op == '*'){
                    res = a * b;
                }

                if( op == '/'){
                    if(b>0) {
                        res = a / b;
                    }
                }

                if( op == '%'){
                    res = a % b;
                }
                System.out.println("The result is: "+ res);
            }
            else if(  op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
        }
    }
}
