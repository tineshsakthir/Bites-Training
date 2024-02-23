package com.tinesh.Day8;

public class ConstructorInvokingTimePrint {
    static int count = 0  ;


    //THe below is not good  bro
//    public ConstructorInvokingTimePrint(){
//        count++ ;
//    }

    //The best and the optimized way of updating the count
    {
        count++ ;
    }

    public static void main(String[] args) {
        ConstructorInvokingTimePrint obj1 = new ConstructorInvokingTimePrint() ;
        ConstructorInvokingTimePrint obj2 = new ConstructorInvokingTimePrint() ;
        ConstructorInvokingTimePrint obj3 = new ConstructorInvokingTimePrint() ;
        ConstructorInvokingTimePrint obj4 = new ConstructorInvokingTimePrint() ;
        System.out.println(count);
    }
}
