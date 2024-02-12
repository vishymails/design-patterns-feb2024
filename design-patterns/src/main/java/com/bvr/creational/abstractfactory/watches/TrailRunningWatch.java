package com.bvr.creational.abstractfactory.watches;

public class TrailRunningWatch implements RunningWatch{
    @Override
    public void trackRun() {
        System.out.println("Tracking run on trail- Suunto 9");
    }
}
