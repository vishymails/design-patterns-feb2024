package com.bvr.creational.abstractfactory.watches;

public class RoadRunningWatch implements   RunningWatch {
    @Override
    public void trackRun() {
        System.out.println("Tracking run on road- Apple Watch series 5");
    }
}
