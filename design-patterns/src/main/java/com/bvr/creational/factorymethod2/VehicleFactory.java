package com.bvr.creational.factorymethod2;

public class VehicleFactory {

        public static Vehicle getVehicle(String vehicleType, int wheel) {
            if (vehicleType.equalsIgnoreCase("car")) {
                return new Car(wheel);
            } else if (vehicleType.equalsIgnoreCase("bike")) {
                return new Bike(wheel);
            }
            return null;
        }


}
