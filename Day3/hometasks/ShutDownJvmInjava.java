package com.tinesh.Day3.hometasks;

public class ShutDownJvmInjava {
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,7,8} ;
        int len = arr.length ;
        for(int ele : arr){
            System.out.println(ele) ;
            if(ele == 4){
                System.exit(0);
            }
        }
    }
}
