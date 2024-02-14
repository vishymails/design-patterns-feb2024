package com.bvr.structural.decorator.decorators;

import com.bvr.structural.decorator.Notifier;
public class SmsDecorator extends BaseDecorator{

        public SmsDecorator(Notifier notifier) {
            super(notifier);
        }

        @Override
        public void sendMessage(String message) {
            super.sendMessage(message);
            System.out.println("Sending sms: " + message);
        }
}
