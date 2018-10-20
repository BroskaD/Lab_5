package com.company;

public class fclass2 extends fclass3 {
    public static void methodOfFclass2(){
        System.out.println("Метод второго класса");
    }

    public static void outputVariable(){
        fclass1 c = new fclass1();
        c.setA(3);
        System.out.println("В этой программе " + c.getA() + " класса");
    }
}
