package com.strategy;

public class Program {
    public static void main(String[] args) {

        CustomList listA = new CustomListA();
        CustomList listB = new CustomListB();

        listA.customSort();
        listB.customSort();
    }
}
