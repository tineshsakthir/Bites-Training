package com.tinesh.Day11.kfcFullShop;

import java.util.ArrayList;
import java.util.HashMap;

public class Foods {
    static HashMap<String , Integer> itemPrice = new HashMap<>();
    static {
        itemPrice.put("Dosa" , 10) ;
        itemPrice.put("Idly" , 10) ;
        itemPrice.put("Porotta" , 15) ;
        itemPrice.put("kari Dosa" , 20) ;
    }
    static HashMap<String ,Long> itemWaitingTime = new HashMap<>() ;
    static {
        itemWaitingTime.put("Dosa" , 5000L) ;
        itemWaitingTime.put("Idly" , 4000L) ;
        itemWaitingTime.put("Porotta" , 6000L) ;
        itemWaitingTime.put("kari Dosa" , 15000L) ;
    }

    static ArrayList<Integer> foodPrice = new ArrayList<>(itemPrice.values()) ;
    static ArrayList<Long> foodWaitingTime = new ArrayList<>(itemWaitingTime.values()) ;

}
