package com.tinesh.Day8;

import java.util.Scanner;

public class DefaultValueAssignmentChecking {
    static int a ;
    static String name ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        var a  = sc.nextInt() ;
        sc.nextLine() ;
        System.out.println("Enter name : ");
        var name = sc.nextLine() ;
        System.out.println(a + name);
    }
}
