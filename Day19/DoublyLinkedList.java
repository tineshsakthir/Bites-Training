package com.tinesh.Day19;
public class DoublyLinkedList {
    static class node{
        node prev ;
        int data ;
        node next ;
        public node(int data){
            this.data = data ;
            prev = null ;
            next = null ;
        }
    }
    node insertAtBeginning(node head, int x){
        node newNode = getNode(x) ;
        if(head == null) {
            head = newNode ;
            return head;
        }else{
            newNode.next = head ;
            head.prev = newNode ;
             head = newNode ;
        }

        return head ;
    }
    node insertAtLast(node head ,int x){
        node newNode = getNode(x) ;
        if(head == null){
            head = newNode ;
        }else{
            node temp = head ;
            while(temp.next !=null){
                temp = temp.next ;
            }
            temp.next = newNode ;
            newNode.prev = temp ;
        }
        return head ;
    }
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        node head = doublyLinkedList.getNode(10) ;
        head = doublyLinkedList.insertAtBeginning(head , 20) ;
        head = doublyLinkedList.insertAtLast(head ,30) ;
        node curNode = head ;
        while(curNode != null){
            System.out.println(curNode.data);
            curNode =curNode.next ;
        }
    }
    private node getNode(int i) {
        return new node(i) ;
    }
}