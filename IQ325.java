package com.company;

public class IQ325 {
    public static void main(String[] args) {
        int days = 31;
        int count = 0;

        for(int i = 1; i<=days; i++){
            if(i % 2 == 0){
                count ++;
            }

        }
        System.out.println(count);
    }
}
