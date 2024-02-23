package com.tinesh.Day20_BytesAssessment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighOccurenceChar {
    public static void main(String[] args) {
        HashMap<Character , Integer> map = new HashMap<>() ;
        HashMap<Character , Integer> map2 = new HashMap<>() ;
        Scanner sc = new Scanner(System.in) ;
        String letters = sc.nextLine() ;
        char[] lettersArray = letters.toCharArray();
        for(int i=0 ; i< lettersArray.length ;i++){
            char ele = lettersArray[i] ;
            int curVal = map.getOrDefault(ele , 0) ;
            map.put(ele , curVal+1) ;
            int curIndex = map.getOrDefault(ele , i) ;
            map2.put(ele , curIndex) ;
        }
        char maxCountELe = letters.charAt(0);
        int maxCount = Integer.MIN_VALUE;
        int minIndex = 0 ;
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue() > maxCount){
                maxCount  = (int)m.getValue() ;
                maxCountELe =(char)m.getKey() ;
            }
            if((int)m.getValue() == maxCount){
                char letter = (char)m.getKey() ;
                int map2IndexValue = Character.getNumericValue(map2.get(letter)) ;
                if(map2IndexValue>minIndex){
                    maxCountELe =letter ;
                }
            }
        }
        System.out.println(maxCountELe + " " + maxCount);
    }
}
