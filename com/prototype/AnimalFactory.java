package com.prototype;

public class AnimalFactory {

    public static Animal getCopy(Animal animal){
        return animal.makeCopy();
    }
}
