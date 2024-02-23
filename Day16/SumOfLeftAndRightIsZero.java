package com.tinesh.Day16;

import java.util.Arrays;

public class SumOfLeftAndRightIsZero {
    public static void main(String[] args) {
        int[] arr = {1,2,3} ;
        int len = arr.length ;
        int[] arr1 = new int[len]
                ;
        int[] arr2 = new int[len] ;
        arr1[0] = arr[0] ;
        arr2[len-1] = arr[len-1] ;
        int i = 1 ,  j = len-2;
        while(i<len && j>=0){
            arr1[i] = arr1[i-1]+ arr[i] ;
            arr2[j] = arr2[j+1]+ arr[j] ;
            i++ ;
            j-- ;
        }
        int found = -1 ;
        i = 1 ;
        while(i<len-1){
            System.out.println("arr1 : "+arr1[i-1] + "arr2 : " + arr2[i+1]+" " );
            if(arr1[i-1]==arr2[i+1]){
                found = i ;
                break ;
            }
            i++ ;
        }
        System.out.println(found);

    }
}
