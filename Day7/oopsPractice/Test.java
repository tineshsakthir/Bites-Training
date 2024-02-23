package com.tinesh.Day7.oopsPractice;

public class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent() ;
        p1.properties() ;
        // p1.business() ; Not available
        Children c1 = new Children() ;
        c1.properties();
        c1.business();

        Parent p2 = new Children() ;
        p2.properties();
      //  p2.business() ; // not Possible


    }
}

