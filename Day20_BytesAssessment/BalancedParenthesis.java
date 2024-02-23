package com.tinesh.Day20_BytesAssessment;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String brackets = sc.nextLine() ;
        Stack<Character> stack = new Stack<>() ;
        for(int i=0 ; i<brackets.length() ;i++){
            char curEle = brackets.charAt(i) ;
            if(curEle == '(') stack.push(curEle) ;
            else if(curEle==')'){

                if(!stack.isEmpty() && stack.peek() == '(') stack.pop() ;
                else{
                    System.out.println("Unbalanced parenthesis.....");
                    System.exit(0);
                }
            }
            else{
                System.out.println("Invalid Element......");
                System.exit(0);
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced Parenthesis.....");
        }else{
            System.out.println("Unbalanced parenthesis.....");
        }

    }
}
