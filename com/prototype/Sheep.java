package com.prototype;

public class Sheep implements Animal{
    @Override
    public Animal makeCopy() {
        Sheep copySheep = null;
        try {
            copySheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copySheep;
    }

    @Override
    public String toString() {
        return "Sheep";
    }
}
