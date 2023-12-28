package com.tinesh.Day2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Float length = scanner.nextFloat() ;
        Float breath = scanner.nextFloat() ;
        System.out.println("The area of the Triangle is "+ length * breath /2) ;
    }
}
