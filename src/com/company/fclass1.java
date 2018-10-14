package com.company;

public class fclass1 {

    protected static int a = 3;

    public static void main(String[] args) {
        fclass2.methodOfFclass2();
        fclass3.methodOfFclass1();
        fclass3.methodOfFclass3();
        System.out.println("В этой программе " + fclass2.outputVariable() + " класса");
    }

     public static void methodOfFclass1(){
         System.out.println("Метод первого класса");
     }
}
