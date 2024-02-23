package com.tinesh.Day14;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue  = new PriorityQueue<>(Comparator.reverseOrder()) ;
        queue.offer(100) ;
        queue.offer(200) ;
        queue.offer(300) ;
        queue.offer(400) ;
        queue.offer(500) ;
        System.out.println(queue);
    }
}
