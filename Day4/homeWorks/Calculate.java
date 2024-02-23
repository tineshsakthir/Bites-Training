package com.tinesh.Day4.homeWorks;

public class Calculate {
    static Double add(Double a , Double b){ return a+b ; }
    static Double sub(Double a , Double b){ return a-b ; }
    static Double mul(Double a , Double b){ return a*b ; }
    static Double div(Double a , Double b){ return a/b ; }
    static Double mod(Double a , Double b){ return a%b ; }
    public static void calculateHere(Double a , Double b , String opp){
        Double result = switch (opp){
            case "+" ->  add(a , b ) ;
            case "-" ->  sub(a , b ) ;
            case "*" ->  mul(a , b ) ;
            case "/" ->  div(a , b ) ;
            case "%" ->  mod(a , b ) ;
            default ->    -1.0 ;
        };
        if(result == -1.0) System.out.println("Wrong Operator");
        else System.out.println("The result is "+ result);
    }
}
