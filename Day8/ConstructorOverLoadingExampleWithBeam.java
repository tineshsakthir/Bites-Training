package com.tinesh.Day8;

public class ConstructorOverLoadingExampleWithBeam {
    String beamName = "Chotta beam";
    int enemyAge ;
    String enemyName ;

    public ConstructorOverLoadingExampleWithBeam(int enemyAge , String enemyName){
        this.enemyAge = enemyAge ;
    }
    public ConstructorOverLoadingExampleWithBeam(String enemyName){
        this.enemyAge = 23 ;
        this.enemyName = enemyName ;
    }
    public ConstructorOverLoadingExampleWithBeam(){
        this.enemyAge = 20 ;
        this.enemyName = "Subramani" ;
    }
    public  void updateName(){
        this.enemyName = "Vignesh" ;
    }
    public static void main(String[] args) {
        ConstructorOverLoadingExampleWithBeam obj = new ConstructorOverLoadingExampleWithBeam(20 , "kalia");
        ConstructorOverLoadingExampleWithBeam obj2 = new ConstructorOverLoadingExampleWithBeam("Thiru") ;
        ConstructorOverLoadingExampleWithBeam obj3 = new ConstructorOverLoadingExampleWithBeam() ;
        System.out.println(obj);
        System.out.println("---------------------");
        System.out.println(obj2);
        System.out.println("---------------------");
        System.out.println(obj3);
    }

    @Override
    public String toString() {
        return "ConstructorOverLoadingExampleWithBeam{" +
                "beamName='" + beamName + '\'' +
                ", enemyAge=" + enemyAge +
                ", enemyName='" + enemyName + '\'' +
                '}';
    }
}
