package com.bvr.creational.abstractfactory.watches;

public class TrackRunningWatch implements RunningWatch {
    @Override
    public void trackRun() {
        System.out.println("Tracking run on track- Gramin Forerunner 5");
    }
}
