package com.factorymethod;

public class CarFactory {
    public static Car getCar(String name){
        if( name.equals("Volvo") ){
            return new Volvo();
        }
        else if( name.equals("Tesla") ){
            return new Tesla();
        }
        else
            return null;
    }
}
