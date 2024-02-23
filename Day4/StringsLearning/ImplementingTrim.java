package com.tinesh.Day4.StringsLearning;

public class ImplementingTrim {
    public static void main(String[] args) {
        String str = "  hello  " ;
//        System.out.println(str);
//        StringBuilder strArray = new StringBuilder(str.length()) ;
//        String res = "" ;
//        for(int i = 0 ; i< str.length(); i++){
//            if(str.charAt(i)!= ' '){
//                strArray.append(str.charAt(i)) ;
//            }
//        }
        String res = "" ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' '){
                res += String.valueOf(str.charAt(i)) ;
            }
        }
        System.out.println(res);

    }
}
