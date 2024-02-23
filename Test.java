package com.tinesh;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int len = keyboard.nextInt() ;
        int [] arr = new int[len] ;
        for(int i = 0 ; i< len ; i++){
            arr[i] = keyboard.nextInt() ;
         }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
