package com.bvr.creational.abstractfactory.factories;

import com.bvr.creational.abstractfactory.shoes.RunningShoe;
import com.bvr.creational.abstractfactory.shoes.TrackRunningShoe;
import com.bvr.creational.abstractfactory.watches.RunningWatch;
import com.bvr.creational.abstractfactory.watches.TrackRunningWatch;

public class TrackRunningGearFactory implements RunningGearFactory {
    @Override
    public RunningWatch createWatch() {
        return new TrackRunningWatch();
    }

    @Override
    public RunningShoe createShoe() {
        return new TrackRunningShoe();
    }
}
