package com.bvr.behavioral.observer;

public class Investor implements Observer  {
    private String name;

    public Investor(String name){
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Notified " + name + " of price change to " + price);
    }

}
