package com.bvr.creational.builder;

public class SedanBuilder extends CarBuilderPlan {

    private CarParts.carType carType = CarParts.carType.SEDAN;
    SedanBuilder() {
        System.out.println("Sedan Built");
    }
    public void buildCarBody() {
        car.setCarBody(carType);
    }

    public void buildEngine() {
        car.setEngine(carType);
    }

    public void buildElectronics() {
        car.setElectronics(carType);
    }
}


class SportsBuilder extends CarBuilderPlan {

    private CarParts.carType carType = CarParts.carType.SPORTS;
    SportsBuilder() {
        System.out.println("Sports Built");
    }
    public void buildCarBody() {
        car.setCarBody(carType);
    }

    public void buildEngine() {
        car.setEngine(carType);
    }

    public void buildElectronics() {
        car.setElectronics(carType);
    }
}


class LuxuryBuilder extends CarBuilderPlan {

    private CarParts.carType carType = CarParts.carType.LUXURY;
    LuxuryBuilder() {
        System.out.println("Luxury Built");
    }
    public void buildCarBody() {
        car.setCarBody(carType);
    }

    public void buildEngine() {
        car.setEngine(carType);
    }

    public void buildElectronics() {
        car.setElectronics(carType);
    }
}


