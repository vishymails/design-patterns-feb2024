package com.bvr.creational.builder;

public class Car extends CarPlan{

    private CarParts engine, carBody, electronics;

    public void setEngine(CarParts.carType car){
        this.engine = new Engine(car);
    }

    public void setCarBody(CarParts.carType car){
        this.carBody = new CarBody(car);
    }

    public void setElectronics(CarParts.carType car){
        this.electronics = new Electronics(car);
    }

    public void getDetails(){
        System.out.println("Car is: " + engine.getName() + " " + carBody.getName() + " " + electronics.getName());
    }



}
