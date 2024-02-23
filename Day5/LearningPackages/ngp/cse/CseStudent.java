package com.tinesh.Day5.LearningPackages.ngp.cse;

public class CseStudent {
    public String pubVarName = "TINESH SAKTHI R" ;
    protected String proVarFatherName = "K V RAJA" ;
    private int priVarIncome = 10;
    int defVarAge = 21;
    public void  sayName(){
        System.out.println(pubVarName);
    }
    protected void sayFatherName(){
        System.out.println(proVarFatherName);
    }
    private void sayIncome(){
        System.out.println(priVarIncome);
    }
    void sayAge(){
        System.out.println(defVarAge);
    }
}
