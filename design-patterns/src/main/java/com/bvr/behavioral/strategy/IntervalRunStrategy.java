package com.bvr.behavioral.strategy;

public class IntervalRunStrategy implements RunStrategy{

        public void performRun(int distance){
            System.out.println("Running " + distance + " meters at an interval pace");
        }

}
