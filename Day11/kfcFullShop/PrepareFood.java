package com.tinesh.Day11.kfcFullShop;

public class PrepareFood extends Thread{
    long time ;
    public void prepareFoodTime(long time) throws InterruptedException {
        this.time = time ;
        PrepareFood prepareFood = new PrepareFood() ;
        prepareFood.start();
    }
    public void run(){
       synchronized (this){
           try {
               Thread.sleep(time) ;
               notify();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
