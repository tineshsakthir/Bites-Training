package com.tinesh.Day18;

import com.tinesh.Day16.StringToCharOfNumbers;

import java.util.Scanner;

class MyLinkedList{
    node head  = null ;
    node tail = null ;

    void deleteNode(int ele){
        if(head.data == ele){
            head = head.next ;
        }
        else{
            node previous = head ;
            node curNode = head.next ;
            while(curNode != null){
                if(curNode.data != ele){
                    previous = curNode ;
                    curNode = curNode.next ;
                }else{
                    if(curNode.next == null){
                        tail = previous ;
                    }
                    previous.next = curNode.next ;
                    break ;
                }
            }
        }
    }
    void insertAtBeginning(int ele){
        node curNode = new node(ele) ;
        curNode.next = head ;
        head  = curNode ;
    }

    public void insertAtEnd(int ele) {
        node curNode = new node(ele) ;
        if(head == null){
            head = curNode ;
        }
        else{
            tail.next = curNode ;
        }
        tail = curNode ;
    }
    public void insertAtMiddle(int index , int ele){
        if(head == null) {
            head = new node(ele) ;
        }
        else{
            node previous = null ;
            node curNode = head ;
            int count = 0 ;

            while(curNode.next!=null && count<index){
                previous = curNode ;
                curNode = curNode.next ;
                count++ ;
            }
            node newNode = new node(ele) ;
            if(previous == null ) {
                newNode.next =curNode ;
                head = newNode ;
            }
            else{
                previous.next = newNode ;
                newNode.next =curNode ;
            }
//            node temp = curNode.next ;
//            curNode.next = newNode ;
//            newNode.next = temp ;
        }
    }

    public void deleteAtBeginning() {
        if(head !=null){
            head = head.next ;
        }
    }

    public void deleteAtEnd() {
        if(head != null){
            node curNode = head ;
            if(curNode.next == null){
                head = null ;
            }
            else{
                while(curNode.next.next != null){
                    curNode = curNode.next ;
                }
                curNode.next = null ;
            }
        }
    }
}

class node{
    int data ;
    node next ;
    node(int data){
        this.data  = data ;
    }
}

public class MyLinkedListImplementation {
    public static void main(String[] args) {

//        node n = new node(10) ;
//        System.out.println(n.data + " " + n.next);
//        node n1 = new node(20)  ;
//        n.next = n1 ;
//        System.out.println(n1.data + " " + n.next);

        MyLinkedList linkedList = new MyLinkedList() ;
        Scanner sc  = new Scanner(System.in) ;
        boolean proceed = true ;
        while(proceed){
            System.out.println("MENU\n1. Insert at End \n2.Insert at Beginning \n3.Insert at Middle \n 4.Delete the Element 5.Deletion At Beginning 6.Deletion At Last \n 7.Print the Linked list \n 8.Exit");
            System.out.println("Enter an option : ");
            int option = sc.nextInt() ;
            switch (option) {
                case 1 ->{
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt() ;
                    linkedList.insertAtEnd(ele);
                }
                case 2 ->{
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt() ;
                    linkedList.insertAtBeginning(ele);
                }

                case 3 -> {
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt() ;
                    System.out.println("Enter the index to insert : ");
                    int index = sc.nextInt();
                    linkedList.insertAtMiddle(index, ele);
                }
                case 4 -> {
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt() ;
                    linkedList.deleteNode(ele);
                }
                case 5 -> linkedList.deleteAtBeginning() ;
                case 6 -> linkedList.deleteAtEnd() ;
                default -> System.out.println("Wrong option...Try again");
            }
            printLinkedList(linkedList);
            System.out.println("********************");
            System.out.println("Do you want to continue...(y for Yes/n for No)");
            proceed = sc.next().charAt(0) == 'y';
        }

//        linkedList.insertAtEnd(10) ;
//        linkedList.insertAtEnd(20) ;
//        linkedList.insertAtEnd(30) ;
//        linkedList.insertAtEnd(40) ;
//        linkedList.insertAtBeginning(50);
//        linkedList.insertAtBeginning(60);
//        linkedList.insertAtMiddle(2,70);
//        linkedList.insertAtMiddle(6 ,80);
//        linkedList.insertAtMiddle(20 , 90);
//        linkedList.insertAtMiddle(0, 100);
//        linkedList.deleteNode(60);
        printLinkedList(linkedList);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
    public static void printLinkedList(MyLinkedList linkedList){
        System.out.println("********************");
        System.out.println("My Linked List : ");
        if(linkedList.head != null){
            System.out.println("Head :" + linkedList.head.data);
            System.out.println("Tail :" + linkedList.tail.data);
            node printingNode = linkedList.head ;
            while(true){
                System.out.println(printingNode.data) ;
                if (printingNode.next ==null) break ;
                printingNode = printingNode.next ;

            }
        }else {
            System.out.println("The Linked List is empty!!!!");
        }
        System.out.println("********************");
    }
}
