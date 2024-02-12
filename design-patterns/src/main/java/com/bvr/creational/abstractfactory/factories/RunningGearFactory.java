package com.bvr.creational.abstractfactory.factories;

import com.bvr.creational.abstractfactory.shoes.RunningShoe;
import com.bvr.creational.abstractfactory.watches.RunningWatch;

public interface RunningGearFactory {
    RunningWatch createWatch();
    RunningShoe createShoe();

}
