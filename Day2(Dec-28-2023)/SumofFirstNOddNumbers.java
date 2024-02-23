package com.tinesh.Day2;

import java.util.Scanner;

public class SumofFirstNOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int limit = scanner.nextInt() ;
        int sum = 0 ;
        for(int  i = 1 ; i < 2*limit ; i+=2){
            sum+=i ;
        }
        System.out.println(sum) ;
    }
}
