package com.tinesh.Day3.patterns;

import java.util.Scanner;

public class first {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in) ;
            int dimension = scanner.nextInt() ;
            int starNumber = 2 ;
            int spaceNumber = dimension*2 - 2 ;
            int numberOfLine = dimension*2 - 1 ;
            boolean crossedhalf = false ;
            int numberOfLettersInEachLine = dimension*2 ;
            for(int i = 0 ; i < numberOfLine ; i++ ){
                for(int k = 0 ; k < starNumber/2 ; k++){
                    System.out.print("*") ;
                }
                for(int k = 0 ; k < spaceNumber ; k++){
                    System.out.print(" ") ;
                }
                for(int k = 0 ; k < starNumber/2 ; k++){
                    System.out.print("*") ;
                }
                if(spaceNumber == 0 && starNumber == numberOfLettersInEachLine){
                    crossedhalf = true ;
                }
                if(!crossedhalf){
                    starNumber+=2 ;
                    spaceNumber-=2 ;
                }
                else{
                    starNumber-=2  ;
                    spaceNumber+=2 ;
                }
                System.out.println("") ;
            }
        }
    }

