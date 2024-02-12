package com.bvr.creational.abstractfactory;

import com.bvr.creational.abstractfactory.factories.RunningGearFactory;
import com.bvr.creational.abstractfactory.factories.TrailRunningGearFactory;
import com.bvr.creational.abstractfactory.shoes.RunningShoe;
import com.bvr.creational.abstractfactory.watches.RunningWatch;
import com.bvr.creational.abstractfactory.factories.RoadRunningGearFactory;
import com.bvr.creational.abstractfactory.factories.TrackRunningGearFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        RunningGearFactory trailRunningGearFactory = new TrailRunningGearFactory();
        RunningShoe trailRunningShoe = trailRunningGearFactory.createShoe();
        RunningWatch trailRunningWatch = trailRunningGearFactory.createWatch();
        trailRunningShoe.run();
        trailRunningWatch.trackRun();

        System.out.println("=====================================");

        RunningGearFactory roadRunningGearFactory = new RoadRunningGearFactory();
        RunningShoe roadRunningShoe = roadRunningGearFactory.createShoe();
        RunningWatch roadRunningWatch = roadRunningGearFactory.createWatch();
        roadRunningShoe.run();
        roadRunningWatch.trackRun();

        System.out.println("=====================================");

        RunningGearFactory trackRunningGearFactory = new TrackRunningGearFactory();
        RunningShoe trackRunningShoe = trackRunningGearFactory.createShoe();
        RunningWatch trackRunningWatch = trackRunningGearFactory.createWatch();
        trackRunningShoe.run();
        trackRunningWatch.trackRun();

        System.out.println("=====================================");

    }
}
