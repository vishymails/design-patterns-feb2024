package com.bvr.creational.factorymethod2;

public class Car extends Vehicle{

    int wheel;

    Car(int wheel){
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }

}
