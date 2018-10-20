package com.company;

public class fclass1 {

    private static int a;

    public int getA(){
        return a;
    }

    public void setA(int b) {
        this.a = b;
    }

    public static void methodOfFclass1(){
        System.out.println("Метод первого класса");
    }

    public static void main(String[] args) {
        fclass2.methodOfFclass2();
        fclass3.methodOfFclass1();
        fclass3.methodOfFclass3();
        fclass2.outputVariable();
    }
}
