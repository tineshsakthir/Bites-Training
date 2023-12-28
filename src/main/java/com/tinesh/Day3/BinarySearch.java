package com.tinesh.Day3;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1,5,6,7,8,9} ;
        int low = 0 ;
        int high = arr.length ;
        int searchElement = 7 ;
        int res = binarySearch(arr , low , high , searchElement) ;
        System.out.println(res);
    }
    public static int binarySearch(int[] arr , int low , int high ,int target){
       int mid = (low + high) /2 ;
//        System.out.println(arr[mid]);
       if(low>high){
           return -1 ;
       }
       if(arr[mid] == target){
           return mid ;
       }
       else if(arr[mid]>target){
           return binarySearch(arr , low , mid-1 , target) ;

       }
       else {
           return binarySearch(arr , mid+1 , high ,target) ;
       }
    }
}
