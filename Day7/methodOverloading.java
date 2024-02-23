package com.tinesh.Day7;

public class methodOverloading {
    public static void findMax(Object a , Object b ){
        try{
            System.out.println((int)a>(int)b?a:b);
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        findMax(1,3);
    }
}
