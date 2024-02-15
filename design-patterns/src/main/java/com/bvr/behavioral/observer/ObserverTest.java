package com.bvr.behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");

        stockMarket.attach(investor1);
        stockMarket.attach(investor2);

        stockMarket.setPrice(100);
        stockMarket.setPrice(200);

        stockMarket.detach(investor1);

        stockMarket.setPrice(300);

    }
}
