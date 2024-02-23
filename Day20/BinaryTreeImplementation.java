package com.tinesh.Day20;

import com.sun.source.tree.Tree;

class BinaryTree{
    TreeNode root = null ;
    public void addNode(int val) {
        TreeNode newNode = new TreeNode(val) ;
        if(root == null) {
            root =  newNode ;
        }else{
            TreeNode curNode = root ;
            while(curNode.left !=null && curNode.right !=null){
                if(curNode.val > val){
                    curNode = curNode.left ;
                }else{
                    curNode = curNode.right ;
                }
            }
            if(val> curNode.val){
                curNode.right = newNode ;
            }else{
                curNode.left = newNode ;
            }
        }
    }
}

class TreeNode{
    TreeNode left ;
    int val ;
    TreeNode right ;
    TreeNode(int x){
        left = null ;
        right = null ;
        val = x ;
    }
}

public class BinaryTreeImplementation {
    public static void main(String[] args) {
       TreeNode root = new TreeNode(1);
       TreeNode left = new TreeNode(2) ;
       TreeNode right = new TreeNode(3) ;
       root.left = left ;
       root.right = right ;

       BinaryTree binaryTree = new BinaryTree() ;
       binaryTree.addNode(5);
    }
}
