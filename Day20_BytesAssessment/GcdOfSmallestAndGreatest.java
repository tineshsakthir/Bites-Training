package com.tinesh.Day20_BytesAssessment;

import java.util.Scanner;

public class GcdOfSmallestAndGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int small = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i<n ;i++){
            int curEle = sc.nextInt() ;
            small = Math.min(small , curEle) ;
            max = Math.max(max , curEle ) ;
        }
        System.out.println(small +" "+ max);
        System.out.println(gcd(small , max));
    }
    public static int gcd(int x , int y) {
        if(x==0) return y ;
        if(y==0) return x ;
        if(x==y) return x ;
        while(x!=y){
            if(x>y) x = x-y ;
            else y = y-x ;
        }
        return x ;
    }
}
