package com.bvr.structural.decorator.decorators;

import com.bvr.structural.decorator.Notifier;
public class EmailDecorator extends BaseDecorator{

        public EmailDecorator(Notifier notifier) {
            super(notifier);
        }

        @Override
        public void sendMessage(String message) {
            super.sendMessage(message);
            System.out.println("Sending email: " + message);
        }
}
