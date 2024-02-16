package com.bvr.behavioral.strategy;

public class TempoRunStrategy implements RunStrategy{

        public void performRun(int distance){
            System.out.println("Running " + distance + " meters at a tempo pace");
        }
}
