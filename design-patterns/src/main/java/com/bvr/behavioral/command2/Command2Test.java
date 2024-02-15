package com.bvr.behavioral.command2;

//Client
public class Command2Test {

    public static void main(String[] args) {
        Device radio = new Device("Radio");
        Command turnOnRadio = new TurnOnCommand(radio);
        RemoteControl control = new RemoteControl();
        control.setCommand(turnOnRadio);
        control.pressButton();
    }
}
