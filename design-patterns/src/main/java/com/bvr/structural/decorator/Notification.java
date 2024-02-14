package com.bvr.structural.decorator;

public class Notification implements Notifier  {

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending notification: " + message);
        }
}
