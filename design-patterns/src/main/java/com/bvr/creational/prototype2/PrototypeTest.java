package com.bvr.creational.prototype2;

public class PrototypeTest {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(4, 30000, "red");
        Vehicle vehicle2 = vehicle1.clone();

        vehicle2.isClone(vehicle1);
        vehicle1.isClone(vehicle2);


        Vehicle vehicle3 = new BiCycle(2, 10000, true);
        Vehicle vehicle4 = vehicle3.clone();

        vehicle3.isClone(vehicle4);
        vehicle4.isClone(vehicle3);

        vehicle3.isClone(vehicle1);


    }
}
