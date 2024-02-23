//package com.tinesh;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//import java.util.Arrays;
//import java.util.Scanner ;
//
//public class Main{
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in) ;
//////        int n = sc.nextInt() ;
////        int n = 9 ;
//////        int[] arr = new int[n] ;
//////        int sum = 0 ;
//////        for(int i=0 ; i<n ; i++){
//////            arr[i] = sc.nextInt() ;
//////            sum += arr[i] ;
//////        }
////        int sum =1 ;
////        int[] arr = {-2,1,-3,4,-1,2,1,-5,4} ;
////        int maxSum = Integer.MIN_VALUE ;
////        int len = arr.length ;
////        int j = 0 ;
////        int k = len-1 ;
////        maxSum = sum ;
////        for(int i = 1 ; i<=len ; i++){
////            int curSum = sum ;
////            while(k<len-1){
////                curSum-= arr[j] ;
////                curSum+= arr[k+1] ;
////                maxSum = Math.max(curSum, maxSum);
////                j++ ;
////                k++ ;
////            }
////            j=0 ;
////            k=len-1-i ;
////            sum-=arr[k+1] ;
////            maxSum = sum>maxSum? sum : maxSum ;
////        }
////        System.out.println(maxSum) ;
////    }
////}
////
////
////class solution{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in) ;
//        String name = sc.nextLine() ;
//        int i = 0 ;
//        int len = name.length() ;
//        int j = len-1 ;
//
//        char[][] arr = new char[len][len] ;
//        while(i<=len-1 && j>=0){
//                arr[i][i] = name.charAt(i) ;
//                arr[i][j] = name.charAt(j) ;
//            System.out.println() ;
//            i++;
//            j--;
//        }
//        for(char[] ele : arr){
//            for(char ele1 : ele){
//                if(ele1==null)
//                System.out.print(ele1);
//            }
//            System.out.println();
//        }
//    }
//}