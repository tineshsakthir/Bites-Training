package com.tinesh.Day2;

import java.util.Scanner;

public class PrintOddIndexedEvenNumbersInARange {
    public static void main(String[] args) {
        int limit = new Scanner(System.in).nextInt() ;
        for(int i = 0; i< limit ; i = i+2){
            if((i/2)%2==0){
                System.out.println(i+1);
            }
        }
    }
}
