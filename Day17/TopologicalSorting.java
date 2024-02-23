package com.tinesh.Day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TopologicalSorting {
    static void topologicalSorting(int[][] adj , int noOfVertex){
        int[] inDegree = new int[noOfVertex] ;
        for(int i = 0 ; i < noOfVertex ; i++){
            for(int j = 0 ; j < noOfVertex ; j++){
                if(adj[i][j] == 1 ){
                    inDegree[j]++ ;
                }
            }
        }
        Queue<Integer> queue = new LinkedList<>() ;
        for(int i = 0 ; i < noOfVertex ; i++){
            if(inDegree[i] == 0){
                queue.add(i) ;
            }
        }

        while(!queue.isEmpty()){
            int front = queue.remove() ;
            System.out.println(front + " ");
            for(int i = 0 ; i < noOfVertex ; i++){
                if(adj[front][i] == 1 ){
                    inDegree[i]-- ;
                    if(inDegree[i] == 0){
                        queue.add(i) ;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("No of vertices : ");
        int noOfVertex = sc.nextInt()  ;
        System.out.println("No of Edges : ");
        int noOfEdges = sc.nextInt() ;
        int[][] adj = new int[noOfVertex][noOfVertex] ;
        for(int i = 0 ; i < noOfEdges ; i++){
            System.out.println("Enter details for the edge one " + i);
            System.out.println("Enter the starting vertex : ");
            int sv = sc.nextInt() ;
            System.out.println("Enter the ending vertex : ");
            int ev = sc.nextInt() ;
            adj[sv][ev] = 1 ;
        }

        topologicalSorting(adj , noOfVertex);
    }
}
