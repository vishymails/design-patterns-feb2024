package com.bvr.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        CarPlan carPlan = new SedanCar(new RedFinish());
        carPlan.paintCar();

        carPlan = new SportsCar(new GreenFinish());
        carPlan.paintCar();

    }
}
