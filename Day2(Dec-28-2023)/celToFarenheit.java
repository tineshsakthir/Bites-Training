package com.tinesh.Day2;

import java.util.Scanner;
import java.util.function.Function;

public class celToFarenheit {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Float celInput = scanner.nextFloat();
//        System.out.println(( Float.valueOf(celInput) * Float.valueOf(9)/Float.valueOf(5))+Float.valueOf(32));
        Function<Float ,Float> celToFarenheit =
                ( cel )-> ( Float.valueOf(cel) * Float.valueOf(9)/Float.valueOf(5))+Float.valueOf(32) ;
        System.out.println(celToFarenheit.apply(celInput)); ;

    }
}
