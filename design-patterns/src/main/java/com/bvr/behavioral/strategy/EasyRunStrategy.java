package com.bvr.behavioral.strategy;

public class EasyRunStrategy implements RunStrategy{

    public void performRun(int distance){
        System.out.println("Running " + distance + " meters at an easy pace");
    }
}
