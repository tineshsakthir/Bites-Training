package com.tinesh.Day2;

import java.util.Scanner;

public class PrintTotalAndAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int range = scanner.nextInt() ;
        int sum = 0 ;
        int i = range ;
        while(i>0){
            sum+=scanner.nextInt() ;
            i--;
        }
        System.out.println("Sum : " + sum);
        float avg = Float.valueOf(sum) / Float.valueOf(range) ;
        System.out.println("Avg : " + avg);
        int a = 12 ;

        Object[] obj = {1, "Hello" , 1.3 } ;
        System.out.println(obj[0]);
    }
}
