package com.bvr.creational.builder;

public class Engineer {

    CarBuilderPlan carBuilder;

    public Engineer(CarBuilderPlan carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.getCar();
    }

    public void makeCar(){
        carBuilder.buildCarBody();
        carBuilder.buildEngine();
        carBuilder.buildElectronics();
    }

    public void getCarDetails(){
        carBuilder.getCarDetails();
    }


}
