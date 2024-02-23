package com.tinesh.Day4.StringsLearning;
public class PalindromeOrNot {
    public static void main(String[] args) {

        String str = "DAAD" ;
        int mid = str.length() /2 ;
        if(str.length() % 2 != 0 ){
            mid = mid +1 ;
        }
        int limit = str.length() /2 ;
        Boolean pal = true ;
        for(int i = limit-1 ; i >=0; i-- ){
            if(!(str.charAt(i) == str.charAt(mid++))){
                pal = false;break;
            }
        }
        if(pal == true){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not Palindrome");
        }
    }
}
