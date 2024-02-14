package com.bvr.structural.bridge;

public class SportsCar implements CarPlan{
    private ColorFinishPlan colorFinishPlan;

    public SportsCar(ColorFinishPlan colorFinishPlan){
        this.colorFinishPlan = colorFinishPlan;
    }

    @Override
    public void paintCar() {
        this.colorFinishPlan.paint();
    }
}
