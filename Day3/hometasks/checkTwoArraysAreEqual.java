package com.tinesh.Day3.hometasks;

import java.util.Arrays;

public class checkTwoArraysAreEqual {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,6} ;
        int arr2[] = {2,3,4,5} ;
        if(Arrays.equals( arr1 , arr2 )){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    }
}