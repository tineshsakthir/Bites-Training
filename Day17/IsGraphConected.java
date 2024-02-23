package com.tinesh.Day17;

import java.util.Scanner;
import java.util.Arrays ;
import java.util.Queue ;
import java.util.LinkedList ;
public class IsGraphConected
{
    static void bfs(int[][] adj, int v , int sv){
        Queue<Integer> queue = new LinkedList<>() ;
        int[] visited = new int[v] ;
        queue.add(sv) ;
        visited[sv] = 1 ;
        while(!queue.isEmpty()){
            int front = queue.remove() ;
            System.out.println(front) ;
            for(int i = 0 ; i < v ; i++){
                if(adj[front][i] != 0 && visited[i] == 0){
                    queue.add(i) ;
                    visited[i] = 1 ;
                }
            }
        }
        boolean connected = true ;
        for (int k : visited) {
            if (k == 0) {
                connected = false;
                break;
            }
        }
        if(connected ) System.out.println("The graph is connected !!!");
        else System.out.println("The graph is not connected !!!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of vertices : ") ;
        int vertices = sc.nextInt() ;
        System.out.println("Enter number of edges : ") ;
        int edges = sc.nextInt() ;
        int[][] arr = new int[vertices][vertices] ;
        for(int i = 0 ; i < edges ; i++){
            System.out.println("Enter the Starting Vertices : ") ;
            int s = sc.nextInt() ;
            System.out.println("Enter the Ending Vertices : ") ;
            int e = sc.nextInt() ;
//            System.out.println("Enter the Weight Between Vertices : ") ;
//            int w = sc.nextInt() ;
//            arr[s][e] = w ;
//            arr[e][s] = w ;
            arr[s][e] = 1 ;
            arr[e][s] = 1 ;
        }

        for(int i = 0 ; i < vertices ; i++){
            for(int j = 0 ; j < vertices ; j++){
                System.out.print(arr[i][j]) ;
            }
            System.out.println();
        }

        Arrays.stream(arr).forEach(System.out::println) ;

        System.out.println("Breath First Search : ") ;
        bfs(arr, vertices , 0) ;

    }
}
