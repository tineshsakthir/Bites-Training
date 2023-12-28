package com.tinesh.Day2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Float interest = scanner.nextFloat() ;
        Float PrincipleAmount = scanner.nextFloat() ;
        System.out.println("You interest is "+ PrincipleAmount * interest / 100) ;

    }
}
