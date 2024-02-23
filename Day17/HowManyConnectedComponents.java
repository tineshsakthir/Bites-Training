//package com.tinesh.Day17;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//public class HowManyConnectedComponents
//{
//
//    // Wrong answer . Need to correct the logic..............
//
//
//    static int bfs(int adj[][] , int v , int sv , int[] visited , int count){
//        Queue<Integer> queue = new LinkedList<>() ;
//        queue.add(sv) ;
//        visited[sv] = 1 ;
//        while(!queue.isEmpty()){
//            int front = queue.remove() ;
//            System.out.println(front) ;
//            for(int i = 0 ; i < v ; i++){
//                if(adj[front][i] != 0 && visited[i] == 0){
//                    queue.add(i) ;
//                    visited[i] = 1 ;
//                }
//            }
//        }
//        for (int k : visited) {
//            if (k == 0) {
//                bfs(adj , v , sv , visited , count) ;
//                break;
//            }else{
//                return 0;
//            }
//        }
//        return count ;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter number of vertices : ") ;
//        int vertices = sc.nextInt() ;
//        System.out.println("Enter number of edges : ") ;
//        int edges = sc.nextInt() ;
//        int[][] arr = new int[vertices][vertices] ;
//        for(int i = 0 ; i < edges ; i++){
//            System.out.println("Enter the Starting Vertices : ") ;
//            int s = sc.nextInt() ;
//            System.out.println("Enter the Ending Vertices : ") ;
//            int e = sc.nextInt() ;
////            System.out.println("Enter the Weight Between Vertices : ") ;
////            int w = sc.nextInt() ;
////            arr[s][e] = w ;
////            arr[e][s] = w ;
//            arr[s][e] = 1 ;
//            arr[e][s] = 1 ;
//        }
//
//        for(int i = 0 ; i < vertices ; i++){
//            for(int j = 0 ; j < vertices ; j++){
//                System.out.print(arr[i][j]) ;
//            }
//            System.out.println();
//        }
//
//        Arrays.stream(arr).forEach(System.out::println) ;
//
//        System.out.println("Breath First Search : ") ;
//        System.out.println(" count : "+bfs(arr, vertices , 0 , new int[vertices] , 0))  ;
//
//    }
//}
