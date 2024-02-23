//package com.tinesh.Day17;
//
//import java.util.*;
//
//
//public class BfsUsingAdjacencyList {
//
//    // Wrong answer . Need to correct the logic..............
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter number of vertices : ") ;
//        int vertices = sc.nextInt() ;
//        System.out.println("Enter number of edges : ") ;
//        int edges = sc.nextInt() ;
////        int[][] arr = new int[vertices][vertices] ;
//        List<List<Integer>> adjList = new ArrayList<>() ;
//        for(int i = 0 ; i < vertices ; i ++){
//            adjList.add(new ArrayList<>()) ;
//        }
//
//        for(int i = 0 ; i < edges ; i++){
//            System.out.println("Enter the Starting Vertices : ") ;
//            int s = sc.nextInt() ;
//            System.out.println("Enter the Ending Vertices : ") ;
//            int e = sc.nextInt() ;
//
////            arr[s][e] = 1 ;
////            arr[e][s] = 1 ;
//
//            adjList.get(s).add(e) ;
//            adjList.get(e).add(s) ;
//        }
//
////        for(int i = 0 ; i < vertices ; i++){
////            for(int j = 0 ; j < vertices ; j++){
////                System.out.print(arr[i][j]) ;
////            }
////            System.out.println();
////        }
////
////
////        Arrays.stream(arr).forEach(System.out::println) ;
//
//        System.out.println("Breath First Search : ") ;
//        bfs(adjList, vertices , 0 ) ;
//    }
//
//    private static void bfs(List<List<Integer>> adjList, int vertices, int sv) {
//        Queue<Integer> queue = new LinkedList<>() ;
//        queue.add(sv) ;
//        boolean[] visited = new boolean[vertices] ;
//        visited[sv] = true ;
//        while(!queue.isEmpty()){
//            int front = queue.remove() ;
//            System.out.println(front);
//            int frontLen = adjList.get(front).size()  ;
//            for(int i = 0 ; i < frontLen ; i++){
//                if(visited[adjList.get(front).get(i)]){
//                    queue.add(adjList.get(front).get(i)) ;
//                }
//            }
//        }
//    }
//}
