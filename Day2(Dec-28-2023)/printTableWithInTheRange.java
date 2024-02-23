package com.tinesh.Day2;

import java.util.Scanner;

public class printTableWithInTheRange {
    public static void main(String[] args) {
        int table = new Scanner(System.in).nextInt() ;
        int range = new Scanner(System.in).nextInt() ;
        for(int i =  1 ; i<range ; i++){
            System.out.println(table +" * " + i + " = " + table*i );
        }
    }
}
