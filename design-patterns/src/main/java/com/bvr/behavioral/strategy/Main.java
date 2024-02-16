package com.bvr.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner("Moncef");
        runner.setRunStrategy(new EasyRunStrategy());
        runner.run(1000);

        runner.setRunStrategy(new IntervalRunStrategy());
        runner.run(10000);

        runner.setRunStrategy(new TempoRunStrategy());
        runner.run(5000);

    }
}
