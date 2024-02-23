package com.tinesh.Day20;

import java.util.Arrays;

import java.util.Scanner;

//This has the program to
//1.Definition of the DFS .
//2.To find whether the dfs is connected or not .
//3.To find the number of components in the disconnected graph
public class Dfs {
    public static void dfs(int[][] adj , boolean[] visitedArray , int sv , int noOfVertices){
        System.out.println(sv) ;
        visitedArray[sv] = true ;
        for(int i = 0 ; i<noOfVertices ;i++){
            if(adj[sv][i] == 1 && !visitedArray[i]){
                dfs(adj , visitedArray , i, noOfVertices) ;
            }
        }
    }

    private static void isConnected(boolean[] visitedArray, int noOfVertices) {
        boolean isConnected = true ;
        for(int i = 0 ; i<noOfVertices ; i++){
            if(!visitedArray[i]){
                isConnected = false ;
                break ;
            }
        }
        if(isConnected)
            System.out.println("Connected Graph");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of vertices : ") ;
        int vertices = sc.nextInt() ;
        System.out.println("Enter number of edges : ") ;
        int edges = sc.nextInt() ;
        int[][] adj = new int[vertices][vertices] ;
        for(int i = 0 ; i < edges ; i++){
            System.out.println("Enter the Starting Vertices : ") ;
            int sv = sc.nextInt() ;
            System.out.println("Enter the Ending Vertices : ") ;
            int ev = sc.nextInt() ;
            adj[sv][ev] = 1 ;
            adj[ev][sv] = 1 ;
        }
        for(int i = 0 ; i < vertices ; i++){
            for(int j = 0 ; j < vertices ; j++){
                System.out.print(adj[i][j]) ;
            }
            System.out.println();
        }
        Arrays.stream(adj).forEach(System.out::println) ;
        boolean[] visitedArray = new boolean[vertices] ;
        System.out.println("Depth First Search : ") ;
        dfs(adj,visitedArray,0,vertices);
        isConnected(visitedArray,vertices) ;
        noOfComponents(adj , visitedArray , 0 ,vertices) ;
    }
    private static void noOfComponents(int[][] adj, boolean[] visitedArray, int start, int vertices) {
        int componentsCount = 1 ;
        for(int i=0 ; i<vertices ;i++){
            if(!visitedArray[i]){
                dfs(adj , visitedArray , i , vertices) ;
                componentsCount++ ;
            }
        }
        System.out.println("Total number of components : "+componentsCount);
    }
}


//DFS completed successfully