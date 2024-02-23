package com.tinesh.Day2;

public class doWhileFIbonacci  {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1 ;
        do{
            System.out.println(a) ;
            int temp = a+b ;
            b = temp ;
            a = temp - a ;
        }while(a<100);
    }
}