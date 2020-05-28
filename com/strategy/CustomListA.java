package com.strategy;

public class CustomListA extends CustomList {

    public CustomListA(){
        this.sort = new QuickSort();
    }
}
