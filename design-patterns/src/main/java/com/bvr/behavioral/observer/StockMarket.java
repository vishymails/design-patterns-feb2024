package com.bvr.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Subject{
    private double price;
    private List<Observer> observers = new ArrayList<>();


    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(price));
    }


}
