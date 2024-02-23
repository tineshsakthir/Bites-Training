package com.tinesh.Day19;

public class SingularCircularLinkedList {
    circularNode head ;
    circularNode tail ;
    SingularCircularLinkedList(){
        head = null ;
        tail = null ;
    }
    class circularNode {
        int data;
        circularNode next;

        circularNode(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        SingularCircularLinkedList singularCircularLinkedList = new SingularCircularLinkedList() ;
        singularCircularLinkedList.addElementAtLast(10) ;
    }

    private void addElementAtLast(int i) {
        if(tail == null){
            head = tail = getNode(i) ;
            tail.next = head ;
        }
        else{
            circularNode newNode = getNode(i) ;
            newNode.next = tail.next ;
            tail.next = newNode ;
        }
    }
    private void addElementAtFirst(int i){
        if(tail == null) {
            head = tail = getNode(i) ;
        }else{
            circularNode node = getNode(i) ;

        }
    }

    private circularNode getNode(int x){
        return new circularNode(x) ;
    }
}
