package com.tinesh.Day4.homeWorks;

import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String continueOrNot ;
        do{
            System.out.print("\nEnter Number 1 : ") ;
            Double a = scanner.nextDouble() ;
            System.out.print("\nEnter Number 2 : ");
            Double b = scanner.nextDouble() ;
            System.out.print("\nEnter the operator(+ , - , / , *): ") ;
            String opp = scanner.next() ;
            Calculate.calculateHere(a,b,opp) ;
            System.out.println("Do You want to continue") ;
            continueOrNot = scanner.next() ;
        }while (continueOrNot.equals("Y") || continueOrNot.equals("y")) ;
    }
}