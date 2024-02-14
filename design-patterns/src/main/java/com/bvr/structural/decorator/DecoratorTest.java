package com.bvr.structural.decorator;

import com.bvr.structural.decorator.decorators.EmailDecorator;
import com.bvr.structural.decorator.decorators.SlackDecorator;
import com.bvr.structural.decorator.decorators.SmsDecorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new Notification();


        Notifier notifierWithSlack = new SlackDecorator(notifier);
        Notifier notifierWithSlackAndEmail = new EmailDecorator(notifierWithSlack);
        Notifier notifierWithSlackAndEmailAndSMS = new SmsDecorator(notifierWithSlackAndEmail);

//        notifier.sendMessage("Hello All");
//        notifierWithSlack.sendMessage("Hello All");
//        notifierWithSlackAndEmail.sendMessage("Hello All");
        notifierWithSlackAndEmailAndSMS.sendMessage("Hello All");

    }
}
