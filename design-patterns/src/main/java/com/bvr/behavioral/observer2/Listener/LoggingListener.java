package com.bvr.behavioral.observer2.Listener;

public class LoggingListener implements EventListener  {
    @Override
    public void notify(String data) {
        System.out.println("Logging: " + data);
    }
}
