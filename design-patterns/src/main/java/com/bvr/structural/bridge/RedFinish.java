package com.bvr.structural.bridge;

public class RedFinish implements ColorFinishPlan{
    @Override
    public void paint() {
        this.chooseColor();
        this.startPaintMachine();
        System.out.println("Painting the car with Red color");
    }

    @Override
    public void chooseColor() {
        System.out.println("Choosing Red color");
    }

    @Override
    public void startPaintMachine() {
        System.out.println("Starting the Red paint machine");
    }
}
