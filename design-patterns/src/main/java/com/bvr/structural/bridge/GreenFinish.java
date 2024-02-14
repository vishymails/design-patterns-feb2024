package com.bvr.structural.bridge;

public class GreenFinish implements ColorFinishPlan{
    @Override
    public void paint() {
        this.chooseColor();
        this.startPaintMachine();
        System.out.println("Painting the car with Green color");
    }

    @Override
    public void chooseColor() {
        System.out.println("Choosing Green color");
    }

    @Override
    public void startPaintMachine() {
        System.out.println("Starting the Green paint machine");
    }
}
