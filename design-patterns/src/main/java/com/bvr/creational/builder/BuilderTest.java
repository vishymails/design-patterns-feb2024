package com.bvr.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        CarBuilderPlan carBuilder = new SedanBuilder();
        Engineer engineer = new Engineer(carBuilder);
        engineer.makeCar();
        Car car = engineer.getCar();
        car.getDetails();

        carBuilder = new SportsBuilder();
        engineer = new Engineer(carBuilder);
        engineer.makeCar();
        car = engineer.getCar();
        car.getDetails();

        carBuilder = new LuxuryBuilder();
        engineer = new Engineer(carBuilder);
        engineer.makeCar();
        car = engineer.getCar();
        car.getDetails();

    }

}
