package com.prototype;

public class Program {

    public static void main(String[] args) {

        Sheep mary = new Sheep();
        Sheep clonedSheep = (Sheep) AnimalFactory.getCopy(mary);
        System.out.println("HashCode : "+mary.hashCode() + " " +clonedSheep.hashCode());

    }
}
