package com.bvr.structural.decorator.decorators;

import com.bvr.structural.decorator.Notifier;
public class SlackDecorator extends BaseDecorator{

            public SlackDecorator(Notifier notifier) {
                super(notifier);
            }

            @Override
            public void sendMessage(String message) {
                super.sendMessage(message);
                System.out.println("Sending slack: " + message);
            }
}
