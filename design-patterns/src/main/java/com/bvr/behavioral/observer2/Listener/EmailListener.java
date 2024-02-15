package com.bvr.behavioral.observer2.Listener;

import com.bvr.behavioral.observer2.Listener.EventListener;
public class EmailListener implements EventListener{
    @Override
    public void notify(String data) {
        System.out.println("Email sent: " + data);
    }

}
