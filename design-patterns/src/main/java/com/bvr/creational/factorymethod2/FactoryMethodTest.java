package com.bvr.creational.factorymethod2;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car", 4);
        Vehicle bike = VehicleFactory.getVehicle("bike", 2);
        System.out.println(car);
        System.out.println(bike);
    }

}
