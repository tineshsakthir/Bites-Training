package com.tinesh.Day2;

import java.util.Scanner;

public class EvenOrOddSwitch {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;

//        int num = sc.nextInt() ;
//        String res = (num % 2 == 0 ) ? "Even" : "Odd";
//        switch (res){
//            case "Even" -> System.out.println("Even");
//            case "Odd" -> System.out.println("Odd");
//            default -> System.out.println("wrong Inputs");
//        }
        String a = "Continue" ;
        while(!a.equals("exit")){
            System.out.println("Enter a name : ");
            a = sc.nextLine() ;
            System.out.println(a);
        }
    }
}
