package com.tinesh.Day9;

public class SingletonDesignPattern {
    private static SingletonDesignPattern obj ;
    public static SingletonDesignPattern getObj(){
        if(obj == null) {
            obj = new SingletonDesignPattern() ;
        }
        return obj ;
    }

    public void close() {
        obj = null ;
    }
}
