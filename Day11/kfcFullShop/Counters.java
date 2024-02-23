package com.tinesh.Day11.kfcFullShop;

public class Counters {

    private int ticketNumber = 1  ;
    public synchronized int counter1(){
        return ticketNumber++ ;
    }
    public synchronized int counter2(){
        return ticketNumber++ ;
    }
    public synchronized int counter3(){
        return ticketNumber++ ;
    }
}
