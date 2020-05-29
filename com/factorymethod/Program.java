package com.factorymethod;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if ( sc.hasNextLine() ){
            String carName = sc.nextLine();
            Car car = CarFactory.getCar(carName);
            if(car!=null)System.out.println(car);
        }
    }


}
