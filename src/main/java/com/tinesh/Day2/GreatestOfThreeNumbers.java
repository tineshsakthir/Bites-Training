package com.tinesh.Day2;

import java.util.Arrays;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        Arrays.stream(arr).reduce((maxElement , eachElement) -> eachElement < maxElement ? eachElement : maxElement)
                .ifPresent(System.out::println);
    }
}
