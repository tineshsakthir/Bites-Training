package com.tinesh.Day16;

import java.util.HashMap;

class Solution {
    public int clumsy(int n) {
        int res = 1  ;
        if(n == 1) return res ;
        else{
            HashMap<Integer , Integer> map = new HashMap<>() ;
            int numIndex = 0 ;
            while(n>0){
                map.put(numIndex , n) ;
                numIndex +=2 ;
                n-- ;
            }
            System.out.println(map.toString());
            int left , right ;
            int cres = 0 ;
            int mulIndex = 0 ;
            while(map.get(mulIndex+2) !=null ){
                System.out.println("mul section : ");
                left  = map.get(mulIndex) ;
                right = map.get(mulIndex + 2) ;
                if(mulIndex !=0){
                    left = -left ;
                }
                map.put(mulIndex+2 , left * right ) ;
                map.remove(mulIndex) ;
                cres = mulIndex +2 ;
                System.out.println("left : " + left);
                System.out.println("right : "+ right);
                System.out.println("result : " + map.get(cres));
                System.out.println("Stored index : "+cres);
                mulIndex += 8 ;

            }
            System.out.println(map.toString());
            int divIndex = 2 ;
            while(map.get(divIndex+2) !=null ){
                System.out.println("div section : ");
                left = map.get(divIndex) ;
                right = map.get(divIndex + 2) ;
                map.remove(divIndex) ;
                // int res = left/right ;
                map.put(divIndex+2 , (int)left/right) ;
                cres = divIndex + 2 ;
                divIndex += 8 ;
                System.out.println("left : " + left);
                System.out.println("right : "+ right);
                System.out.println("result : " + map.get(cres));
                System.out.println("Stored index : "+cres);
            }
            System.out.println(map.toString());

            int plusIndex = 4 ;
            while(map.get(plusIndex+2) !=null){
                System.out.println("plus section : ");
                left = map.get(plusIndex) ;
                map.remove(plusIndex) ;
                right = map.get(plusIndex + 2) ;
                map.put(plusIndex +2 , left + right) ;
                cres = plusIndex + 2 ;
                plusIndex += 8 ;
                System.out.println("left : " + left);
                System.out.println("right : "+ right);
                System.out.println("result : " + map.get(cres));
                System.out.println("Stored index : "+cres);
            }
            System.out.println(map.toString());

            int minusIndex = 6 ;
            while(map.get(minusIndex) != null){
                System.out.println("minus section : ");
                left = map.get(minusIndex) ;

                System.out.println(left);
                if(map.get(minusIndex+2) == null){
                    System.out.println("hi");
                    minusIndex += 8 ;
                    int curIndex =  minusIndex ;

                    System.out.println("first search : "+minusIndex);
                    if(map.get(minusIndex) == null ){
                        int i = 2 ;
                        while(i>0){
                            curIndex-=2 ;
                            if(map.get(curIndex) != null){
                                break ;
                            };
                            i-- ;
                        }
                        if(map.get(curIndex) == null) break ;
//                        minusIndex+=2 ;
//                        System.out.println("second search : "+minusIndex);
//                        if(map.get(minusIndex) ==null ) break ;

                    }
                    right = map.get(curIndex) ;
                    cres = curIndex ;
                }
                else{
                    cres = minusIndex + 2  ;
                    right = map.get(minusIndex+2) ;
                    minusIndex += 8 ;
                }
                if(right>0) {
                    map.put(cres , left - right) ;
                }else{
                    map.put(cres , left + right) ;
                }

                System.out.println("left : " + left);
                System.out.println("right : "+ right);
                System.out.println("result : " + map.get(cres));
                System.out.println("Stored index : "+cres);
            }
            System.out.println(map.toString());
            System.out.println(cres);
            res = map.get(cres) ;
        }
        return res ;
    }
}
public class ClumsyFactorial {
    public static void main(String[] args) {
        Solution sol = new Solution() ;
//        System.out.println("Answer : ");
        System.out.println("Answer : "+sol.clumsy(5)) ;
    }
}
