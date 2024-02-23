package com.tinesh.Day12.ProducerConsumer;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

class IceCream{
    private final LinkedList<String> availableIceCream = new LinkedList<>() ;

    public synchronized void makeIceCream() throws InterruptedException {
        if(availableIceCream.size() >=2){
            System.out.println("Waited by Producer");
            wait() ;
        }
        System.out.println("Ice Cream Produced!!!");
        availableIceCream.add("Strawberry Ice Cream") ;
        notify() ;
    }
    public synchronized void getIceCream() throws InterruptedException {
        if(availableIceCream.isEmpty()){
            System.out.println("Waited by consumer");
            wait() ;
        }
        System.out.println("Ice Cream Got!!");
        System.out.println(availableIceCream.removeFirst()) ;
        notify() ;
    }
}

public class ProducerConsumerRunner {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream() ;
        Thread Consumer1 = new Thread(()->{
            for(int i = 0 ; i<16 ;i++){
                try{
                    iceCream.getIceCream();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        } , "Consumer1");
        Consumer1.start();
        Thread Consumer2 = new Thread(()->{
            for(int i = 0 ; i<16 ;i++){
                try{
                    iceCream.getIceCream();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        } , "Consumer2");
        Consumer2.start();
        Thread Producer = new Thread(()->{
            for(int i = 0 ; i<32 ;i++){
                try{
                    iceCream.makeIceCream();
                }
                catch(InterruptedException e){
                e.printStackTrace() ;
            }
        }
        } ,"Producer");
        Producer.start();
    }
}
