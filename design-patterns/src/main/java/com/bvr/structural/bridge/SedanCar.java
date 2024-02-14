package com.bvr.structural.bridge;

public class SedanCar implements CarPlan{
    private ColorFinishPlan colorFinishPlan;

    public SedanCar(ColorFinishPlan colorFinishPlan){
        this.colorFinishPlan = colorFinishPlan;
    }

    @Override
    public void paintCar() {
        this.colorFinishPlan.paint();
    }
}
