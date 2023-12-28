package com.tinesh.Day3.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,7,8} ;
        int len = arr.length ;
        int temp ;
        for(int i = 1 ; i < len ; i++ ) {
            for(int j = i-1 ; j >= 0 ; j--) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
