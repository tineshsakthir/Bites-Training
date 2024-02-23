package com.tinesh.Day4.StringsLearning;

public class toStringEqualOrNot {
    public static void main(String[] args) {

        String str1 = "hai" ;
        String str2 = "hai" ;
        boolean different = false ;
        if(str1.length() == str2.length()) {
            for(int i = 0 ; i < str1.length() ;i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    continue;
                }
                else{
                   different = true ;
                   break ;
                }
            }
        }

        else{
            different = true ;
        }
        if(different){
            System.out.println("Both are different ?/?");
        }else{
            System.out.println("Both are same !!!");
        }
    }
}
