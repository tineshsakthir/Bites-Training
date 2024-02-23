package com.tinesh.Day3.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,7,8} ;
        int len = arr.length ;
        int flag = 0 ;
        while(flag == 0 ){
            flag = 1 ;
            for(int i =0 ; i < len-1 ; i++){
                if(arr[i+1] <arr[i]){
                    int temp = arr[i+1] ;
                    arr[i+1] = arr[i] ;
                    arr[i] = temp ;
                    flag = 0 ;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
