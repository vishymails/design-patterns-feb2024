package com.bvr.creational.abstractfactory.factories;

import com.bvr.creational.abstractfactory.shoes.RoadRunningShoe;
import com.bvr.creational.abstractfactory.shoes.RunningShoe;
import com.bvr.creational.abstractfactory.watches.RoadRunningWatch;
import com.bvr.creational.abstractfactory.watches.RunningWatch;

public class RoadRunningGearFactory implements RunningGearFactory{
    @Override
    public RunningWatch createWatch() {
        return new RoadRunningWatch();
    }

    @Override
    public RunningShoe createShoe() {
        return new RoadRunningShoe();
    }

}
