package com.tinesh.Day11.kfcFullShop;

import com.tinesh.Day11.KFC.TicketGivingCounters;

import java.util.*;

public class Counter1 {
    int orderId = 1 ;
    public synchronized int getOrder() throws InterruptedException {
        System.out.println("Menu Available : ");
        int i = 1 ;
        for(Map.Entry m : Foods.itemPrice.entrySet()){
            System.out.println(" Enter" + i++ +" "+m.getKey() + " " + "$"+m.getValue() );
        }
        System.out.println("Enter the Food You Want : ");
        Boolean doYouWantToContinue = false ;
        Scanner sc = new Scanner(System.in) ;
        HashMap<Integer , Integer> itemOptionAndCount = new LinkedHashMap<>() ;
        do{
            System.out.println("Enter the Option : ");
            int curOption = sc.nextInt() ;
            sc.nextLine() ;
            System.out.println("Enter the Count : ");
            int curOptionCount = sc.nextInt() ;
            sc.nextLine() ;
            itemOptionAndCount.put(curOption ,curOptionCount) ;
            System.out.println("Do You want add some more Food : ");
            char doYouWantToContinueChar = sc.next().charAt(0) ;
            sc.nextLine() ;
            doYouWantToContinue = doYouWantToContinueChar == 'y' || doYouWantToContinueChar == 'Y';
        }while(doYouWantToContinue) ;
        System.out.println("Exited from Menu Selection!!!");
        Order curOrder  = new Order() ;
        curOrder.setOrderId(orderId);
        curOrder.setOrderOwner(Thread.currentThread());
        Double totPrice = 0.0 ;
        long totTime = 0 ;
        for(Map.Entry m : itemOptionAndCount.entrySet()){
            totPrice =+ (double) Foods.foodPrice.get((int)m.getKey());
            totTime =+  Foods.foodWaitingTime.get((int)m.getKey());
        }
        curOrder.setOrderPrice(totPrice);
        curOrder.setOrderWaitingTime(totTime);
        System.out.println(Thread.currentThread().getName() + "Your order has been processing....Please wait until.......");
        curOrder.prepareTheOrder();
        return orderId++ ;
    }
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter1 = new Counter1() ;
        Thread t1 = new Thread(()->{
            int ticketNumber = 0;
            try {
                ticketNumber = counter1.getOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Person1 : " + ticketNumber);
        } , "Thread1");
        t1.start() ;
        Thread t2 = new Thread(()->{
            int ticketNumber = 0;
            try {
                ticketNumber = counter1.getOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Person1 : " + ticketNumber);
        } , "Thread2");
        t2.start();
        Thread t3 =  new Thread(()->{
            int ticketNumber = 0;
            try {
                ticketNumber = counter1.getOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Person1 : " + ticketNumber);
        } , "Thread3");
        t3.start();
        Thread t4 =  new Thread(()->{
            int ticketNumber = 0;
            try {
                ticketNumber = counter1.getOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Person1 : " + ticketNumber);
        } , "Thread4") ;
        t4.start();
        Thread t5 = new Thread(()->{
            int ticketNumber = 0;
            try {
                ticketNumber = counter1.getOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Person1 : " + ticketNumber);
        } , "Thread5");
        t5.start();
    }
}
