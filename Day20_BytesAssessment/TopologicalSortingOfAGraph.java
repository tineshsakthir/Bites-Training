package com.tinesh.Day20_BytesAssessment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TopologicalSortingOfAGraph {
    public static void topological(int[][] adj,int vertices){
        int[] inDegree = new int[vertices] ;
        int[] outDegree = new int[vertices] ;
        Queue<Integer> queue = new LinkedList<>() ;
        for(int i = 0 ; i<vertices ; i++){
            for(int j=0 ; j<vertices ;j++){
                if(adj[i][j] == 1) inDegree[i]+=1 ; outDegree[j]+=1 ;
            }
        }
        for(int i = 0 ; i<vertices ;i++){
            if(inDegree[i] == 0) {
                queue.add(i) ;
            }
        }
        while(!queue.isEmpty()){
            int curEle = queue.remove() ;
            System.out.println(curEle);
            for(int i = 0 ; i< vertices ; i++){
                if(adj[i][curEle] == 1){
                    adj[i][curEle] = 0 ;
                    inDegree[i]-=1 ;
                    if(inDegree[i] ==0) queue.add(i) ;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of vertices : ");
        int vertices = sc.nextInt() ;
        System.out.println("Enter the number of edges : ");
        int edges = sc.nextInt() ;
        int[][] adj = new int[vertices][vertices]  ;
        for(int  i = 0 ; i<edges ; i++ ) {
            System.out.println("Enter the  starting vertex(0-indexing) : ");
            int sv = sc.nextInt();
            System.out.println("Enter the ending vertex(0-indexing) : ");
            int ev = sc.nextInt();
            adj[ev][sv] = 1;
        }
        topological(adj,vertices);
    }
}
