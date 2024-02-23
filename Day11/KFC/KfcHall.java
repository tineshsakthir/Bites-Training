package com.tinesh.Day11.KFC;

import java.util.Random;

public class KfcHall {
    public static void main(String[] args) throws InterruptedException {
        TicketGivingCounters counters = new TicketGivingCounters() ;
        Thread t1 = new Thread(()->{
            int ticketNumber = counters.counter1() ;
            System.out.println("Person1 : " + ticketNumber);
        });
        Random random = new Random() ;
        t1.start();
        t1.join();

        Thread t2 = new Thread(()->{
            int ticketNumber = counters.counter2() ;
            System.out.println("Person2 : " + ticketNumber);
        });
        t2.start();
        t2.join();
       Thread t3 =  new Thread(()->{
            int ticketNumber = counters.counter1() ;
            System.out.println("Person3 : " + ticketNumber);
        });
        t3.start();
        t3.join();
        Thread t4 =  new Thread(()->{
            int ticketNumber = counters.counter3() ;
            System.out.println("Person4 : " + ticketNumber);
        }) ;
        t4.start();
        t4.join();
        Thread t5 = new Thread(()->{
            int ticketNumber = counters.counter2() ;
            System.out.println("Person5 : " + ticketNumber);
        });
        t5.start();
        t5.join();
        Thread t6 = new Thread(()->{
            int ticketNumber = counters.counter1() ;
            System.out.println("Person6 : " + ticketNumber);
        });
        t6.start();
        t6.join();
        Thread t7 = new Thread(()->{
            int ticketNumber = counters.counter3() ;
            System.out.println("Person7 : " + ticketNumber);
        });
        t7.start();
        t7.join();
        Thread t8 = new Thread(()->{
            int ticketNumber = counters.counter2() ;
            System.out.println("Person8 : " + ticketNumber);
        });
        t8.start();
        t8.join();
       Thread t9 =  new Thread(()->{
            int ticketNumber = counters.counter3() ;
            System.out.println("Person9 : " + ticketNumber);
        });
        t9.start();
        t9.join();
       Thread t10 =  new Thread(()->{
            int ticketNumber = counters.counter2() ;
            System.out.println("Person10 : " + ticketNumber);
        });
        t10.start();
        t10.join();
    }
}
