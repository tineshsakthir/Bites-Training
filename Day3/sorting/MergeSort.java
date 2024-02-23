package com.tinesh.Day3.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr , int low ,int high){
        if(low >= high) return ;
        int mid = (low + high) / 2 ;
//        System.out.println(mid);
        mergeSort(arr , low , mid);
        mergeSort(arr , mid+1 , high);
        merge(arr , low , mid , high);

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> arr2 = new ArrayList<>() ;
        int left = low ;
        int right = mid+1 ;
        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                arr2.add(arr[left]) ;
                left++ ;
            }
            else{
                arr2.add(arr[right]);
                right++ ;
            }
        }
        while(left <= mid){
            arr2.add(arr[left]) ;
            left++ ;
        }
        while(right <= high){
            arr2.add(arr[right]);
            right++ ;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = arr2.get(i-low) ;
        }
//        Arrays.stream(arr).forEach(System.out::print);
//        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,7,8} ;
        int len = arr.length ;
        mergeSort(arr , 0 , len-1) ;
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();
    }
}