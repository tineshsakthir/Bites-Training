package com.tinesh.Day11.kfcFullShop;

import java.util.Random;

public class Order extends Thread {
    private static long alreadyOrderWaitingTime = 0 ;
    private int orderId ;
    private Thread orderOwner ;
    private long orderWaitingTime ;
    private double orderPrice ;

    public void prepareTheOrder() throws InterruptedException {
        Order order = new Order() ;
        order.start();
//        alreadyOrderWaitingTime = alreadyOrderWaitingTime + orderWaitingTime ;
//        Thread.sleep(alreadyOrderWaitingTime+orderWaitingTime);
//        alreadyOrderWaitingTime = alreadyOrderWaitingTime - orderWaitingTime ;
    }
    public void run() {
        synchronized (this){
            PrepareFood prepareFood = new PrepareFood() ;
            alreadyOrderWaitingTime = alreadyOrderWaitingTime + orderWaitingTime ;
            try {
                prepareFood.prepareFoodTime(alreadyOrderWaitingTime+orderWaitingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                wait(orderWaitingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            alreadyOrderWaitingTime = alreadyOrderWaitingTime - orderWaitingTime ;
            System.out.println(Thread.currentThread().getName() + " : Your food have been made Please collect it....");
        }
    }

    public static long getAlreadyOrderWaitingTime() {
        return alreadyOrderWaitingTime;
    }

    public static void setAlreadyOrderWaitingTime(long alreadyOrderWaitingTime) {
        Order.alreadyOrderWaitingTime = alreadyOrderWaitingTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Thread getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(Thread orderOwner) {
        this.orderOwner = orderOwner;
    }

    public long getOrderWaitingTime() {
        return orderWaitingTime;
    }

    public void setOrderWaitingTime(long orderWaitingTime) {
        this.orderWaitingTime = orderWaitingTime;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
