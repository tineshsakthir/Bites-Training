package com.tinesh.Day4.StringsLearning;

public class CheckingForNewObjectCreation {

    public static void main(String[] args) {
        String name = "Tinesh " ;
        String trimedName = name.trim() ;
        System.out.println(name) ;
        System.out.println(trimedName.hashCode()) ;
    }
}
