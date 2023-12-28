package com.tinesh.Day1;

public class Test {
    int x = 10 ;
    public static void main(String[] args) {
        Test t  =  new Test() ;
        System.out.println(t.x);  //non-static variable x cannot ne referenced from the static context.
        //But we can access that by the object reference
        t.m1();
    }
    public void m1(){
        System.out.println(x);
    }
}
