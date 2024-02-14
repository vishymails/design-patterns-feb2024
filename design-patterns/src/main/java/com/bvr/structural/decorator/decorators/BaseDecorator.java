package com.bvr.structural.decorator.decorators;

import com.bvr.structural.decorator.Notifier;
public class BaseDecorator implements Notifier{

    private Notifier notifier;

    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message);
    }
}
