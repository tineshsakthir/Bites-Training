package com.tinesh.Day3.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,7,8} ;
        int len = arr.length ;
        int minIndex , temp;
        for(int i = 0 ; i < len-1 ; i++){
            minIndex = i ;
            for(int j = i+1 ; j < len ; j++){
             if(arr[j]<arr[minIndex]){
                 minIndex = j ;
             }
            }
            if(minIndex != i ){
                temp = arr[minIndex] ;
                arr[minIndex]= arr[i] ;
                arr[i] = temp ;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
