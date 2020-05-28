package com.strategy;

public class CustomList {

    public ISort sort;

    public void customSort(){
        sort.sort();
    }

    public void setCustomSort(ISort sort){
        this.sort = sort;
    }
}
