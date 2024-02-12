package com.bvr.creational.abstractfactory.factories;

import com.bvr.creational.abstractfactory.shoes.RunningShoe;
import com.bvr.creational.abstractfactory.shoes.TrailRunningShoe;
import com.bvr.creational.abstractfactory.watches.RunningWatch;
import com.bvr.creational.abstractfactory.watches.TrailRunningWatch;

public class TrailRunningGearFactory implements RunningGearFactory {
    @Override
    public RunningWatch createWatch() {
        return new TrailRunningWatch();
    }

    @Override
    public RunningShoe createShoe() {
        return new TrailRunningShoe();
    }

}
