package com.bvr.behavioral.strategy;

public class Runner {
    private String name;
    private RunStrategy runStrategy;

    public Runner(String name){
        this.name = name;
    }

    public void setRunStrategy(RunStrategy runStrategy){
        this.runStrategy = runStrategy;
    }

    public void run(int distance){
        System.out.println(name + " is running " + distance + " meters");
        runStrategy.performRun(distance);
    }


}
