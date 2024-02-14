package com.bvr.structural.bridge;

public class LuxuryCar implements CarPlan{
    private ColorFinishPlan colorFinishPlan;

    public LuxuryCar(ColorFinishPlan colorFinishPlan){
        this.colorFinishPlan = colorFinishPlan;
    }

    @Override
    public void paintCar() {
        this.colorFinishPlan.paint();
    }
}
