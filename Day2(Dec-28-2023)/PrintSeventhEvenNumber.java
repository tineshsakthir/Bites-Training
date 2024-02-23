package com.tinesh.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSeventhEvenNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17} ;
        List<Integer> array =  Arrays.stream(a).filter(ele -> ele%2 == 0).boxed().collect(Collectors.toList()) ;
        array.stream().forEach(System.out::println) ;
    }
}
