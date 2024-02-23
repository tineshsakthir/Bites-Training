package com.tinesh.Day9;

public class UsingSingleton {
    public static void main(String[] args) {
        System.out.println(SingletonDesignPattern.getObj());
        System.out.println(SingletonDesignPattern.getObj());
        SingletonDesignPattern obj1 = SingletonDesignPattern.getObj() ;
        obj1.close() ;
    }
}
