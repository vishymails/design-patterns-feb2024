package com.bvr.creational.prototype2;

public abstract class Vehicle {
    public int wheels;
    public long price;

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        this.wheels = vehicle.wheels;
        this.price = vehicle.price;
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle target);
}
