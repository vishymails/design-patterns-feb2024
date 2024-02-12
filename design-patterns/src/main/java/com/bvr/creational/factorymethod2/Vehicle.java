package com.bvr.creational.factorymethod2;

abstract class Vehicle {

    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel :" + this.getWheel();
    }
}
