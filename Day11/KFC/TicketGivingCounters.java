package com.tinesh.Day11.KFC;

public class TicketGivingCounters {
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
