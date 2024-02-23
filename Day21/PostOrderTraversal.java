package com.tinesh.Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val;left = null ; right = null ;  }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class PostOrderTraversal {

    public void postorderTraversal(TreeNode node , List<Integer> list){
//         if(node == null) return  ;
//         postorderTraversal(node.left , list) ;
//         postorderTraversal(node.right , list ) ;
//         list.add(node.val) ;
        Stack<TreeNode> stack = new Stack<>() ;
        TreeNode cur = node ;
        while(true){
            while(cur!=null){
                stack.push(cur) ;
                cur = cur.left ;
            }
            if(stack.isEmpty()) break;
            TreeNode temp = stack.pop() ;
            list.add(temp.val) ;

            cur = temp.right ;
            if(cur!=null)
                list.add(cur.val) ;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>() ;
        postorderTraversal(root,list) ;
        return list ;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10) ;
        TreeNode right = new TreeNode(20) ;
        TreeNode left = new TreeNode(30) ;
        node.right = right ;
        right.left = left ;
        PostOrderTraversal postOrderTraversal  = new PostOrderTraversal() ;
        List<Integer>list = postOrderTraversal.postorderTraversal(node) ;
        for(int ele : list){
            System.out.println(ele);
        }


    }



}